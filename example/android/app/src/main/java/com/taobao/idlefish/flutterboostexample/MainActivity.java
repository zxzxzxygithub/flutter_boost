package com.taobao.idlefish.flutterboostexample;

import android.os.Bundle;
import android.support.annotation.Nullable;

import java.lang.ref.WeakReference;

public class MainActivity extends FlutterPageActivity {

    public static WeakReference<MainActivity> sRef;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sRef = new WeakReference<>(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        sRef.clear();
        sRef = null;
    }
}
