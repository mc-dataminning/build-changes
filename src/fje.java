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

public class fje {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final wv h = wv.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   fje(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<fje> a(String $$0) {
      List<fje> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static fje a(JsonObject $$0) {
      UUID $$1 = flp.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = flp.a("dismissable", $$0, true);
         boolean $$3 = flp.a("seen", $$0, false);
         String $$4 = flp.a("type", $$0);
         fje $$5 = new fje($$1, $$2, $$3, $$4);

         return (fje)(switch ($$4) {
            case "visitUrl" -> fje.c.a($$5, $$0);
            case "infoPopup" -> fje.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends fje {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final fjk e;
      private final fjk f;
      private final ald g;
      @Nullable
      private final fje.b h;

      private a(fje $$0, fjk $$1, fjk $$2, ald $$3, @Nullable fje.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fje.a a(fje $$0, JsonObject $$1) {
         fjk $$2 = flp.a("title", $$1, fjk::a);
         fjk $$3 = flp.a("message", $$1, fjk::a);
         ald $$4 = ald.a(flp.a("image", $$1));
         fje.b $$5 = flp.b("urlButton", $$1, fje.b::a);
         return new fje.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public frp a(fwf $$0, Consumer<UUID> $$1) {
         wv $$2 = this.e.a();
         if ($$2 == null) {
            fje.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            frp.a $$3 = new frp.a($$0, $$2).a(this.g).a(this.f.a(wu.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fje.h), $$2x -> {
                  fnd $$3x = fnd.Q();
                  $$3x.a(new fvc($$3xx -> {
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

            $$3.a(wu.h, $$1x -> {
               $$1x.aK_();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, fjk b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fje.b a(JsonObject $$0) {
         String $$1 = flp.a("url", $$0);
         fjk $$2 = flp.a("urlText", $$0, fjk::a);
         return new fje.b($$1, $$2);
      }
   }

   public static class c extends fje {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fjk e;
      private final fjk f;

      private c(fje $$0, String $$1, fjk $$2, fjk $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fje.c a(fje $$0, JsonObject $$1) {
         String $$2 = flp.a("url", $$1);
         fjk $$3 = flp.a("buttonText", $$1, fjk::a);
         fjk $$4 = flp.a("message", $$1, fjk::a);
         return new fje.c($$0, $$2, $$3, $$4);
      }

      public wv d() {
         return this.f.a(wv.c("mco.notification.visitUrl.message.default"));
      }

      public fqn a(fwf $$0) {
         wv $$1 = this.e.a(fje.h);
         return fqn.a($$1, fvc.b($$0, this.d)).a();
      }
   }
}
