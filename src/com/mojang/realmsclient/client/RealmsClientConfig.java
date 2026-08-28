package com.mojang.realmsclient.client;

import java.net.Proxy;
import org.jspecify.annotations.Nullable;

public class RealmsClientConfig {
   @Nullable
   private static Proxy proxy;

   @Nullable
   public static Proxy getProxy() {
      return proxy;
   }

   public static void setProxy(final Proxy proxy) {
      if (RealmsClientConfig.proxy == null) {
         RealmsClientConfig.proxy = proxy;
      }
   }
}
