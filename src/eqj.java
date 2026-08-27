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

public class eqj {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final vb h = vb.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   eqj(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<eqj> a(String $$0) {
      List<eqj> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static eqj a(JsonObject $$0) {
      UUID $$1 = esw.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = esw.a("dismissable", $$0, true);
         boolean $$3 = esw.a("seen", $$0, false);
         String $$4 = esw.a("type", $$0);
         eqj $$5 = new eqj($$1, $$2, $$3, $$4);

         return (eqj)(switch ($$4) {
            case "visitUrl" -> eqj.c.a($$5, $$0);
            case "infoPopup" -> eqj.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends eqj {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final eqq e;
      private final eqq f;
      private final agt g;
      @Nullable
      private final eqj.b h;

      private a(eqj $$0, eqq $$1, eqq $$2, agt $$3, @Nullable eqj.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static eqj.a a(eqj $$0, JsonObject $$1) {
         eqq $$2 = esw.a("title", $$1, eqq::a);
         eqq $$3 = esw.a("message", $$1, eqq::a);
         agt $$4 = new agt(esw.a("image", $$1));
         eqj.b $$5 = esw.b("urlButton", $$1, eqj.b::a);
         return new eqj.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public exj a(fcc $$0, Consumer<UUID> $$1) {
         vb $$2 = this.e.a();
         if ($$2 == null) {
            eqj.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            exj.a $$3 = new exj.a($$0, $$2).a(this.g).a(this.f.a(va.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(eqj.h), $$2x -> {
                  euk $$3x = euk.N();
                  $$3x.a(new fau($$3xx -> {
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

            $$3.a(va.h, $$1x -> {
               $$1x.aF_();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, eqq b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static eqj.b a(JsonObject $$0) {
         String $$1 = esw.a("url", $$0);
         eqq $$2 = esw.a("urlText", $$0, eqq::a);
         return new eqj.b($$1, $$2);
      }
   }

   public static class c extends eqj {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final eqq e;
      private final eqq f;

      private c(eqj $$0, String $$1, eqq $$2, eqq $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static eqj.c a(eqj $$0, JsonObject $$1) {
         String $$2 = esw.a("url", $$1);
         eqq $$3 = esw.a("buttonText", $$1, eqq::a);
         eqq $$4 = esw.a("message", $$1, eqq::a);
         return new eqj.c($$0, $$2, $$3, $$4);
      }

      public vb d() {
         return this.f.a(vb.c("mco.notification.visitUrl.message.default"));
      }

      public ewh a(fcc $$0) {
         vb $$1 = this.e.a(eqj.h);
         return ewh.a($$1, fau.b($$0, this.d)).a();
      }
   }
}
