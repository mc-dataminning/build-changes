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

public class fea {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final xd h = xd.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   fea(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<fea> a(String $$0) {
      List<fea> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static fea a(JsonObject $$0) {
      UUID $$1 = fgl.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fgl.a("dismissable", $$0, true);
         boolean $$3 = fgl.a("seen", $$0, false);
         String $$4 = fgl.a("type", $$0);
         fea $$5 = new fea($$1, $$2, $$3, $$4);

         return (fea)(switch ($$4) {
            case "visitUrl" -> fea.c.a($$5, $$0);
            case "infoPopup" -> fea.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends fea {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final fef e;
      private final fef f;
      private final alb g;
      @Nullable
      private final fea.b h;

      private a(fea $$0, fef $$1, fef $$2, alb $$3, @Nullable fea.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fea.a a(fea $$0, JsonObject $$1) {
         fef $$2 = fgl.a("title", $$1, fef::a);
         fef $$3 = fgl.a("message", $$1, fef::a);
         alb $$4 = alb.a(fgl.a("image", $$1));
         fea.b $$5 = fgl.b("urlButton", $$1, fea.b::a);
         return new fea.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public flc a(fpt $$0, Consumer<UUID> $$1) {
         xd $$2 = this.e.a();
         if ($$2 == null) {
            fea.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            flc.a $$3 = new flc.a($$0, $$2).a(this.g).a(this.f.a(xc.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fea.h), $$2x -> {
                  fib $$3x = fib.Q();
                  $$3x.a(new fop($$3xx -> {
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

            $$3.a(xc.h, $$1x -> {
               $$1x.d();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, fef b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fea.b a(JsonObject $$0) {
         String $$1 = fgl.a("url", $$0);
         fef $$2 = fgl.a("urlText", $$0, fef::a);
         return new fea.b($$1, $$2);
      }
   }

   public static class c extends fea {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fef e;
      private final fef f;

      private c(fea $$0, String $$1, fef $$2, fef $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fea.c a(fea $$0, JsonObject $$1) {
         String $$2 = fgl.a("url", $$1);
         fef $$3 = fgl.a("buttonText", $$1, fef::a);
         fef $$4 = fgl.a("message", $$1, fef::a);
         return new fea.c($$0, $$2, $$3, $$4);
      }

      public xd d() {
         return this.f.a(xd.c("mco.notification.visitUrl.message.default"));
      }

      public fka a(fpt $$0) {
         xd $$1 = this.e.a(fea.h);
         return fka.a($$1, fop.b($$0, this.d)).a();
      }
   }
}
