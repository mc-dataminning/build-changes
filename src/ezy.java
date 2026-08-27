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

public class ezy {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final wx h = wx.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   ezy(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<ezy> a(String $$0) {
      List<ezy> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static ezy a(JsonObject $$0) {
      UUID $$1 = fcl.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fcl.a("dismissable", $$0, true);
         boolean $$3 = fcl.a("seen", $$0, false);
         String $$4 = fcl.a("type", $$0);
         ezy $$5 = new ezy($$1, $$2, $$3, $$4);

         return (ezy)(switch ($$4) {
            case "visitUrl" -> ezy.c.a($$5, $$0);
            case "infoPopup" -> ezy.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends ezy {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final faf e;
      private final faf f;
      private final akm g;
      @Nullable
      private final ezy.b h;

      private a(ezy $$0, faf $$1, faf $$2, akm $$3, @Nullable ezy.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static ezy.a a(ezy $$0, JsonObject $$1) {
         faf $$2 = fcl.a("title", $$1, faf::a);
         faf $$3 = fcl.a("message", $$1, faf::a);
         akm $$4 = new akm(fcl.a("image", $$1));
         ezy.b $$5 = fcl.b("urlButton", $$1, ezy.b::a);
         return new ezy.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fhb a(fly $$0, Consumer<UUID> $$1) {
         wx $$2 = this.e.a();
         if ($$2 == null) {
            ezy.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fhb.a $$3 = new fhb.a($$0, $$2).a(this.g).a(this.f.a(ww.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(ezy.h), $$2x -> {
                  fdz $$3x = fdz.Q();
                  $$3x.a(new fkp($$3xx -> {
                     if ($$3xx) {
                        ac.k().a(this.h.a);
                        $$3x.a($$0);
                     } else {
                        $$3x.a($$2x);
                     }
                  }, this.h.a, true));
                  $$1.accept(this.c());
               });
            }

            $$3.a(ww.h, $$1x -> {
               $$1x.d();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, faf b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static ezy.b a(JsonObject $$0) {
         String $$1 = fcl.a("url", $$0);
         faf $$2 = fcl.a("urlText", $$0, faf::a);
         return new ezy.b($$1, $$2);
      }
   }

   public static class c extends ezy {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final faf e;
      private final faf f;

      private c(ezy $$0, String $$1, faf $$2, faf $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static ezy.c a(ezy $$0, JsonObject $$1) {
         String $$2 = fcl.a("url", $$1);
         faf $$3 = fcl.a("buttonText", $$1, faf::a);
         faf $$4 = fcl.a("message", $$1, faf::a);
         return new ezy.c($$0, $$2, $$3, $$4);
      }

      public wx d() {
         return this.f.a(wx.c("mco.notification.visitUrl.message.default"));
      }

      public ffz a(fly $$0) {
         wx $$1 = this.e.a(ezy.h);
         return ffz.a($$1, fkp.b($$0, this.d)).a();
      }
   }
}
