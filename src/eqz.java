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

public class eqz {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final vd h = vd.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   eqz(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<eqz> a(String $$0) {
      List<eqz> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static eqz a(JsonObject $$0) {
      UUID $$1 = etm.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = etm.a("dismissable", $$0, true);
         boolean $$3 = etm.a("seen", $$0, false);
         String $$4 = etm.a("type", $$0);
         eqz $$5 = new eqz($$1, $$2, $$3, $$4);

         return (eqz)(switch ($$4) {
            case "visitUrl" -> eqz.c.a($$5, $$0);
            case "infoPopup" -> eqz.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends eqz {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final erg e;
      private final erg f;
      private final ahd g;
      @Nullable
      private final eqz.b h;

      private a(eqz $$0, erg $$1, erg $$2, ahd $$3, @Nullable eqz.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static eqz.a a(eqz $$0, JsonObject $$1) {
         erg $$2 = etm.a("title", $$1, erg::a);
         erg $$3 = etm.a("message", $$1, erg::a);
         ahd $$4 = new ahd(etm.a("image", $$1));
         eqz.b $$5 = etm.b("urlButton", $$1, eqz.b::a);
         return new eqz.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public eya a(fct $$0, Consumer<UUID> $$1) {
         vd $$2 = this.e.a();
         if ($$2 == null) {
            eqz.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            eya.a $$3 = new eya.a($$0, $$2).a(this.g).a(this.f.a(vc.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(eqz.h), $$2x -> {
                  eva $$3x = eva.N();
                  $$3x.a(new fbl($$3xx -> {
                     if ($$3xx) {
                        ac.i().a(this.h.a);
                        $$3x.a($$0);
                     } else {
                        $$3x.a($$2x);
                     }
                  }, this.h.a, true));
                  $$1.accept(this.c());
               });
            }

            $$3.a(vc.h, $$1x -> {
               $$1x.aE_();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, erg b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static eqz.b a(JsonObject $$0) {
         String $$1 = etm.a("url", $$0);
         erg $$2 = etm.a("urlText", $$0, erg::a);
         return new eqz.b($$1, $$2);
      }
   }

   public static class c extends eqz {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final erg e;
      private final erg f;

      private c(eqz $$0, String $$1, erg $$2, erg $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static eqz.c a(eqz $$0, JsonObject $$1) {
         String $$2 = etm.a("url", $$1);
         erg $$3 = etm.a("buttonText", $$1, erg::a);
         erg $$4 = etm.a("message", $$1, erg::a);
         return new eqz.c($$0, $$2, $$3, $$4);
      }

      public vd d() {
         return this.f.a(vd.c("mco.notification.visitUrl.message.default"));
      }

      public ewy a(fct $$0) {
         vd $$1 = this.e.a(eqz.h);
         return ewy.a($$1, fbl.b($$0, this.d)).a();
      }
   }
}
