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

public class flt {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final wy h = wy.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   flt(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<flt> a(String $$0) {
      List<flt> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static flt a(JsonObject $$0) {
      UUID $$1 = foe.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = foe.a("dismissable", $$0, true);
         boolean $$3 = foe.a("seen", $$0, false);
         String $$4 = foe.a("type", $$0);
         flt $$5 = new flt($$1, $$2, $$3, $$4);

         return (flt)(switch ($$4) {
            case "visitUrl" -> flt.c.a($$5, $$0);
            case "infoPopup" -> flt.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends flt {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final flz e;
      private final flz f;
      private final alg g;
      @Nullable
      private final flt.b h;

      private a(flt $$0, flz $$1, flz $$2, alg $$3, @Nullable flt.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static flt.a a(flt $$0, JsonObject $$1) {
         flz $$2 = foe.a("title", $$1, flz::a);
         flz $$3 = foe.a("message", $$1, flz::a);
         alg $$4 = alg.a(foe.a("image", $$1));
         flt.b $$5 = foe.b("urlButton", $$1, flt.b::a);
         return new flt.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fuc a(fys $$0, Consumer<UUID> $$1) {
         wy $$2 = this.e.a();
         if ($$2 == null) {
            flt.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fuc.a $$3 = new fuc.a($$0, $$2).a(this.g).a(this.f.a(wx.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(flt.h), $$2x -> {
                  fpt $$3x = fpt.Q();
                  $$3x.a(new fxp($$3xx -> {
                     if ($$3xx) {
                        ag.n().a(this.h.a);
                        $$3x.a($$0);
                     } else {
                        $$3x.a($$2x);
                     }
                  }, this.h.a, true));
                  $$1.accept(this.c());
               });
            }

            $$3.a(wx.h, $$1x -> {
               $$1x.aL_();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, flz b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static flt.b a(JsonObject $$0) {
         String $$1 = foe.a("url", $$0);
         flz $$2 = foe.a("urlText", $$0, flz::a);
         return new flt.b($$1, $$2);
      }
   }

   public static class c extends flt {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final flz e;
      private final flz f;

      private c(flt $$0, String $$1, flz $$2, flz $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static flt.c a(flt $$0, JsonObject $$1) {
         String $$2 = foe.a("url", $$1);
         flz $$3 = foe.a("buttonText", $$1, flz::a);
         flz $$4 = foe.a("message", $$1, flz::a);
         return new flt.c($$0, $$2, $$3, $$4);
      }

      public wy d() {
         return this.f.a(wy.c("mco.notification.visitUrl.message.default"));
      }

      public fta a(fys $$0) {
         wy $$1 = this.e.a(flt.h);
         return fta.a($$1, fxp.b($$0, this.d)).a();
      }
   }
}
