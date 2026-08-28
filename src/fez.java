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

public class fez {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final xh h = xh.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   fez(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<fez> a(String $$0) {
      List<fez> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static fez a(JsonObject $$0) {
      UUID $$1 = fhk.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fhk.a("dismissable", $$0, true);
         boolean $$3 = fhk.a("seen", $$0, false);
         String $$4 = fhk.a("type", $$0);
         fez $$5 = new fez($$1, $$2, $$3, $$4);

         return (fez)(switch ($$4) {
            case "visitUrl" -> fez.c.a($$5, $$0);
            case "infoPopup" -> fez.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends fez {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final ffe e;
      private final ffe f;
      private final alh g;
      @Nullable
      private final fez.b h;

      private a(fez $$0, ffe $$1, ffe $$2, alh $$3, @Nullable fez.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fez.a a(fez $$0, JsonObject $$1) {
         ffe $$2 = fhk.a("title", $$1, ffe::a);
         ffe $$3 = fhk.a("message", $$1, ffe::a);
         alh $$4 = alh.a(fhk.a("image", $$1));
         fez.b $$5 = fhk.b("urlButton", $$1, fez.b::a);
         return new fez.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fmb a(fqs $$0, Consumer<UUID> $$1) {
         xh $$2 = this.e.a();
         if ($$2 == null) {
            fez.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fmb.a $$3 = new fmb.a($$0, $$2).a(this.g).a(this.f.a(xg.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fez.h), $$2x -> {
                  fja $$3x = fja.Q();
                  $$3x.a(new fpp($$3xx -> {
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

            $$3.a(xg.h, $$1x -> {
               $$1x.d();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, ffe b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fez.b a(JsonObject $$0) {
         String $$1 = fhk.a("url", $$0);
         ffe $$2 = fhk.a("urlText", $$0, ffe::a);
         return new fez.b($$1, $$2);
      }
   }

   public static class c extends fez {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final ffe e;
      private final ffe f;

      private c(fez $$0, String $$1, ffe $$2, ffe $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fez.c a(fez $$0, JsonObject $$1) {
         String $$2 = fhk.a("url", $$1);
         ffe $$3 = fhk.a("buttonText", $$1, ffe::a);
         ffe $$4 = fhk.a("message", $$1, ffe::a);
         return new fez.c($$0, $$2, $$3, $$4);
      }

      public xh d() {
         return this.f.a(xh.c("mco.notification.visitUrl.message.default"));
      }

      public fkz a(fqs $$0) {
         xh $$1 = this.e.a(fez.h);
         return fkz.a($$1, fpp.b($$0, this.d)).a();
      }
   }
}
