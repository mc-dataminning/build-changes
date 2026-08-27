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

public class eph {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final uv h = uv.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   eph(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<eph> a(String $$0) {
      List<eph> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static eph a(JsonObject $$0) {
      UUID $$1 = eru.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = eru.a("dismissable", $$0, true);
         boolean $$3 = eru.a("seen", $$0, false);
         String $$4 = eru.a("type", $$0);
         eph $$5 = new eph($$1, $$2, $$3, $$4);

         return (eph)(switch ($$4) {
            case "visitUrl" -> eph.c.a($$5, $$0);
            case "infoPopup" -> eph.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends eph {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final epo e;
      private final epo f;
      private final agm g;
      @Nullable
      private final eph.b h;

      private a(eph $$0, epo $$1, epo $$2, agm $$3, @Nullable eph.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static eph.a a(eph $$0, JsonObject $$1) {
         epo $$2 = eru.a("title", $$1, epo::a);
         epo $$3 = eru.a("message", $$1, epo::a);
         agm $$4 = new agm(eru.a("image", $$1));
         eph.b $$5 = eru.b("urlButton", $$1, eph.b::a);
         return new eph.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public ewg a(faz $$0, Consumer<UUID> $$1) {
         uv $$2 = this.e.a();
         if ($$2 == null) {
            eph.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            ewg.a $$3 = new ewg.a($$0, $$2).a(this.g).a(this.f.a(uu.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(eph.h), $$2x -> {
                  eti $$3x = eti.N();
                  $$3x.a(new ezr($$3xx -> {
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

            $$3.a(uu.h, $$1x -> {
               $$1x.aG_();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, epo b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static eph.b a(JsonObject $$0) {
         String $$1 = eru.a("url", $$0);
         epo $$2 = eru.a("urlText", $$0, epo::a);
         return new eph.b($$1, $$2);
      }
   }

   public static class c extends eph {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final epo e;
      private final epo f;

      private c(eph $$0, String $$1, epo $$2, epo $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static eph.c a(eph $$0, JsonObject $$1) {
         String $$2 = eru.a("url", $$1);
         epo $$3 = eru.a("buttonText", $$1, epo::a);
         epo $$4 = eru.a("message", $$1, epo::a);
         return new eph.c($$0, $$2, $$3, $$4);
      }

      public uv d() {
         return this.f.a(uv.c("mco.notification.visitUrl.message.default"));
      }

      public eve a(faz $$0) {
         uv $$1 = this.e.a(eph.h);
         return eve.a($$1, ezr.b($$0, this.d)).a();
      }
   }
}
