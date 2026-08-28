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

public class fek {
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

   fek(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<fek> a(String $$0) {
      List<fek> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static fek a(JsonObject $$0) {
      UUID $$1 = fgv.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fgv.a("dismissable", $$0, true);
         boolean $$3 = fgv.a("seen", $$0, false);
         String $$4 = fgv.a("type", $$0);
         fek $$5 = new fek($$1, $$2, $$3, $$4);

         return (fek)(switch ($$4) {
            case "visitUrl" -> fek.c.a($$5, $$0);
            case "infoPopup" -> fek.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends fek {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final fep e;
      private final fep f;
      private final alc g;
      @Nullable
      private final fek.b h;

      private a(fek $$0, fep $$1, fep $$2, alc $$3, @Nullable fek.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fek.a a(fek $$0, JsonObject $$1) {
         fep $$2 = fgv.a("title", $$1, fep::a);
         fep $$3 = fgv.a("message", $$1, fep::a);
         alc $$4 = alc.a(fgv.a("image", $$1));
         fek.b $$5 = fgv.b("urlButton", $$1, fek.b::a);
         return new fek.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public flm a(fqd $$0, Consumer<UUID> $$1) {
         xd $$2 = this.e.a();
         if ($$2 == null) {
            fek.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            flm.a $$3 = new flm.a($$0, $$2).a(this.g).a(this.f.a(xc.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fek.h), $$2x -> {
                  fil $$3x = fil.Q();
                  $$3x.a(new fpa($$3xx -> {
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

   static record b(String a, fep b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fek.b a(JsonObject $$0) {
         String $$1 = fgv.a("url", $$0);
         fep $$2 = fgv.a("urlText", $$0, fep::a);
         return new fek.b($$1, $$2);
      }
   }

   public static class c extends fek {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fep e;
      private final fep f;

      private c(fek $$0, String $$1, fep $$2, fep $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fek.c a(fek $$0, JsonObject $$1) {
         String $$2 = fgv.a("url", $$1);
         fep $$3 = fgv.a("buttonText", $$1, fep::a);
         fep $$4 = fgv.a("message", $$1, fep::a);
         return new fek.c($$0, $$2, $$3, $$4);
      }

      public xd d() {
         return this.f.a(xd.c("mco.notification.visitUrl.message.default"));
      }

      public fkk a(fqd $$0) {
         xd $$1 = this.e.a(fek.h);
         return fkk.a($$1, fpa.b($$0, this.d)).a();
      }
   }
}
