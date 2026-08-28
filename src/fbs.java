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

public class fbs {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final wu h = wu.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   fbs(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<fbs> a(String $$0) {
      List<fbs> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static fbs a(JsonObject $$0) {
      UUID $$1 = fef.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fef.a("dismissable", $$0, true);
         boolean $$3 = fef.a("seen", $$0, false);
         String $$4 = fef.a("type", $$0);
         fbs $$5 = new fbs($$1, $$2, $$3, $$4);

         return (fbs)(switch ($$4) {
            case "visitUrl" -> fbs.c.a($$5, $$0);
            case "infoPopup" -> fbs.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends fbs {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final fbz e;
      private final fbz f;
      private final akk g;
      @Nullable
      private final fbs.b h;

      private a(fbs $$0, fbz $$1, fbz $$2, akk $$3, @Nullable fbs.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fbs.a a(fbs $$0, JsonObject $$1) {
         fbz $$2 = fef.a("title", $$1, fbz::a);
         fbz $$3 = fef.a("message", $$1, fbz::a);
         akk $$4 = new akk(fef.a("image", $$1));
         fbs.b $$5 = fef.b("urlButton", $$1, fbs.b::a);
         return new fbs.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fiu a(fnj $$0, Consumer<UUID> $$1) {
         wu $$2 = this.e.a();
         if ($$2 == null) {
            fbs.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fiu.a $$3 = new fiu.a($$0, $$2).a(this.g).a(this.f.a(wt.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fbs.h), $$2x -> {
                  fft $$3x = fft.Q();
                  $$3x.a(new fmg($$3xx -> {
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

            $$3.a(wt.h, $$1x -> {
               $$1x.d();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, fbz b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fbs.b a(JsonObject $$0) {
         String $$1 = fef.a("url", $$0);
         fbz $$2 = fef.a("urlText", $$0, fbz::a);
         return new fbs.b($$1, $$2);
      }
   }

   public static class c extends fbs {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fbz e;
      private final fbz f;

      private c(fbs $$0, String $$1, fbz $$2, fbz $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fbs.c a(fbs $$0, JsonObject $$1) {
         String $$2 = fef.a("url", $$1);
         fbz $$3 = fef.a("buttonText", $$1, fbz::a);
         fbz $$4 = fef.a("message", $$1, fbz::a);
         return new fbs.c($$0, $$2, $$3, $$4);
      }

      public wu d() {
         return this.f.a(wu.c("mco.notification.visitUrl.message.default"));
      }

      public fhs a(fnj $$0) {
         wu $$1 = this.e.a(fbs.h);
         return fhs.a($$1, fmg.b($$0, this.d)).a();
      }
   }
}
