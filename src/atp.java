import com.google.common.collect.ImmutableList;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class atp implements AutoCloseable {
   protected static final Logger a = LogUtils.getLogger();
   private static final AtomicInteger b = new AtomicInteger(1);
   private static final ThreadFactory c = $$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Chat-Filter-Worker-" + b.getAndIncrement());
      return $$1;
   };
   private final URL d;
   private final atp.b e;
   final atp.a f;
   final ExecutorService g;

   protected static ExecutorService a(int $$0) {
      return Executors.newFixedThreadPool($$0, c);
   }

   protected atp(URL $$0, atp.b $$1, atp.a $$2, ExecutorService $$3) {
      this.f = $$2;
      this.g = $$3;
      this.d = $$0;
      this.e = $$1;
   }

   protected static URL a(URI $$0, @Nullable JsonObject $$1, String $$2, String $$3) throws MalformedURLException {
      String $$4 = a($$1, $$2, $$3);
      return $$0.resolve("/" + $$4).toURL();
   }

   protected static String a(@Nullable JsonObject $$0, String $$1, String $$2) {
      return $$0 != null ? azu.a($$0, $$1, $$2) : $$2;
   }

   @Nullable
   public static atp a(aqz $$0) {
      String $$1 = $$0.R;
      if (bbb.h($$1)) {
         return null;
      } else {
         return switch ($$0.S) {
            case 0 -> atd.a($$1);
            case 1 -> atg.a($$1);
            default -> {
               a.warn("Could not create text filter - unsupported text filtering version used");
               yield null;
            }
         };
      }
   }

   protected CompletableFuture<ata> a(GameProfile $$0, String $$1, atp.a $$2, Executor $$3) {
      return $$1.isEmpty() ? CompletableFuture.completedFuture(ata.a) : CompletableFuture.supplyAsync(() -> {
         JsonObject $$3x = this.e.encode($$0, $$1);

         try {
            JsonObject $$4 = this.b($$3x, this.d);
            return this.a($$1, $$2, $$4);
         } catch (Exception var6) {
            a.warn("Failed to validate message '{}'", $$1, var6);
            return ata.b($$1);
         }
      }, $$3);
   }

   protected abstract ata a(String var1, atp.a var2, JsonObject var3);

   protected xz a(String $$0, JsonArray $$1, atp.a $$2) {
      if ($$1.isEmpty()) {
         return xz.c;
      } else if ($$2.shouldIgnore($$0, $$1.size())) {
         return xz.b;
      } else {
         xz $$3 = new xz($$0.length());

         for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
            $$3.a($$1.get($$4).getAsInt());
         }

         return $$3;
      }
   }

   @Override
   public void close() {
      this.g.shutdownNow();
   }

   protected void a(InputStream $$0) throws IOException {
      byte[] $$1 = new byte[1024];

      while ($$0.read($$1) != -1) {
      }
   }

   private JsonObject b(JsonObject $$0, URL $$1) throws IOException {
      HttpURLConnection $$2 = this.a($$0, $$1);

      JsonObject var5;
      try (InputStream $$3 = $$2.getInputStream()) {
         if ($$2.getResponseCode() == 204) {
            return new JsonObject();
         }

         try {
            var5 = Streams.parse(new JsonReader(new InputStreamReader($$3, StandardCharsets.UTF_8))).getAsJsonObject();
         } finally {
            this.a($$3);
         }
      }

      return var5;
   }

   protected HttpURLConnection a(JsonObject $$0, URL $$1) throws IOException {
      HttpURLConnection $$2 = this.a($$1);
      this.a($$2);
      OutputStreamWriter $$3 = new OutputStreamWriter($$2.getOutputStream(), StandardCharsets.UTF_8);

      try {
         JsonWriter $$4 = new JsonWriter($$3);

         try {
            Streams.write($$0, $$4);
         } catch (Throwable var10) {
            try {
               $$4.close();
            } catch (Throwable var9) {
               var10.addSuppressed(var9);
            }

            throw var10;
         }

         $$4.close();
      } catch (Throwable var11) {
         try {
            $$3.close();
         } catch (Throwable var8) {
            var11.addSuppressed(var8);
         }

         throw var11;
      }

      $$3.close();
      int $$5 = $$2.getResponseCode();
      if ($$5 >= 200 && $$5 < 300) {
         return $$2;
      } else {
         throw new atp.d($$5 + " " + $$2.getResponseMessage());
      }
   }

   protected abstract void a(HttpURLConnection var1);

   protected int a() {
      return 2000;
   }

   protected HttpURLConnection a(URL $$0) throws IOException {
      HttpURLConnection $$1 = (HttpURLConnection)$$0.openConnection();
      $$1.setConnectTimeout(15000);
      $$1.setReadTimeout(this.a());
      $$1.setUseCaches(false);
      $$1.setDoOutput(true);
      $$1.setDoInput(true);
      $$1.setRequestMethod("POST");
      $$1.setRequestProperty("Content-Type", "application/json; charset=utf-8");
      $$1.setRequestProperty("Accept", "application/json");
      $$1.setRequestProperty("User-Agent", "Minecraft server" + ab.b().c());
      return $$1;
   }

   public atq a(GameProfile $$0) {
      return new atp.c($$0);
   }

   @FunctionalInterface
   public interface a {
      atp.a a = ($$0, $$1) -> false;
      atp.a b = ($$0, $$1) -> $$0.length() == $$1;

      static atp.a ignoreOverThreshold(int $$0) {
         return ($$1, $$2) -> $$2 >= $$0;
      }

      static atp.a select(int $$0) {
         return switch ($$0) {
            case -1 -> a;
            case 0 -> b;
            default -> ignoreOverThreshold($$0);
         };
      }

      boolean shouldIgnore(String var1, int var2);
   }

   @FunctionalInterface
   protected interface b {
      JsonObject encode(GameProfile var1, String var2);
   }

   protected class c implements atq {
      protected final GameProfile b;
      protected final Executor c;

      protected c(final GameProfile $$1) {
         this.b = $$1;
         bru $$2 = new bru(atp.this.g, "chat stream for " + $$1.getName());
         this.c = $$2::a_;
      }

      @Override
      public CompletableFuture<List<ata>> a(List<String> $$0) {
         List<CompletableFuture<ata>> $$1 = $$0.stream().map($$0x -> atp.this.a(this.b, $$0x, atp.this.f, this.c)).collect(ImmutableList.toImmutableList());
         return ae.e($$1).exceptionally($$0x -> ImmutableList.of());
      }

      @Override
      public CompletableFuture<ata> a(String $$0) {
         return atp.this.a(this.b, $$0, atp.this.f, this.c);
      }
   }

   protected static class d extends RuntimeException {
      protected d(String $$0) {
         super($$0);
      }
   }
}
