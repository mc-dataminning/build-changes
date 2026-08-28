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

public class fii {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final xv h = xv.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   fii(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<fii> a(String $$0) {
      List<fii> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static fii a(JsonObject $$0) {
      UUID $$1 = fkt.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fkt.a("dismissable", $$0, true);
         boolean $$3 = fkt.a("seen", $$0, false);
         String $$4 = fkt.a("type", $$0);
         fii $$5 = new fii($$1, $$2, $$3, $$4);

         return (fii)(switch ($$4) {
            case "visitUrl" -> fii.c.a($$5, $$0);
            case "infoPopup" -> fii.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends fii {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final fio e;
      private final fio f;
      private final alz g;
      @Nullable
      private final fii.b h;

      private a(fii $$0, fio $$1, fio $$2, alz $$3, @Nullable fii.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fii.a a(fii $$0, JsonObject $$1) {
         fio $$2 = fkt.a("title", $$1, fio::a);
         fio $$3 = fkt.a("message", $$1, fio::a);
         alz $$4 = alz.a(fkt.a("image", $$1));
         fii.b $$5 = fkt.b("urlButton", $$1, fii.b::a);
         return new fii.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fpi a(fty $$0, Consumer<UUID> $$1) {
         xv $$2 = this.e.a();
         if ($$2 == null) {
            fii.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fpi.a $$3 = new fpi.a($$0, $$2).a(this.g).a(this.f.a(xu.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fii.h), $$2x -> {
                  fmg $$3x = fmg.Q();
                  $$3x.a(new fsv($$3xx -> {
                     if ($$3xx) {
                        ae.m().a(this.h.a);
                        $$3x.a($$0);
                     } else {
                        $$3x.a($$2x);
                     }
                  }, this.h.a, true));
                  $$1.accept(this.c());
               });
            }

            $$3.a(xu.h, $$1x -> {
               $$1x.aP_();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, fio b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fii.b a(JsonObject $$0) {
         String $$1 = fkt.a("url", $$0);
         fio $$2 = fkt.a("urlText", $$0, fio::a);
         return new fii.b($$1, $$2);
      }
   }

   public static class c extends fii {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fio e;
      private final fio f;

      private c(fii $$0, String $$1, fio $$2, fio $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fii.c a(fii $$0, JsonObject $$1) {
         String $$2 = fkt.a("url", $$1);
         fio $$3 = fkt.a("buttonText", $$1, fio::a);
         fio $$4 = fkt.a("message", $$1, fio::a);
         return new fii.c($$0, $$2, $$3, $$4);
      }

      public xv d() {
         return this.f.a(xv.c("mco.notification.visitUrl.message.default"));
      }

      public fof a(fty $$0) {
         xv $$1 = this.e.a(fii.h);
         return fof.a($$1, fsv.b($$0, this.d)).a();
      }
   }
}
