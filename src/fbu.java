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

public class fbu {
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

   fbu(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<fbu> a(String $$0) {
      List<fbu> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static fbu a(JsonObject $$0) {
      UUID $$1 = feh.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = feh.a("dismissable", $$0, true);
         boolean $$3 = feh.a("seen", $$0, false);
         String $$4 = feh.a("type", $$0);
         fbu $$5 = new fbu($$1, $$2, $$3, $$4);

         return (fbu)(switch ($$4) {
            case "visitUrl" -> fbu.c.a($$5, $$0);
            case "infoPopup" -> fbu.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends fbu {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final fcb e;
      private final fcb f;
      private final akk g;
      @Nullable
      private final fbu.b h;

      private a(fbu $$0, fcb $$1, fcb $$2, akk $$3, @Nullable fbu.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fbu.a a(fbu $$0, JsonObject $$1) {
         fcb $$2 = feh.a("title", $$1, fcb::a);
         fcb $$3 = feh.a("message", $$1, fcb::a);
         akk $$4 = new akk(feh.a("image", $$1));
         fbu.b $$5 = feh.b("urlButton", $$1, fbu.b::a);
         return new fbu.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fiw a(fnl $$0, Consumer<UUID> $$1) {
         wu $$2 = this.e.a();
         if ($$2 == null) {
            fbu.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fiw.a $$3 = new fiw.a($$0, $$2).a(this.g).a(this.f.a(wt.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fbu.h), $$2x -> {
                  ffw $$3x = ffw.Q();
                  $$3x.a(new fmi($$3xx -> {
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

   static record b(String a, fcb b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fbu.b a(JsonObject $$0) {
         String $$1 = feh.a("url", $$0);
         fcb $$2 = feh.a("urlText", $$0, fcb::a);
         return new fbu.b($$1, $$2);
      }
   }

   public static class c extends fbu {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fcb e;
      private final fcb f;

      private c(fbu $$0, String $$1, fcb $$2, fcb $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fbu.c a(fbu $$0, JsonObject $$1) {
         String $$2 = feh.a("url", $$1);
         fcb $$3 = feh.a("buttonText", $$1, fcb::a);
         fcb $$4 = feh.a("message", $$1, fcb::a);
         return new fbu.c($$0, $$2, $$3, $$4);
      }

      public wu d() {
         return this.f.a(wu.c("mco.notification.visitUrl.message.default"));
      }

      public fhu a(fnl $$0) {
         wu $$1 = this.e.a(fbu.h);
         return fhu.a($$1, fmi.b($$0, this.d)).a();
      }
   }
}
