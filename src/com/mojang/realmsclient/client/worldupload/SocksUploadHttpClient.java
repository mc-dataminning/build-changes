package com.mojang.realmsclient.client.worldupload;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URI;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodySubscriber;
import java.net.http.HttpResponse.BodySubscribers;
import java.net.http.HttpResponse.ResponseInfo;
import java.nio.ByteBuffer;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import net.minecraft.util.Util;
import org.jspecify.annotations.Nullable;

final class SocksUploadHttpClient implements UploadHttpClient {
   private static final Authenticator NO_HTTP_AUTHENTICATION = new Authenticator() {};
   private final Proxy proxy;
   private final Duration connectTimeout;

   public SocksUploadHttpClient(final Proxy proxy, final Duration connectTimeout) {
      this.proxy = proxy;
      this.connectTimeout = connectTimeout;
   }

   @Override
   public <T> CompletableFuture<HttpResponse<T>> sendAsync(final HttpRequest request, final BodyHandler<T> handler) {
      HttpURLConnection connection;
      try {
         connection = (HttpURLConnection)request.uri().toURL().openConnection(this.proxy);
      } catch (IOException failure) {
         return CompletableFuture.failedFuture(failure);
      }

      CompletableFuture<HttpResponse<T>> response = new CompletableFuture<>();
      response.whenComplete((result, failure) -> {
         if (response.isCancelled()) {
            Util.nonCriticalIoPool().execute(connection::disconnect);
         }
      });
      Util.nonCriticalIoPool().execute(() -> {
         try {
            response.complete(this.execute(connection, request, handler, response));
         } catch (Throwable failure) {
            response.completeExceptionally(failure instanceof CompletionException && failure.getCause() != null ? failure.getCause() : failure);
         } finally {
            connection.disconnect();
         }
      });
      return response;
   }

   private <T> HttpResponse<T> execute(
      final HttpURLConnection connection, final HttpRequest request, final BodyHandler<T> handler, final CompletableFuture<?> response
   ) throws IOException {
      Duration timeout = request.timeout().orElse(Duration.ofMinutes(15L));
      connection.setConnectTimeout(timeoutMillis(this.connectTimeout.compareTo(timeout) < 0 ? this.connectTimeout : timeout));
      connection.setReadTimeout(timeoutMillis(timeout));
      connection.setInstanceFollowRedirects(false);
      connection.setUseCaches(false);
      connection.setAuthenticator(NO_HTTP_AUTHENTICATION);
      connection.setRequestMethod(request.method());
      request.headers().map().forEach((name, values) -> values.forEach(value -> connection.addRequestProperty(name, value)));
      BodyPublisher body = request.bodyPublisher().orElse(BodyPublishers.noBody());
      boolean hasBody = body.contentLength() != 0L || "POST".equals(request.method()) || "PUT".equals(request.method());
      if (hasBody) {
         connection.setDoOutput(true);
         if (body.contentLength() >= 0L) {
            connection.setFixedLengthStreamingMode(body.contentLength());
         } else {
            connection.setChunkedStreamingMode(8192);
         }
      }

      connection.connect();
      if (response.isDone()) {
         throw new CancellationException();
      }

      Optional<SSLSession> sslSession = connection instanceof HttpsURLConnection secure ? secure.getSSLSession() : Optional.empty();
      if (hasBody) {
         BodySubscriber<InputStream> subscriber = BodySubscribers.ofInputStream();
         body.subscribe(new SocksUploadHttpClient.ByteSubscriber<>(subscriber));

         try (
            InputStream input = subscriber.getBody().toCompletableFuture().join();
            OutputStream output = connection.getOutputStream();
         ) {
            input.transferTo(output);
         }
      }

      int statusCode = connection.getResponseCode();
      Map<String, List<String>> headers = new HashMap<>();
      connection.getHeaderFields().forEach((name, values) -> {
         if (name != null) {
            headers.put(name, (List<String>)values);
         }
      });
      HttpHeaders responseHeaders = HttpHeaders.of(headers, (name, value) -> true);
      SocksUploadHttpClient.Response<Void> info = new SocksUploadHttpClient.Response<>(statusCode, request, responseHeaders, null, sslSession);
      BodySubscriber<T> subscriber = handler.apply(info);
      InputStream responseBody = statusCode >= 400 ? connection.getErrorStream() : connection.getInputStream();

      try (InputStream input = responseBody == null ? InputStream.nullInputStream() : responseBody) {
         BodyPublishers.ofInputStream(() -> input).subscribe(new SocksUploadHttpClient.ByteSubscriber<>(subscriber));
         return new SocksUploadHttpClient.Response<>(statusCode, request, responseHeaders, subscriber.getBody().toCompletableFuture().join(), sslSession);
      }
   }

   private static int timeoutMillis(final Duration timeout) {
      return (int)Math.clamp(TimeUnit.MILLISECONDS.convert(timeout), 1L, 2147483647L);
   }

   @Override
   public void close() {
   }

   private record ByteSubscriber<T>(BodySubscriber<T> subscriber) implements Subscriber<ByteBuffer> {
      @Override
      public void onSubscribe(final Subscription subscription) {
         this.subscriber.onSubscribe(subscription);
      }

      public void onNext(final ByteBuffer bytes) {
         this.subscriber.onNext(List.of(bytes));
      }

      @Override
      public void onError(final Throwable failure) {
         this.subscriber.onError(failure);
      }

      @Override
      public void onComplete() {
         this.subscriber.onComplete();
      }
   }

   private record Response<T>(int statusCode, HttpRequest request, HttpHeaders headers, @Nullable T body, Optional<SSLSession> sslSession)
      implements HttpResponse<T>,
      ResponseInfo {
      @Override
      public Optional<HttpResponse<T>> previousResponse() {
         return Optional.empty();
      }

      @Override
      public URI uri() {
         return this.request.uri();
      }

      @Override
      public Version version() {
         return Version.HTTP_1_1;
      }
   }
}
