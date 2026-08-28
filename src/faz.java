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

public class faz {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final xl h = xl.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   faz(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<faz> a(String $$0) {
      List<faz> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static faz a(JsonObject $$0) {
      UUID $$1 = fdm.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fdm.a("dismissable", $$0, true);
         boolean $$3 = fdm.a("seen", $$0, false);
         String $$4 = fdm.a("type", $$0);
         faz $$5 = new faz($$1, $$2, $$3, $$4);

         return (faz)(switch ($$4) {
            case "visitUrl" -> faz.c.a($$5, $$0);
            case "infoPopup" -> faz.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends faz {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final fbg e;
      private final fbg f;
      private final alb g;
      @Nullable
      private final faz.b h;

      private a(faz $$0, fbg $$1, fbg $$2, alb $$3, @Nullable faz.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static faz.a a(faz $$0, JsonObject $$1) {
         fbg $$2 = fdm.a("title", $$1, fbg::a);
         fbg $$3 = fdm.a("message", $$1, fbg::a);
         alb $$4 = new alb(fdm.a("image", $$1));
         faz.b $$5 = fdm.b("urlButton", $$1, faz.b::a);
         return new faz.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fib a(fmy $$0, Consumer<UUID> $$1) {
         xl $$2 = this.e.a();
         if ($$2 == null) {
            faz.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fib.a $$3 = new fib.a($$0, $$2).a(this.g).a(this.f.a(xk.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(faz.h), $$2x -> {
                  ffa $$3x = ffa.Q();
                  $$3x.a(new flp($$3xx -> {
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

            $$3.a(xk.h, $$1x -> {
               $$1x.d();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, fbg b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static faz.b a(JsonObject $$0) {
         String $$1 = fdm.a("url", $$0);
         fbg $$2 = fdm.a("urlText", $$0, fbg::a);
         return new faz.b($$1, $$2);
      }
   }

   public static class c extends faz {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fbg e;
      private final fbg f;

      private c(faz $$0, String $$1, fbg $$2, fbg $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static faz.c a(faz $$0, JsonObject $$1) {
         String $$2 = fdm.a("url", $$1);
         fbg $$3 = fdm.a("buttonText", $$1, fbg::a);
         fbg $$4 = fdm.a("message", $$1, fbg::a);
         return new faz.c($$0, $$2, $$3, $$4);
      }

      public xl d() {
         return this.f.a(xl.c("mco.notification.visitUrl.message.default"));
      }

      public fgz a(fmy $$0) {
         xl $$1 = this.e.a(faz.h);
         return fgz.a($$1, flp.b($$0, this.d)).a();
      }
   }
}
