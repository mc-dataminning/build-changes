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

public class fga {
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

   fga(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<fga> a(String $$0) {
      List<fga> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static fga a(JsonObject $$0) {
      UUID $$1 = fik.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fik.a("dismissable", $$0, true);
         boolean $$3 = fik.a("seen", $$0, false);
         String $$4 = fik.a("type", $$0);
         fga $$5 = new fga($$1, $$2, $$3, $$4);

         return (fga)(switch ($$4) {
            case "visitUrl" -> fga.c.a($$5, $$0);
            case "infoPopup" -> fga.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends fga {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final fgf e;
      private final fgf f;
      private final all g;
      @Nullable
      private final fga.b h;

      private a(fga $$0, fgf $$1, fgf $$2, all $$3, @Nullable fga.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fga.a a(fga $$0, JsonObject $$1) {
         fgf $$2 = fik.a("title", $$1, fgf::a);
         fgf $$3 = fik.a("message", $$1, fgf::a);
         all $$4 = all.a(fik.a("image", $$1));
         fga.b $$5 = fik.b("urlButton", $$1, fga.b::a);
         return new fga.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fmy a(frp $$0, Consumer<UUID> $$1) {
         xl $$2 = this.e.a();
         if ($$2 == null) {
            fga.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fmy.a $$3 = new fmy.a($$0, $$2).a(this.g).a(this.f.a(xk.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fga.h), $$2x -> {
                  fjx $$3x = fjx.Q();
                  $$3x.a(new fqm($$3xx -> {
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

            $$3.a(xk.h, $$1x -> {
               $$1x.aP_();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, fgf b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fga.b a(JsonObject $$0) {
         String $$1 = fik.a("url", $$0);
         fgf $$2 = fik.a("urlText", $$0, fgf::a);
         return new fga.b($$1, $$2);
      }
   }

   public static class c extends fga {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fgf e;
      private final fgf f;

      private c(fga $$0, String $$1, fgf $$2, fgf $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fga.c a(fga $$0, JsonObject $$1) {
         String $$2 = fik.a("url", $$1);
         fgf $$3 = fik.a("buttonText", $$1, fgf::a);
         fgf $$4 = fik.a("message", $$1, fgf::a);
         return new fga.c($$0, $$2, $$3, $$4);
      }

      public xl d() {
         return this.f.a(xl.c("mco.notification.visitUrl.message.default"));
      }

      public flw a(frp $$0) {
         xl $$1 = this.e.a(fga.h);
         return flw.a($$1, fqm.b($$0, this.d)).a();
      }
   }
}
