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

public class fkg {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final ww h = ww.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   fkg(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<fkg> a(String $$0) {
      List<fkg> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static fkg a(JsonObject $$0) {
      UUID $$1 = fmr.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fmr.a("dismissable", $$0, true);
         boolean $$3 = fmr.a("seen", $$0, false);
         String $$4 = fmr.a("type", $$0);
         fkg $$5 = new fkg($$1, $$2, $$3, $$4);

         return (fkg)(switch ($$4) {
            case "visitUrl" -> fkg.c.a($$5, $$0);
            case "infoPopup" -> fkg.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends fkg {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final fkm e;
      private final fkm f;
      private final ale g;
      @Nullable
      private final fkg.b h;

      private a(fkg $$0, fkm $$1, fkm $$2, ale $$3, @Nullable fkg.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fkg.a a(fkg $$0, JsonObject $$1) {
         fkm $$2 = fmr.a("title", $$1, fkm::a);
         fkm $$3 = fmr.a("message", $$1, fkm::a);
         ale $$4 = ale.a(fmr.a("image", $$1));
         fkg.b $$5 = fmr.b("urlButton", $$1, fkg.b::a);
         return new fkg.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fss a(fxi $$0, Consumer<UUID> $$1) {
         ww $$2 = this.e.a();
         if ($$2 == null) {
            fkg.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fss.a $$3 = new fss.a($$0, $$2).a(this.g).a(this.f.a(wv.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fkg.h), $$2x -> {
                  fof $$3x = fof.Q();
                  $$3x.a(new fwf($$3xx -> {
                     if ($$3xx) {
                        af.n().a(this.h.a);
                        $$3x.a($$0);
                     } else {
                        $$3x.a($$2x);
                     }
                  }, this.h.a, true));
                  $$1.accept(this.c());
               });
            }

            $$3.a(wv.h, $$1x -> {
               $$1x.aK_();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, fkm b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fkg.b a(JsonObject $$0) {
         String $$1 = fmr.a("url", $$0);
         fkm $$2 = fmr.a("urlText", $$0, fkm::a);
         return new fkg.b($$1, $$2);
      }
   }

   public static class c extends fkg {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fkm e;
      private final fkm f;

      private c(fkg $$0, String $$1, fkm $$2, fkm $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fkg.c a(fkg $$0, JsonObject $$1) {
         String $$2 = fmr.a("url", $$1);
         fkm $$3 = fmr.a("buttonText", $$1, fkm::a);
         fkm $$4 = fmr.a("message", $$1, fkm::a);
         return new fkg.c($$0, $$2, $$3, $$4);
      }

      public ww d() {
         return this.f.a(ww.c("mco.notification.visitUrl.message.default"));
      }

      public frq a(fxi $$0) {
         ww $$1 = this.e.a(fkg.h);
         return frq.a($$1, fwf.b($$0, this.d)).a();
      }
   }
}
