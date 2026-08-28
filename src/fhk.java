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

public class fhk {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final wo h = wo.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   fhk(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<fhk> a(String $$0) {
      List<fhk> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static fhk a(JsonObject $$0) {
      UUID $$1 = fjv.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fjv.a("dismissable", $$0, true);
         boolean $$3 = fjv.a("seen", $$0, false);
         String $$4 = fjv.a("type", $$0);
         fhk $$5 = new fhk($$1, $$2, $$3, $$4);

         return (fhk)(switch ($$4) {
            case "visitUrl" -> fhk.c.a($$5, $$0);
            case "infoPopup" -> fhk.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends fhk {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final fhq e;
      private final fhq f;
      private final aku g;
      @Nullable
      private final fhk.b h;

      private a(fhk $$0, fhq $$1, fhq $$2, aku $$3, @Nullable fhk.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fhk.a a(fhk $$0, JsonObject $$1) {
         fhq $$2 = fjv.a("title", $$1, fhq::a);
         fhq $$3 = fjv.a("message", $$1, fhq::a);
         aku $$4 = aku.a(fjv.a("image", $$1));
         fhk.b $$5 = fjv.b("urlButton", $$1, fhk.b::a);
         return new fhk.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fpu a(fuk $$0, Consumer<UUID> $$1) {
         wo $$2 = this.e.a();
         if ($$2 == null) {
            fhk.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fpu.a $$3 = new fpu.a($$0, $$2).a(this.g).a(this.f.a(wn.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fhk.h), $$2x -> {
                  flj $$3x = flj.Q();
                  $$3x.a(new fth($$3xx -> {
                     if ($$3xx) {
                        af.m().a(this.h.a);
                        $$3x.a($$0);
                     } else {
                        $$3x.a($$2x);
                     }
                  }, this.h.a, true));
                  $$1.accept(this.c());
               });
            }

            $$3.a(wn.h, $$1x -> {
               $$1x.aO_();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, fhq b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fhk.b a(JsonObject $$0) {
         String $$1 = fjv.a("url", $$0);
         fhq $$2 = fjv.a("urlText", $$0, fhq::a);
         return new fhk.b($$1, $$2);
      }
   }

   public static class c extends fhk {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fhq e;
      private final fhq f;

      private c(fhk $$0, String $$1, fhq $$2, fhq $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fhk.c a(fhk $$0, JsonObject $$1) {
         String $$2 = fjv.a("url", $$1);
         fhq $$3 = fjv.a("buttonText", $$1, fhq::a);
         fhq $$4 = fjv.a("message", $$1, fhq::a);
         return new fhk.c($$0, $$2, $$3, $$4);
      }

      public wo d() {
         return this.f.a(wo.c("mco.notification.visitUrl.message.default"));
      }

      public fos a(fuk $$0) {
         wo $$1 = this.e.a(fhk.h);
         return fos.a($$1, fth.b($$0, this.d)).a();
      }
   }
}
