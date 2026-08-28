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

public class fnd {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final xa h = xa.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   fnd(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<fnd> a(String $$0) {
      List<fnd> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static fnd a(JsonObject $$0) {
      UUID $$1 = fpp.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fpp.a("dismissable", $$0, true);
         boolean $$3 = fpp.a("seen", $$0, false);
         String $$4 = fpp.a("type", $$0);
         fnd $$5 = new fnd($$1, $$2, $$3, $$4);

         return (fnd)(switch ($$4) {
            case "visitUrl" -> fnd.c.a($$5, $$0);
            case "infoPopup" -> fnd.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends fnd {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final fnj e;
      private final fnj f;
      private final ali g;
      @Nullable
      private final fnd.b h;

      private a(fnd $$0, fnj $$1, fnj $$2, ali $$3, @Nullable fnd.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fnd.a a(fnd $$0, JsonObject $$1) {
         fnj $$2 = fpp.a("title", $$1, fnj::a);
         fnj $$3 = fpp.a("message", $$1, fnj::a);
         ali $$4 = ali.a(fpp.a("image", $$1));
         fnd.b $$5 = fpp.b("urlButton", $$1, fnd.b::a);
         return new fnd.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fvn a(gad $$0, Consumer<UUID> $$1) {
         xa $$2 = this.e.a();
         if ($$2 == null) {
            fnd.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fvn.a $$3 = new fvn.a($$0, $$2).a(this.g).a(this.f.a(wz.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fnd.h), $$2x -> {
                  frd $$3x = frd.Q();
                  $$3x.a(new fza($$3xx -> {
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

            $$3.a(wz.h, $$1x -> {
               $$1x.aP_();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, fnj b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fnd.b a(JsonObject $$0) {
         String $$1 = fpp.a("url", $$0);
         fnj $$2 = fpp.a("urlText", $$0, fnj::a);
         return new fnd.b($$1, $$2);
      }
   }

   public static class c extends fnd {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fnj e;
      private final fnj f;

      private c(fnd $$0, String $$1, fnj $$2, fnj $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fnd.c a(fnd $$0, JsonObject $$1) {
         String $$2 = fpp.a("url", $$1);
         fnj $$3 = fpp.a("buttonText", $$1, fnj::a);
         fnj $$4 = fpp.a("message", $$1, fnj::a);
         return new fnd.c($$0, $$2, $$3, $$4);
      }

      public xa d() {
         return this.f.a(xa.c("mco.notification.visitUrl.message.default"));
      }

      public ful a(gad $$0) {
         xa $$1 = this.e.a(fnd.h);
         return ful.a($$1, fza.b($$0, this.d)).a();
      }
   }
}
