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

public class fhj {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final wp h = wp.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   fhj(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<fhj> a(String $$0) {
      List<fhj> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static fhj a(JsonObject $$0) {
      UUID $$1 = fju.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fju.a("dismissable", $$0, true);
         boolean $$3 = fju.a("seen", $$0, false);
         String $$4 = fju.a("type", $$0);
         fhj $$5 = new fhj($$1, $$2, $$3, $$4);

         return (fhj)(switch ($$4) {
            case "visitUrl" -> fhj.c.a($$5, $$0);
            case "infoPopup" -> fhj.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends fhj {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final fhp e;
      private final fhp f;
      private final akv g;
      @Nullable
      private final fhj.b h;

      private a(fhj $$0, fhp $$1, fhp $$2, akv $$3, @Nullable fhj.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fhj.a a(fhj $$0, JsonObject $$1) {
         fhp $$2 = fju.a("title", $$1, fhp::a);
         fhp $$3 = fju.a("message", $$1, fhp::a);
         akv $$4 = akv.a(fju.a("image", $$1));
         fhj.b $$5 = fju.b("urlButton", $$1, fhj.b::a);
         return new fhj.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fpu a(fuk $$0, Consumer<UUID> $$1) {
         wp $$2 = this.e.a();
         if ($$2 == null) {
            fhj.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fpu.a $$3 = new fpu.a($$0, $$2).a(this.g).a(this.f.a(wo.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fhj.h), $$2x -> {
                  fli $$3x = fli.Q();
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

            $$3.a(wo.h, $$1x -> {
               $$1x.aO_();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, fhp b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fhj.b a(JsonObject $$0) {
         String $$1 = fju.a("url", $$0);
         fhp $$2 = fju.a("urlText", $$0, fhp::a);
         return new fhj.b($$1, $$2);
      }
   }

   public static class c extends fhj {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fhp e;
      private final fhp f;

      private c(fhj $$0, String $$1, fhp $$2, fhp $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fhj.c a(fhj $$0, JsonObject $$1) {
         String $$2 = fju.a("url", $$1);
         fhp $$3 = fju.a("buttonText", $$1, fhp::a);
         fhp $$4 = fju.a("message", $$1, fhp::a);
         return new fhj.c($$0, $$2, $$3, $$4);
      }

      public wp d() {
         return this.f.a(wp.c("mco.notification.visitUrl.message.default"));
      }

      public fos a(fuk $$0) {
         wp $$1 = this.e.a(fhj.h);
         return fos.a($$1, fth.b($$0, this.d)).a();
      }
   }
}
