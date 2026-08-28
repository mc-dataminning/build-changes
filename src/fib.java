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

public class fib {
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

   fib(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<fib> a(String $$0) {
      List<fib> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static fib a(JsonObject $$0) {
      UUID $$1 = fkm.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fkm.a("dismissable", $$0, true);
         boolean $$3 = fkm.a("seen", $$0, false);
         String $$4 = fkm.a("type", $$0);
         fib $$5 = new fib($$1, $$2, $$3, $$4);

         return (fib)(switch ($$4) {
            case "visitUrl" -> fib.c.a($$5, $$0);
            case "infoPopup" -> fib.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends fib {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final fih e;
      private final fih f;
      private final alz g;
      @Nullable
      private final fib.b h;

      private a(fib $$0, fih $$1, fih $$2, alz $$3, @Nullable fib.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fib.a a(fib $$0, JsonObject $$1) {
         fih $$2 = fkm.a("title", $$1, fih::a);
         fih $$3 = fkm.a("message", $$1, fih::a);
         alz $$4 = alz.a(fkm.a("image", $$1));
         fib.b $$5 = fkm.b("urlButton", $$1, fib.b::a);
         return new fib.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fpb a(ftr $$0, Consumer<UUID> $$1) {
         xv $$2 = this.e.a();
         if ($$2 == null) {
            fib.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fpb.a $$3 = new fpb.a($$0, $$2).a(this.g).a(this.f.a(xu.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fib.h), $$2x -> {
                  flz $$3x = flz.Q();
                  $$3x.a(new fso($$3xx -> {
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

   static record b(String a, fih b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fib.b a(JsonObject $$0) {
         String $$1 = fkm.a("url", $$0);
         fih $$2 = fkm.a("urlText", $$0, fih::a);
         return new fib.b($$1, $$2);
      }
   }

   public static class c extends fib {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fih e;
      private final fih f;

      private c(fib $$0, String $$1, fih $$2, fih $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fib.c a(fib $$0, JsonObject $$1) {
         String $$2 = fkm.a("url", $$1);
         fih $$3 = fkm.a("buttonText", $$1, fih::a);
         fih $$4 = fkm.a("message", $$1, fih::a);
         return new fib.c($$0, $$2, $$3, $$4);
      }

      public xv d() {
         return this.f.a(xv.c("mco.notification.visitUrl.message.default"));
      }

      public fny a(ftr $$0) {
         xv $$1 = this.e.a(fib.h);
         return fny.a($$1, fso.b($$0, this.d)).a();
      }
   }
}
