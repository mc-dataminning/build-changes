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

public class feo {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final xe h = xe.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   feo(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<feo> a(String $$0) {
      List<feo> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static feo a(JsonObject $$0) {
      UUID $$1 = fgz.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fgz.a("dismissable", $$0, true);
         boolean $$3 = fgz.a("seen", $$0, false);
         String $$4 = fgz.a("type", $$0);
         feo $$5 = new feo($$1, $$2, $$3, $$4);

         return (feo)(switch ($$4) {
            case "visitUrl" -> feo.c.a($$5, $$0);
            case "infoPopup" -> feo.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends feo {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final fet e;
      private final fet f;
      private final ale g;
      @Nullable
      private final feo.b h;

      private a(feo $$0, fet $$1, fet $$2, ale $$3, @Nullable feo.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static feo.a a(feo $$0, JsonObject $$1) {
         fet $$2 = fgz.a("title", $$1, fet::a);
         fet $$3 = fgz.a("message", $$1, fet::a);
         ale $$4 = ale.a(fgz.a("image", $$1));
         feo.b $$5 = fgz.b("urlButton", $$1, feo.b::a);
         return new feo.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public flq a(fqh $$0, Consumer<UUID> $$1) {
         xe $$2 = this.e.a();
         if ($$2 == null) {
            feo.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            flq.a $$3 = new flq.a($$0, $$2).a(this.g).a(this.f.a(xd.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(feo.h), $$2x -> {
                  fip $$3x = fip.Q();
                  $$3x.a(new fpe($$3xx -> {
                     if ($$3xx) {
                        ad.m().a(this.h.a);
                        $$3x.a($$0);
                     } else {
                        $$3x.a($$2x);
                     }
                  }, this.h.a, true));
                  $$1.accept(this.c());
               });
            }

            $$3.a(xd.h, $$1x -> {
               $$1x.d();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, fet b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static feo.b a(JsonObject $$0) {
         String $$1 = fgz.a("url", $$0);
         fet $$2 = fgz.a("urlText", $$0, fet::a);
         return new feo.b($$1, $$2);
      }
   }

   public static class c extends feo {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fet e;
      private final fet f;

      private c(feo $$0, String $$1, fet $$2, fet $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static feo.c a(feo $$0, JsonObject $$1) {
         String $$2 = fgz.a("url", $$1);
         fet $$3 = fgz.a("buttonText", $$1, fet::a);
         fet $$4 = fgz.a("message", $$1, fet::a);
         return new feo.c($$0, $$2, $$3, $$4);
      }

      public xe d() {
         return this.f.a(xe.c("mco.notification.visitUrl.message.default"));
      }

      public fko a(fqh $$0) {
         xe $$1 = this.e.a(feo.h);
         return fko.a($$1, fpe.b($$0, this.d)).a();
      }
   }
}
