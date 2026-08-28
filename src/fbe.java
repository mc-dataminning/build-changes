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

public class fbe {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final xp h = xp.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   fbe(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<fbe> a(String $$0) {
      List<fbe> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static fbe a(JsonObject $$0) {
      UUID $$1 = fdr.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fdr.a("dismissable", $$0, true);
         boolean $$3 = fdr.a("seen", $$0, false);
         String $$4 = fdr.a("type", $$0);
         fbe $$5 = new fbe($$1, $$2, $$3, $$4);

         return (fbe)(switch ($$4) {
            case "visitUrl" -> fbe.c.a($$5, $$0);
            case "infoPopup" -> fbe.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends fbe {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final fbl e;
      private final fbl f;
      private final alf g;
      @Nullable
      private final fbe.b h;

      private a(fbe $$0, fbl $$1, fbl $$2, alf $$3, @Nullable fbe.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fbe.a a(fbe $$0, JsonObject $$1) {
         fbl $$2 = fdr.a("title", $$1, fbl::a);
         fbl $$3 = fdr.a("message", $$1, fbl::a);
         alf $$4 = new alf(fdr.a("image", $$1));
         fbe.b $$5 = fdr.b("urlButton", $$1, fbe.b::a);
         return new fbe.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fig a(fnd $$0, Consumer<UUID> $$1) {
         xp $$2 = this.e.a();
         if ($$2 == null) {
            fbe.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fig.a $$3 = new fig.a($$0, $$2).a(this.g).a(this.f.a(xo.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fbe.h), $$2x -> {
                  fff $$3x = fff.Q();
                  $$3x.a(new flu($$3xx -> {
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

            $$3.a(xo.h, $$1x -> {
               $$1x.d();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, fbl b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fbe.b a(JsonObject $$0) {
         String $$1 = fdr.a("url", $$0);
         fbl $$2 = fdr.a("urlText", $$0, fbl::a);
         return new fbe.b($$1, $$2);
      }
   }

   public static class c extends fbe {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fbl e;
      private final fbl f;

      private c(fbe $$0, String $$1, fbl $$2, fbl $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fbe.c a(fbe $$0, JsonObject $$1) {
         String $$2 = fdr.a("url", $$1);
         fbl $$3 = fdr.a("buttonText", $$1, fbl::a);
         fbl $$4 = fdr.a("message", $$1, fbl::a);
         return new fbe.c($$0, $$2, $$3, $$4);
      }

      public xp d() {
         return this.f.a(xp.c("mco.notification.visitUrl.message.default"));
      }

      public fhe a(fnd $$0) {
         xp $$1 = this.e.a(fbe.h);
         return fhe.a($$1, flu.b($$0, this.d)).a();
      }
   }
}
