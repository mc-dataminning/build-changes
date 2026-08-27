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

public class euj {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final vs h = vs.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   euj(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<euj> a(String $$0) {
      List<euj> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static euj a(JsonObject $$0) {
      UUID $$1 = eww.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = eww.a("dismissable", $$0, true);
         boolean $$3 = eww.a("seen", $$0, false);
         String $$4 = eww.a("type", $$0);
         euj $$5 = new euj($$1, $$2, $$3, $$4);

         return (euj)(switch ($$4) {
            case "visitUrl" -> euj.c.a($$5, $$0);
            case "infoPopup" -> euj.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends euj {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final euq e;
      private final euq f;
      private final ajc g;
      @Nullable
      private final euj.b h;

      private a(euj $$0, euq $$1, euq $$2, ajc $$3, @Nullable euj.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static euj.a a(euj $$0, JsonObject $$1) {
         euq $$2 = eww.a("title", $$1, euq::a);
         euq $$3 = eww.a("message", $$1, euq::a);
         ajc $$4 = new ajc(eww.a("image", $$1));
         euj.b $$5 = eww.b("urlButton", $$1, euj.b::a);
         return new euj.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fbm a(fgh $$0, Consumer<UUID> $$1) {
         vs $$2 = this.e.a();
         if ($$2 == null) {
            euj.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fbm.a $$3 = new fbm.a($$0, $$2).a(this.g).a(this.f.a(vr.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(euj.h), $$2x -> {
                  eyk $$3x = eyk.P();
                  $$3x.a(new fez($$3xx -> {
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

            $$3.a(vr.h, $$1x -> {
               $$1x.d();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, euq b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static euj.b a(JsonObject $$0) {
         String $$1 = eww.a("url", $$0);
         euq $$2 = eww.a("urlText", $$0, euq::a);
         return new euj.b($$1, $$2);
      }
   }

   public static class c extends euj {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final euq e;
      private final euq f;

      private c(euj $$0, String $$1, euq $$2, euq $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static euj.c a(euj $$0, JsonObject $$1) {
         String $$2 = eww.a("url", $$1);
         euq $$3 = eww.a("buttonText", $$1, euq::a);
         euq $$4 = eww.a("message", $$1, euq::a);
         return new euj.c($$0, $$2, $$3, $$4);
      }

      public vs d() {
         return this.f.a(vs.c("mco.notification.visitUrl.message.default"));
      }

      public fak a(fgh $$0) {
         vs $$1 = this.e.a(euj.h);
         return fak.a($$1, fez.b($$0, this.d)).a();
      }
   }
}
