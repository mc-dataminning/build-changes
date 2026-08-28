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

public class fcm {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final wz h = wz.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   fcm(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<fcm> a(String $$0) {
      List<fcm> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static fcm a(JsonObject $$0) {
      UUID $$1 = fex.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fex.a("dismissable", $$0, true);
         boolean $$3 = fex.a("seen", $$0, false);
         String $$4 = fex.a("type", $$0);
         fcm $$5 = new fcm($$1, $$2, $$3, $$4);

         return (fcm)(switch ($$4) {
            case "visitUrl" -> fcm.c.a($$5, $$0);
            case "infoPopup" -> fcm.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends fcm {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final fcr e;
      private final fcr f;
      private final akr g;
      @Nullable
      private final fcm.b h;

      private a(fcm $$0, fcr $$1, fcr $$2, akr $$3, @Nullable fcm.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fcm.a a(fcm $$0, JsonObject $$1) {
         fcr $$2 = fex.a("title", $$1, fcr::a);
         fcr $$3 = fex.a("message", $$1, fcr::a);
         akr $$4 = akr.a(fex.a("image", $$1));
         fcm.b $$5 = fex.b("urlButton", $$1, fcm.b::a);
         return new fcm.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fjm a(fob $$0, Consumer<UUID> $$1) {
         wz $$2 = this.e.a();
         if ($$2 == null) {
            fcm.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fjm.a $$3 = new fjm.a($$0, $$2).a(this.g).a(this.f.a(wy.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fcm.h), $$2x -> {
                  fgm $$3x = fgm.Q();
                  $$3x.a(new fmy($$3xx -> {
                     if ($$3xx) {
                        ad.k().a(this.h.a);
                        $$3x.a($$0);
                     } else {
                        $$3x.a($$2x);
                     }
                  }, this.h.a, true));
                  $$1.accept(this.c());
               });
            }

            $$3.a(wy.h, $$1x -> {
               $$1x.d();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, fcr b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fcm.b a(JsonObject $$0) {
         String $$1 = fex.a("url", $$0);
         fcr $$2 = fex.a("urlText", $$0, fcr::a);
         return new fcm.b($$1, $$2);
      }
   }

   public static class c extends fcm {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fcr e;
      private final fcr f;

      private c(fcm $$0, String $$1, fcr $$2, fcr $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fcm.c a(fcm $$0, JsonObject $$1) {
         String $$2 = fex.a("url", $$1);
         fcr $$3 = fex.a("buttonText", $$1, fcr::a);
         fcr $$4 = fex.a("message", $$1, fcr::a);
         return new fcm.c($$0, $$2, $$3, $$4);
      }

      public wz d() {
         return this.f.a(wz.c("mco.notification.visitUrl.message.default"));
      }

      public fik a(fob $$0) {
         wz $$1 = this.e.a(fcm.h);
         return fik.a($$1, fmy.b($$0, this.d)).a();
      }
   }
}
