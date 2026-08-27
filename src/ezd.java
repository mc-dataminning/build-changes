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

public class ezd {
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

   ezd(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<ezd> a(String $$0) {
      List<ezd> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static ezd a(JsonObject $$0) {
      UUID $$1 = fbq.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fbq.a("dismissable", $$0, true);
         boolean $$3 = fbq.a("seen", $$0, false);
         String $$4 = fbq.a("type", $$0);
         ezd $$5 = new ezd($$1, $$2, $$3, $$4);

         return (ezd)(switch ($$4) {
            case "visitUrl" -> ezd.c.a($$5, $$0);
            case "infoPopup" -> ezd.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends ezd {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final ezk e;
      private final ezk f;
      private final akh g;
      @Nullable
      private final ezd.b h;

      private a(ezd $$0, ezk $$1, ezk $$2, akh $$3, @Nullable ezd.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static ezd.a a(ezd $$0, JsonObject $$1) {
         ezk $$2 = fbq.a("title", $$1, ezk::a);
         ezk $$3 = fbq.a("message", $$1, ezk::a);
         akh $$4 = new akh(fbq.a("image", $$1));
         ezd.b $$5 = fbq.b("urlButton", $$1, ezd.b::a);
         return new ezd.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fgg a(fld $$0, Consumer<UUID> $$1) {
         wu $$2 = this.e.a();
         if ($$2 == null) {
            ezd.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fgg.a $$3 = new fgg.a($$0, $$2).a(this.g).a(this.f.a(wt.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(ezd.h), $$2x -> {
                  fde $$3x = fde.Q();
                  $$3x.a(new fju($$3xx -> {
                     if ($$3xx) {
                        ac.j().a(this.h.a);
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

   static record b(String a, ezk b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static ezd.b a(JsonObject $$0) {
         String $$1 = fbq.a("url", $$0);
         ezk $$2 = fbq.a("urlText", $$0, ezk::a);
         return new ezd.b($$1, $$2);
      }
   }

   public static class c extends ezd {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final ezk e;
      private final ezk f;

      private c(ezd $$0, String $$1, ezk $$2, ezk $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static ezd.c a(ezd $$0, JsonObject $$1) {
         String $$2 = fbq.a("url", $$1);
         ezk $$3 = fbq.a("buttonText", $$1, ezk::a);
         ezk $$4 = fbq.a("message", $$1, ezk::a);
         return new ezd.c($$0, $$2, $$3, $$4);
      }

      public wu d() {
         return this.f.a(wu.c("mco.notification.visitUrl.message.default"));
      }

      public ffe a(fld $$0) {
         wu $$1 = this.e.a(ezd.h);
         return ffe.a($$1, fju.b($$0, this.d)).a();
      }
   }
}
