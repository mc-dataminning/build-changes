import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eyt {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final ws h = ws.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   eyt(UUID $$0, boolean $$1, boolean $$2, String $$3) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.l = $$3;
   }

   public boolean a() {
      return this.k;
   }

   public boolean b() {
      return this.j;
   }

   public UUID c() {
      return this.i;
   }

   public static List<eyt> a(String $$0) {
      List<eyt> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static eyt a(JsonObject $$0) {
      UUID $$1 = fbg.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fbg.a("dismissable", $$0, true);
         boolean $$3 = fbg.a("seen", $$0, false);
         String $$4 = fbg.a("type", $$0);
         eyt $$5 = new eyt($$1, $$2, $$3, $$4);

         return (eyt)(switch ($$4) {
            case "visitUrl" -> eyt.c.a($$5, $$0);
            case "infoPopup" -> eyt.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends eyt {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final eza e;
      private final eza f;
      private final akf g;
      @Nullable
      private final eyt.b h;

      private a(eyt $$0, eza $$1, eza $$2, akf $$3, @Nullable eyt.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static eyt.a a(eyt $$0, JsonObject $$1) {
         eza $$2 = fbg.a("title", $$1, eza::a);
         eza $$3 = fbg.a("message", $$1, eza::a);
         akf $$4 = new akf(fbg.a("image", $$1));
         eyt.b $$5 = fbg.b("urlButton", $$1, eyt.b::a);
         return new eyt.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public ffw a(fkt $$0, Consumer<UUID> $$1) {
         ws $$2 = this.e.a();
         if ($$2 == null) {
            eyt.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            ffw.a $$3 = new ffw.a($$0, $$2).a(this.g).a(this.f.a(wr.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(eyt.h), $$2x -> {
                  fcu $$3x = fcu.Q();
                  $$3x.a(new fjk($$3xx -> {
                     if ($$3xx) {
                        ac.j().a(this.h.a);
                        $$3x.a($$0);
                     } else {
                        $$3x.a($$2x);
                     }
                  }, this.h.a, true));
                  $$1.accept(this.c());
               });
            }

            $$3.a(wr.h, $$1x -> {
               $$1x.d();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, eza b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static eyt.b a(JsonObject $$0) {
         String $$1 = fbg.a("url", $$0);
         eza $$2 = fbg.a("urlText", $$0, eza::a);
         return new eyt.b($$1, $$2);
      }
   }

   public static class c extends eyt {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final eza e;
      private final eza f;

      private c(eyt $$0, String $$1, eza $$2, eza $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static eyt.c a(eyt $$0, JsonObject $$1) {
         String $$2 = fbg.a("url", $$1);
         eza $$3 = fbg.a("buttonText", $$1, eza::a);
         eza $$4 = fbg.a("message", $$1, eza::a);
         return new eyt.c($$0, $$2, $$3, $$4);
      }

      public ws d() {
         return this.f.a(ws.c("mco.notification.visitUrl.message.default"));
      }

      public feu a(fkt $$0) {
         ws $$1 = this.e.a(eyt.h);
         return feu.a($$1, fjk.b($$0, this.d)).a();
      }
   }
}
