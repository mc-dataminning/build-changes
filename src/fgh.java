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

public class fgh {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final xj h = xj.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   fgh(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<fgh> a(String $$0) {
      List<fgh> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static fgh a(JsonObject $$0) {
      UUID $$1 = fir.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fir.a("dismissable", $$0, true);
         boolean $$3 = fir.a("seen", $$0, false);
         String $$4 = fir.a("type", $$0);
         fgh $$5 = new fgh($$1, $$2, $$3, $$4);

         return (fgh)(switch ($$4) {
            case "visitUrl" -> fgh.c.a($$5, $$0);
            case "infoPopup" -> fgh.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends fgh {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final fgm e;
      private final fgm f;
      private final alj g;
      @Nullable
      private final fgh.b h;

      private a(fgh $$0, fgm $$1, fgm $$2, alj $$3, @Nullable fgh.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fgh.a a(fgh $$0, JsonObject $$1) {
         fgm $$2 = fir.a("title", $$1, fgm::a);
         fgm $$3 = fir.a("message", $$1, fgm::a);
         alj $$4 = alj.a(fir.a("image", $$1));
         fgh.b $$5 = fir.b("urlButton", $$1, fgh.b::a);
         return new fgh.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fnf a(frw $$0, Consumer<UUID> $$1) {
         xj $$2 = this.e.a();
         if ($$2 == null) {
            fgh.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fnf.a $$3 = new fnf.a($$0, $$2).a(this.g).a(this.f.a(xi.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fgh.h), $$2x -> {
                  fke $$3x = fke.Q();
                  $$3x.a(new fqt($$3xx -> {
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

            $$3.a(xi.h, $$1x -> {
               $$1x.aO_();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, fgm b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fgh.b a(JsonObject $$0) {
         String $$1 = fir.a("url", $$0);
         fgm $$2 = fir.a("urlText", $$0, fgm::a);
         return new fgh.b($$1, $$2);
      }
   }

   public static class c extends fgh {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fgm e;
      private final fgm f;

      private c(fgh $$0, String $$1, fgm $$2, fgm $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fgh.c a(fgh $$0, JsonObject $$1) {
         String $$2 = fir.a("url", $$1);
         fgm $$3 = fir.a("buttonText", $$1, fgm::a);
         fgm $$4 = fir.a("message", $$1, fgm::a);
         return new fgh.c($$0, $$2, $$3, $$4);
      }

      public xj d() {
         return this.f.a(xj.c("mco.notification.visitUrl.message.default"));
      }

      public fmd a(frw $$0) {
         xj $$1 = this.e.a(fgh.h);
         return fmd.a($$1, fqt.b($$0, this.d)).a();
      }
   }
}
