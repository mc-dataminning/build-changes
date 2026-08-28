import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import javax.annotation.Nullable;

public class ary extends ask {
   private static final String b = "v1/chat";
   final URL c;
   final ary.a d;
   final URL e;
   final ary.a f;
   private final String g;

   private ary(URL $$0, ask.b $$1, URL $$2, ary.a $$3, URL $$4, ary.a $$5, String $$6, ask.a $$7, ExecutorService $$8) {
      super($$0, $$1, $$7, $$8);
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Nullable
   public static ask a(String $$0) {
      try {
         JsonObject $$1 = ayp.a($$0);
         URI $$2 = new URI(ayp.i($$1, "apiServer"));
         String $$3 = ayp.i($$1, "apiKey");
         if ($$3.isEmpty()) {
            throw new IllegalArgumentException("Missing API key");
         } else {
            int $$4 = ayp.a($$1, "ruleId", 1);
            String $$5 = ayp.a($$1, "serverId", "");
            String $$6 = ayp.a($$1, "roomId", "Java:Chat");
            int $$7 = ayp.a($$1, "hashesToDrop", -1);
            int $$8 = ayp.a($$1, "maxConcurrentRequests", 7);
            JsonObject $$9 = ayp.a($$1, "endpoints", null);
            String $$10 = a($$9, "chat", "v1/chat");
            boolean $$11 = $$10.equals("v1/chat");
            URL $$12 = $$2.resolve("/" + $$10).toURL();
            URL $$13 = a($$2, $$9, "join", "v1/join");
            URL $$14 = a($$2, $$9, "leave", "v1/leave");
            ary.a $$15 = $$2x -> {
               JsonObject $$3x = new JsonObject();
               $$3x.addProperty("server", $$5);
               $$3x.addProperty("room", $$6);
               $$3x.addProperty("user_id", $$2x.getId().toString());
               $$3x.addProperty("user_display_name", $$2x.getName());
               return $$3x;
            };
            ask.b $$16;
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

            ask.a $$19 = ask.a.select($$7);
            ExecutorService $$20 = a($$8);
            String $$21 = Base64.getEncoder().encodeToString($$3.getBytes(StandardCharsets.US_ASCII));
            return new ary($$12, $$16, $$13, $$15, $$14, $$15, $$21, $$19, $$20);
         }
      } catch (Exception var20) {
         a.warn("Failed to parse chat filter config {}", $$0, var20);
         return null;
      }
   }

   @Override
   public asl a(GameProfile $$0) {
      return new ask.c($$0) {
         @Override
         public void a() {
            ary.this.a(this.b, ary.this.c, ary.this.d, this.c);
         }

         @Override
         public void b() {
            ary.this.a(this.b, ary.this.e, ary.this.f, this.c);
         }
      };
   }

   void a(GameProfile $$0, URL $$1, ary.a $$2, Executor $$3) {
      $$3.execute(() -> {
         JsonObject $$3x = $$2.encode($$0);

         try {
            this.b($$3x, $$1);
         } catch (Exception var6) {
            a.warn("Failed to send join/leave packet to {} for player {}", new Object[]{$$1, $$0, var6});
         }
      });
   }

   private void b(JsonObject $$0, URL $$1) throws IOException {
      HttpURLConnection $$2 = this.a($$0, $$1);

      try (InputStream $$3 = $$2.getInputStream()) {
         this.a($$3);
      }
   }

   @Override
   protected void a(HttpURLConnection $$0) {
      $$0.setRequestProperty("Authorization", "Basic " + this.g);
   }

   @Override
   protected arv a(String $$0, ask.a $$1, JsonObject $$2) {
      boolean $$3 = ayp.a($$2, "response", false);
      if ($$3) {
         return arv.a($$0);
      } else {
         String $$4 = ayp.a($$2, "hashed", null);
         if ($$4 == null) {
            return arv.b($$0);
         } else {
            JsonArray $$5 = ayp.v($$2, "hashes");
            ws $$6 = this.a($$0, $$5, $$1);
            return new arv($$0, $$6);
         }
      }
   }

   @FunctionalInterface
   interface a {
      JsonObject encode(GameProfile var1);
   }
}
