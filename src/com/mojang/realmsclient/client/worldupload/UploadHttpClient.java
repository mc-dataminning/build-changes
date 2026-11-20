package com.mojang.realmsclient.client.worldupload;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Proxy.Type;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient.Builder;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpResponse.BodyHandler;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import net.minecraft.util.Util;
import org.jspecify.annotations.Nullable;

interface UploadHttpClient extends AutoCloseable {
   static UploadHttpClient create(final @Nullable Proxy proxy) {
      Duration connectTimeout = Duration.ofSeconds(15L);
      if (proxy != null && proxy.type() == Type.SOCKS) {
         return new SocksUploadHttpClient(proxy, connectTimeout);
      }

      Builder builder = HttpClient.newBuilder().executor(Util.nonCriticalIoPool()).connectTimeout(connectTimeout).followRedirects(Redirect.NEVER);
      if (proxy != null) {
         builder.proxy(ProxySelector.of(proxy.type() == Type.HTTP ? (InetSocketAddress)proxy.address() : null));
      }

      final HttpClient client = builder.build();
      return new UploadHttpClient() {
         @Override
         public <T> CompletableFuture<HttpResponse<T>> sendAsync(final HttpRequest request, final BodyHandler<T> handler) {
            return client.sendAsync(request, handler);
         }

         @Override
         public void close() {
            client.close();
         }
      };
   }

   <T> CompletableFuture<HttpResponse<T>> sendAsync(HttpRequest request, BodyHandler<T> handler);

   @Override
   void close();
}
