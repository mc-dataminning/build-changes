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

public class fco {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final wz h = wz.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   fco(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<fco> a(String $$0) {
      List<fco> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static fco a(JsonObject $$0) {
      UUID $$1 = fez.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fez.a("dismissable", $$0, true);
         boolean $$3 = fez.a("seen", $$0, false);
         String $$4 = fez.a("type", $$0);
         fco $$5 = new fco($$1, $$2, $$3, $$4);

         return (fco)(switch ($$4) {
            case "visitUrl" -> fco.c.a($$5, $$0);
            case "infoPopup" -> fco.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends fco {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final fct e;
      private final fct f;
      private final akr g;
      @Nullable
      private final fco.b h;

      private a(fco $$0, fct $$1, fct $$2, akr $$3, @Nullable fco.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fco.a a(fco $$0, JsonObject $$1) {
         fct $$2 = fez.a("title", $$1, fct::a);
         fct $$3 = fez.a("message", $$1, fct::a);
         akr $$4 = akr.a(fez.a("image", $$1));
         fco.b $$5 = fez.b("urlButton", $$1, fco.b::a);
         return new fco.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fjo a(fod $$0, Consumer<UUID> $$1) {
         wz $$2 = this.e.a();
         if ($$2 == null) {
            fco.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fjo.a $$3 = new fjo.a($$0, $$2).a(this.g).a(this.f.a(wy.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fco.h), $$2x -> {
                  fgo $$3x = fgo.Q();
                  $$3x.a(new fna($$3xx -> {
                     if ($$3xx) {
                        ad.k().a(this.h.a);
                        $$3x.a($$0);
                     } else {
                        $$3x.a($$2x);
                     }
                  }, this.h.a, true));
                  $$1.accept(this.c());
               });
            }

            $$3.a(wy.h, $$1x -> {
               $$1x.d();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, fct b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fco.b a(JsonObject $$0) {
         String $$1 = fez.a("url", $$0);
         fct $$2 = fez.a("urlText", $$0, fct::a);
         return new fco.b($$1, $$2);
      }
   }

   public static class c extends fco {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fct e;
      private final fct f;

      private c(fco $$0, String $$1, fct $$2, fct $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fco.c a(fco $$0, JsonObject $$1) {
         String $$2 = fez.a("url", $$1);
         fct $$3 = fez.a("buttonText", $$1, fct::a);
         fct $$4 = fez.a("message", $$1, fct::a);
         return new fco.c($$0, $$2, $$3, $$4);
      }

      public wz d() {
         return this.f.a(wz.c("mco.notification.visitUrl.message.default"));
      }

      public fim a(fod $$0) {
         wz $$1 = this.e.a(fco.h);
         return fim.a($$1, fna.b($$0, this.d)).a();
      }
   }
}
