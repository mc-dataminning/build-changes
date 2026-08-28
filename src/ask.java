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

public class ask extends asw {
   private static final String b = "v1/chat";
   final URL c;
   final ask.a d;
   final URL e;
   final ask.a f;
   private final String g;

   private ask(URL $$0, asw.b $$1, URL $$2, ask.a $$3, URL $$4, ask.a $$5, String $$6, asw.a $$7, ExecutorService $$8) {
      super($$0, $$1, $$7, $$8);
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Nullable
   public static asw a(String $$0) {
      try {
         JsonObject $$1 = aza.a($$0);
         URI $$2 = new URI(aza.i($$1, "apiServer"));
         String $$3 = aza.i($$1, "apiKey");
         if ($$3.isEmpty()) {
            throw new IllegalArgumentException("Missing API key");
         } else {
            int $$4 = aza.a($$1, "ruleId", 1);
            String $$5 = aza.a($$1, "serverId", "");
            String $$6 = aza.a($$1, "roomId", "Java:Chat");
            int $$7 = aza.a($$1, "hashesToDrop", -1);
            int $$8 = aza.a($$1, "maxConcurrentRequests", 7);
            JsonObject $$9 = aza.a($$1, "endpoints", null);
            String $$10 = a($$9, "chat", "v1/chat");
            boolean $$11 = $$10.equals("v1/chat");
            URL $$12 = $$2.resolve("/" + $$10).toURL();
            URL $$13 = a($$2, $$9, "join", "v1/join");
            URL $$14 = a($$2, $$9, "leave", "v1/leave");
            ask.a $$15 = $$2x -> {
               JsonObject $$3x = new JsonObject();
               $$3x.addProperty("server", $$5);
               $$3x.addProperty("room", $$6);
               $$3x.addProperty("user_id", $$2x.getId().toString());
               $$3x.addProperty("user_display_name", $$2x.getName());
               return $$3x;
            };
            asw.b $$16;
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

            asw.a $$19 = asw.a.select($$7);
            ExecutorService $$20 = a($$8);
            String $$21 = Base64.getEncoder().encodeToString($$3.getBytes(StandardCharsets.US_ASCII));
            return new ask($$12, $$16, $$13, $$15, $$14, $$15, $$21, $$19, $$20);
         }
      } catch (Exception var20) {
         a.warn("Failed to parse chat filter config {}", $$0, var20);
         return null;
      }
   }

   @Override
   public asx a(GameProfile $$0) {
      return new asw.c($$0) {
         @Override
         public void a() {
            ask.this.a(this.b, ask.this.c, ask.this.d, this.c);
         }

         @Override
         public void b() {
            ask.this.a(this.b, ask.this.e, ask.this.f, this.c);
         }
      };
   }

   void a(GameProfile $$0, URL $$1, ask.a $$2, Executor $$3) {
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
   protected ash a(String $$0, asw.a $$1, JsonObject $$2) {
      boolean $$3 = aza.a($$2, "response", false);
      if ($$3) {
         return ash.a($$0);
      } else {
         String $$4 = aza.a($$2, "hashed", null);
         if ($$4 == null) {
            return ash.b($$0);
         } else {
            JsonArray $$5 = aza.v($$2, "hashes");
            xa $$6 = this.a($$0, $$5, $$1);
            return new ash($$0, $$6);
         }
      }
   }

   @FunctionalInterface
   interface a {
      JsonObject encode(GameProfile var1);
   }
}
