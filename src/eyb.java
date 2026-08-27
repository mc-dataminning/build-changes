import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.Args;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;

public class eyb {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 5;
   private static final String c = "/upload";
   private final File d;
   private final long e;
   private final int f;
   private final ezi g;
   private final String h;
   private final String i;
   private final String j;
   private final String k;
   private final eyh l;
   private final AtomicBoolean m = new AtomicBoolean(false);
   @Nullable
   private CompletableFuture<fba> n;
   private final RequestConfig o = RequestConfig.custom()
      .setSocketTimeout((int)TimeUnit.MINUTES.toMillis(10L))
      .setConnectTimeout((int)TimeUnit.SECONDS.toMillis(15L))
      .build();

   public eyb(File $$0, long $$1, int $$2, ezi $$3, fdj $$4, String $$5, String $$6, eyh $$7) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4.a();
      this.i = $$4.c();
      this.j = $$5;
      this.k = $$6;
      this.l = $$7;
   }

   public void a(Consumer<fba> $$0) {
      if (this.n == null) {
         this.n = CompletableFuture.supplyAsync(() -> this.a(0));
         this.n.thenAccept($$0);
      }
   }

   public void a() {
      this.m.set(true);
      if (this.n != null) {
         this.n.cancel(false);
         this.n = null;
      }
   }

   private fba a(int $$0) {
      fba.a $$1 = new fba.a();
      if (this.m.get()) {
         return $$1.a();
      } else {
         this.l.b = this.d.length();
         HttpPost $$2 = new HttpPost(this.g.b().resolve("/upload/" + this.e + "/" + this.f));
         CloseableHttpClient $$3 = HttpClientBuilder.create().setDefaultRequestConfig(this.o).build();

         fba var8;
         try {
            this.a($$2);
            HttpResponse $$4 = $$3.execute($$2);
            long $$5 = this.a($$4);
            if (!this.a($$5, $$0)) {
               this.a($$4, $$1);
               return $$1.a();
            }

            var8 = this.b($$5, $$0);
         } catch (Exception var12) {
            if (!this.m.get()) {
               a.error("Caught exception while uploading: ", var12);
            }

            return $$1.a();
         } finally {
            this.a($$2, $$3);
         }

         return var8;
      }
   }

   private void a(HttpPost $$0, @Nullable CloseableHttpClient $$1) {
      $$0.releaseConnection();
      if ($$1 != null) {
         try {
            $$1.close();
         } catch (IOException var4) {
            a.error("Failed to close Realms upload client");
         }
      }
   }

   private void a(HttpPost $$0) throws FileNotFoundException {
      $$0.setHeader("Cookie", "sid=" + this.h + ";token=" + this.g.a() + ";user=" + this.i + ";version=" + this.j + ";worldVersion=" + this.k);
      eyb.a $$1 = new eyb.a(new FileInputStream(this.d), this.d.length(), this.l);
      $$1.setContentType("application/octet-stream");
      $$0.setEntity($$1);
   }

   private void a(HttpResponse $$0, fba.a $$1) throws IOException {
      int $$2 = $$0.getStatusLine().getStatusCode();
      if ($$2 == 401) {
         a.debug("Realms server returned 401: {}", $$0.getFirstHeader("WWW-Authenticate"));
      }

      $$1.a($$2);
      if ($$0.getEntity() != null) {
         String $$3 = EntityUtils.toString($$0.getEntity(), "UTF-8");
         if ($$3 != null) {
            try {
               JsonParser $$4 = new JsonParser();
               JsonElement $$5 = $$4.parse($$3).getAsJsonObject().get("errorMsg");
               Optional<String> $$6 = Optional.ofNullable($$5).map(JsonElement::getAsString);
               $$1.a($$6.orElse(null));
            } catch (Exception var8) {
            }
         }
      }
   }

   private boolean a(long $$0, int $$1) {
      return $$0 > 0L && $$1 + 1 < 5;
   }

   private fba b(long $$0, int $$1) throws InterruptedException {
      Thread.sleep(Duration.ofSeconds($$0).toMillis());
      return this.a($$1 + 1);
   }

   private long a(HttpResponse $$0) {
      return Optional.ofNullable($$0.getFirstHeader("Retry-After")).<String>map(NameValuePair::getValue).map(Long::valueOf).orElse(0L);
   }

   public boolean b() {
      return this.n.isDone() || this.n.isCancelled();
   }

   static class a extends InputStreamEntity {
      private final long a;
      private final InputStream b;
      private final eyh c;

      public a(InputStream $$0, long $$1, eyh $$2) {
         super($$0);
         this.b = $$0;
         this.a = $$1;
         this.c = $$2;
      }

      public void writeTo(OutputStream $$0) throws IOException {
         Args.notNull($$0, "Output stream");
         InputStream $$1 = this.b;

         try {
            byte[] $$2 = new byte[4096];
            int $$3;
            if (this.a < 0L) {
               while (($$3 = $$1.read($$2)) != -1) {
                  $$0.write($$2, 0, $$3);
                  this.c.a += (long)$$3;
               }
            } else {
               long $$4 = this.a;

               while ($$4 > 0L) {
                  $$3 = $$1.read($$2, 0, (int)Math.min(4096L, $$4));
                  if ($$3 == -1) {
                     break;
                  }

                  $$0.write($$2, 0, $$3);
                  this.c.a += (long)$$3;
                  $$4 -= (long)$$3;
                  $$0.flush();
               }
            }
         } finally {
            $$1.close();
         }
      }
   }
}
