import com.google.common.base.Strings;
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
import java.util.Base64;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aqk implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final AtomicInteger b = new AtomicInteger(1);
   private static final ThreadFactory c = $$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Chat-Filter-Worker-" + b.getAndIncrement());
      return $$1;
   };
   private static final String d = "v1/chat";
   private final URL e;
   private final aqk.c f;
   final URL g;
   final aqk.b h;
   final URL i;
   final aqk.b j;
   private final String k;
   final aqk.a l;
   final ExecutorService m;

   private aqk(URL $$0, aqk.c $$1, URL $$2, aqk.b $$3, URL $$4, aqk.b $$5, String $$6, aqk.a $$7, int $$8) {
      this.k = $$6;
      this.l = $$7;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = $$4;
      this.j = $$5;
      this.m = Executors.newFixedThreadPool($$8, c);
   }

   private static URL a(URI $$0, @Nullable JsonObject $$1, String $$2, String $$3) throws MalformedURLException {
      String $$4 = a($$1, $$2, $$3);
      return $$0.resolve("/" + $$4).toURL();
   }

   private static String a(@Nullable JsonObject $$0, String $$1, String $$2) {
      return $$0 != null ? awm.a($$0, $$1, $$2) : $$2;
   }

   @Nullable
   public static aqk a(String $$0) {
      if (Strings.isNullOrEmpty($$0)) {
         return null;
      } else {
         try {
            JsonObject $$1 = awm.a($$0);
            URI $$2 = new URI(awm.i($$1, "apiServer"));
            String $$3 = awm.i($$1, "apiKey");
            if ($$3.isEmpty()) {
               throw new IllegalArgumentException("Missing API key");
            } else {
               int $$4 = awm.a($$1, "ruleId", 1);
               String $$5 = awm.a($$1, "serverId", "");
               String $$6 = awm.a($$1, "roomId", "Java:Chat");
               int $$7 = awm.a($$1, "hashesToDrop", -1);
               int $$8 = awm.a($$1, "maxConcurrentRequests", 7);
               JsonObject $$9 = awm.a($$1, "endpoints", null);
               String $$10 = a($$9, "chat", "v1/chat");
               boolean $$11 = $$10.equals("v1/chat");
               URL $$12 = $$2.resolve("/" + $$10).toURL();
               URL $$13 = a($$2, $$9, "join", "v1/join");
               URL $$14 = a($$2, $$9, "leave", "v1/leave");
               aqk.b $$15 = $$2x -> {
                  JsonObject $$3x = new JsonObject();
                  $$3x.addProperty("server", $$5);
                  $$3x.addProperty("room", $$6);
                  $$3x.addProperty("user_id", $$2x.getId().toString());
                  $$3x.addProperty("user_display_name", $$2x.getName());
                  return $$3x;
               };
               aqk.c $$16;
               if ($$11) {
                  $$16 = ($$3x, $$4x) -> {
                     JsonObject $$5x = new JsonObject();
                     $$5x.addProperty("rule", $$4);
                     $$5x.addProperty("server", $$5);
                     $$5x.addProperty("room", $$6);
                     $$5x.addProperty("player", $$3x.getId().toString());
                     $$5x.addProperty("player_display_name", $$3x.getName());
                     $$5x.addProperty("text", $$4x);
                     $$5x.addProperty("language", "*");
                     return $$5x;
                  };
               } else {
                  String $$17 = String.valueOf($$4);
                  $$16 = ($$3x, $$4x) -> {
                     JsonObject $$5x = new JsonObject();
                     $$5x.addProperty("rule_id", $$17);
                     $$5x.addProperty("category", $$5);
                     $$5x.addProperty("subcategory", $$6);
                     $$5x.addProperty("user_id", $$3x.getId().toString());
                     $$5x.addProperty("user_display_name", $$3x.getName());
                     $$5x.addProperty("text", $$4x);
                     $$5x.addProperty("language", "*");
                     return $$5x;
                  };
               }

               aqk.a $$19 = aqk.a.select($$7);
               String $$20 = Base64.getEncoder().encodeToString($$3.getBytes(StandardCharsets.US_ASCII));
               return new aqk($$12, $$16, $$13, $$15, $$14, $$15, $$20, $$19, $$8);
            }
         } catch (Exception var19) {
            a.warn("Failed to parse chat filter config {}", $$0, var19);
            return null;
         }
      }
   }

   void a(GameProfile $$0, URL $$1, aqk.b $$2, Executor $$3) {
      $$3.execute(() -> {
         JsonObject $$3x = $$2.encode($$0);

         try {
            this.b($$3x, $$1);
         } catch (Exception var6) {
            a.warn("Failed to send join/leave packet to {} for player {}", new Object[]{$$1, $$0, var6});
         }
      });
   }

   CompletableFuture<apw> a(GameProfile $$0, String $$1, aqk.a $$2, Executor $$3) {
      return $$1.isEmpty() ? CompletableFuture.completedFuture(apw.a) : CompletableFuture.supplyAsync(() -> {
         JsonObject $$3x = this.f.encode($$0, $$1);

         try {
            JsonObject $$4 = this.a($$3x, this.e);
            boolean $$5 = awm.a($$4, "response", false);
            if ($$5) {
               return apw.a($$1);
            } else {
               String $$6 = awm.a($$4, "hashed", null);
               if ($$6 == null) {
                  return apw.b($$1);
               } else {
                  JsonArray $$7 = awm.v($$4, "hashes");
                  vy $$8 = this.a($$1, $$7, $$2);
                  return new apw($$1, $$8);
               }
            }
         } catch (Exception var10) {
            a.warn("Failed to validate message '{}'", $$1, var10);
            return apw.b($$1);
         }
      }, $$3);
   }

   private vy a(String $$0, JsonArray $$1, aqk.a $$2) {
      if ($$1.isEmpty()) {
         return vy.c;
      } else if ($$2.shouldIgnore($$0, $$1.size())) {
         return vy.b;
      } else {
         vy $$3 = new vy($$0.length());

         for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
            $$3.a($$1.get($$4).getAsInt());
         }

         return $$3;
      }
   }

   @Override
   public void close() {
      this.m.shutdownNow();
   }

   private void a(InputStream $$0) throws IOException {
      byte[] $$1 = new byte[1024];

      while ($$0.read($$1) != -1) {
      }
   }

   private JsonObject a(JsonObject $$0, URL $$1) throws IOException {
      HttpURLConnection $$2 = this.c($$0, $$1);

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

   private void b(JsonObject $$0, URL $$1) throws IOException {
      HttpURLConnection $$2 = this.c($$0, $$1);

      try (InputStream $$3 = $$2.getInputStream()) {
         this.a($$3);
      }
   }

   private HttpURLConnection c(JsonObject $$0, URL $$1) throws IOException {
      HttpURLConnection $$2 = (HttpURLConnection)$$1.openConnection();
      $$2.setConnectTimeout(15000);
      $$2.setReadTimeout(2000);
      $$2.setUseCaches(false);
      $$2.setDoOutput(true);
      $$2.setDoInput(true);
      $$2.setRequestMethod("POST");
      $$2.setRequestProperty("Content-Type", "application/json; charset=utf-8");
      $$2.setRequestProperty("Accept", "application/json");
      $$2.setRequestProperty("Authorization", "Basic " + this.k);
      $$2.setRequestProperty("User-Agent", "Minecraft server" + aa.b().c());
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
         throw new aqk.e($$5 + " " + $$2.getResponseMessage());
      }
   }

   public aqj a(GameProfile $$0) {
      return new aqk.d($$0);
   }

   @FunctionalInterface
   public interface a {
      aqk.a a = ($$0, $$1) -> false;
      aqk.a b = ($$0, $$1) -> $$0.length() == $$1;

      static aqk.a ignoreOverThreshold(int $$0) {
         return ($$1, $$2) -> $$2 >= $$0;
      }

      static aqk.a select(int $$0) {
         return switch ($$0) {
            case -1 -> a;
            case 0 -> b;
            default -> ignoreOverThreshold($$0);
         };
      }

      boolean shouldIgnore(String var1, int var2);
   }

   @FunctionalInterface
   interface b {
      JsonObject encode(GameProfile var1);
   }

   @FunctionalInterface
   interface c {
      JsonObject encode(GameProfile var1, String var2);
   }

   class d implements aqj {
      private final GameProfile c;
      private final Executor d;

      d(GameProfile $$0) {
         this.c = $$0;
         blv<Runnable> $$1 = blv.a(aqk.this.m, "chat stream for " + $$0.getName());
         this.d = $$1::a;
      }

      @Override
      public void a() {
         aqk.this.a(this.c, aqk.this.g, aqk.this.h, this.d);
      }

      @Override
      public void b() {
         aqk.this.a(this.c, aqk.this.i, aqk.this.j, this.d);
      }

      @Override
      public CompletableFuture<List<apw>> a(List<String> $$0) {
         List<CompletableFuture<apw>> $$1 = $$0.stream().map($$0x -> aqk.this.a(this.c, $$0x, aqk.this.l, this.d)).collect(ImmutableList.toImmutableList());
         return ac.e($$1).exceptionally($$0x -> ImmutableList.of());
      }

      @Override
      public CompletableFuture<apw> a(String $$0) {
         return aqk.this.a(this.c, $$0, aqk.this.l, this.d);
      }
   }

   public static class e extends RuntimeException {
      e(String $$0) {
         super($$0);
      }
   }
}
