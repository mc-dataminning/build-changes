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

public class fhl {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final wp h = wp.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   fhl(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<fhl> a(String $$0) {
      List<fhl> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static fhl a(JsonObject $$0) {
      UUID $$1 = fjw.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fjw.a("dismissable", $$0, true);
         boolean $$3 = fjw.a("seen", $$0, false);
         String $$4 = fjw.a("type", $$0);
         fhl $$5 = new fhl($$1, $$2, $$3, $$4);

         return (fhl)(switch ($$4) {
            case "visitUrl" -> fhl.c.a($$5, $$0);
            case "infoPopup" -> fhl.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends fhl {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final fhr e;
      private final fhr f;
      private final akv g;
      @Nullable
      private final fhl.b h;

      private a(fhl $$0, fhr $$1, fhr $$2, akv $$3, @Nullable fhl.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fhl.a a(fhl $$0, JsonObject $$1) {
         fhr $$2 = fjw.a("title", $$1, fhr::a);
         fhr $$3 = fjw.a("message", $$1, fhr::a);
         akv $$4 = akv.a(fjw.a("image", $$1));
         fhl.b $$5 = fjw.b("urlButton", $$1, fhl.b::a);
         return new fhl.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fpw a(fum $$0, Consumer<UUID> $$1) {
         wp $$2 = this.e.a();
         if ($$2 == null) {
            fhl.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fpw.a $$3 = new fpw.a($$0, $$2).a(this.g).a(this.f.a(wo.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fhl.h), $$2x -> {
                  flk $$3x = flk.Q();
                  $$3x.a(new ftj($$3xx -> {
                     if ($$3xx) {
                        af.n().a(this.h.a);
                        $$3x.a($$0);
                     } else {
                        $$3x.a($$2x);
                     }
                  }, this.h.a, true));
                  $$1.accept(this.c());
               });
            }

            $$3.a(wo.h, $$1x -> {
               $$1x.aO_();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, fhr b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fhl.b a(JsonObject $$0) {
         String $$1 = fjw.a("url", $$0);
         fhr $$2 = fjw.a("urlText", $$0, fhr::a);
         return new fhl.b($$1, $$2);
      }
   }

   public static class c extends fhl {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fhr e;
      private final fhr f;

      private c(fhl $$0, String $$1, fhr $$2, fhr $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fhl.c a(fhl $$0, JsonObject $$1) {
         String $$2 = fjw.a("url", $$1);
         fhr $$3 = fjw.a("buttonText", $$1, fhr::a);
         fhr $$4 = fjw.a("message", $$1, fhr::a);
         return new fhl.c($$0, $$2, $$3, $$4);
      }

      public wp d() {
         return this.f.a(wp.c("mco.notification.visitUrl.message.default"));
      }

      public fou a(fum $$0) {
         wp $$1 = this.e.a(fhl.h);
         return fou.a($$1, ftj.b($$0, this.d)).a();
      }
   }
}
