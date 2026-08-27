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

public class epc {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final ur h = ur.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   epc(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<epc> a(String $$0) {
      List<epc> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static epc a(JsonObject $$0) {
      UUID $$1 = erp.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = erp.a("dismissable", $$0, true);
         boolean $$3 = erp.a("seen", $$0, false);
         String $$4 = erp.a("type", $$0);
         epc $$5 = new epc($$1, $$2, $$3, $$4);

         return (epc)(switch ($$4) {
            case "visitUrl" -> epc.c.a($$5, $$0);
            case "infoPopup" -> epc.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends epc {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final epj e;
      private final epj f;
      private final agi g;
      @Nullable
      private final epc.b h;

      private a(epc $$0, epj $$1, epj $$2, agi $$3, @Nullable epc.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static epc.a a(epc $$0, JsonObject $$1) {
         epj $$2 = erp.a("title", $$1, epj::a);
         epj $$3 = erp.a("message", $$1, epj::a);
         agi $$4 = new agi(erp.a("image", $$1));
         epc.b $$5 = erp.b("urlButton", $$1, epc.b::a);
         return new epc.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public ewb a(fau $$0, Consumer<UUID> $$1) {
         ur $$2 = this.e.a();
         if ($$2 == null) {
            epc.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            ewb.a $$3 = new ewb.a($$0, $$2).a(this.g).a(this.f.a(uq.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(epc.h), $$2x -> {
                  etd $$3x = etd.N();
                  $$3x.a(new ezm($$3xx -> {
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

            $$3.a(uq.h, $$1x -> {
               $$1x.aF_();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, epj b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static epc.b a(JsonObject $$0) {
         String $$1 = erp.a("url", $$0);
         epj $$2 = erp.a("urlText", $$0, epj::a);
         return new epc.b($$1, $$2);
      }
   }

   public static class c extends epc {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final epj e;
      private final epj f;

      private c(epc $$0, String $$1, epj $$2, epj $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static epc.c a(epc $$0, JsonObject $$1) {
         String $$2 = erp.a("url", $$1);
         epj $$3 = erp.a("buttonText", $$1, epj::a);
         epj $$4 = erp.a("message", $$1, epj::a);
         return new epc.c($$0, $$2, $$3, $$4);
      }

      public ur d() {
         return this.f.a(ur.c("mco.notification.visitUrl.message.default"));
      }

      public euz a(fau $$0) {
         ur $$1 = this.e.a(epc.h);
         return euz.a($$1, ezm.b($$0, this.d)).a();
      }
   }
}
