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

public class enn {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final ui h = ui.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   enn(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<enn> a(String $$0) {
      List<enn> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static enn a(JsonObject $$0) {
      UUID $$1 = eqa.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = eqa.a("dismissable", $$0, true);
         boolean $$3 = eqa.a("seen", $$0, false);
         String $$4 = eqa.a("type", $$0);
         enn $$5 = new enn($$1, $$2, $$3, $$4);

         return (enn)(switch ($$4) {
            case "visitUrl" -> enn.c.a($$5, $$0);
            case "infoPopup" -> enn.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends enn {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final enu e;
      private final enu f;
      private final afw g;
      @Nullable
      private final enn.b h;

      private a(enn $$0, enu $$1, enu $$2, afw $$3, @Nullable enn.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static enn.a a(enn $$0, JsonObject $$1) {
         enu $$2 = eqa.a("title", $$1, enu::a);
         enu $$3 = eqa.a("message", $$1, enu::a);
         afw $$4 = new afw(eqa.a("image", $$1));
         enn.b $$5 = eqa.b("urlButton", $$1, enn.b::a);
         return new enn.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public eul a(ezd $$0, Consumer<UUID> $$1) {
         ui $$2 = this.e.a();
         if ($$2 == null) {
            enn.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            eul.a $$3 = new eul.a($$0, $$2).a(this.g).a(this.f.a(uh.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(enn.h), $$2x -> {
                  ero $$3x = ero.O();
                  $$3x.a(new exw($$3xx -> {
                     if ($$3xx) {
                        ac.i().a(this.h.a);
                        $$3x.a($$0);
                     } else {
                        $$3x.a($$2x);
                     }
                  }, this.h.a, true));
                  $$1.accept(this.c());
               });
            }

            $$3.a(uh.h, $$1x -> {
               $$1x.aC_();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, enu b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static enn.b a(JsonObject $$0) {
         String $$1 = eqa.a("url", $$0);
         enu $$2 = eqa.a("urlText", $$0, enu::a);
         return new enn.b($$1, $$2);
      }
   }

   public static class c extends enn {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final enu e;
      private final enu f;

      private c(enn $$0, String $$1, enu $$2, enu $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static enn.c a(enn $$0, JsonObject $$1) {
         String $$2 = eqa.a("url", $$1);
         enu $$3 = eqa.a("buttonText", $$1, enu::a);
         enu $$4 = eqa.a("message", $$1, enu::a);
         return new enn.c($$0, $$2, $$3, $$4);
      }

      public ui d() {
         return this.f.a(ui.c("mco.notification.visitUrl.message.default"));
      }

      public etj a(ezd $$0) {
         ui $$1 = this.e.a(enn.h);
         return etj.a($$1, exw.b(this.d, $$0, true)).a();
      }
   }
}
