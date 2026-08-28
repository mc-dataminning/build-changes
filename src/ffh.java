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

public class ffh {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final xi h = xi.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   ffh(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<ffh> a(String $$0) {
      List<ffh> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static ffh a(JsonObject $$0) {
      UUID $$1 = fhs.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fhs.a("dismissable", $$0, true);
         boolean $$3 = fhs.a("seen", $$0, false);
         String $$4 = fhs.a("type", $$0);
         ffh $$5 = new ffh($$1, $$2, $$3, $$4);

         return (ffh)(switch ($$4) {
            case "visitUrl" -> ffh.c.a($$5, $$0);
            case "infoPopup" -> ffh.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends ffh {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final ffm e;
      private final ffm f;
      private final ali g;
      @Nullable
      private final ffh.b h;

      private a(ffh $$0, ffm $$1, ffm $$2, ali $$3, @Nullable ffh.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static ffh.a a(ffh $$0, JsonObject $$1) {
         ffm $$2 = fhs.a("title", $$1, ffm::a);
         ffm $$3 = fhs.a("message", $$1, ffm::a);
         ali $$4 = ali.a(fhs.a("image", $$1));
         ffh.b $$5 = fhs.b("urlButton", $$1, ffh.b::a);
         return new ffh.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fmj a(fra $$0, Consumer<UUID> $$1) {
         xi $$2 = this.e.a();
         if ($$2 == null) {
            ffh.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fmj.a $$3 = new fmj.a($$0, $$2).a(this.g).a(this.f.a(xh.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(ffh.h), $$2x -> {
                  fji $$3x = fji.Q();
                  $$3x.a(new fpx($$3xx -> {
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

            $$3.a(xh.h, $$1x -> {
               $$1x.d();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, ffm b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static ffh.b a(JsonObject $$0) {
         String $$1 = fhs.a("url", $$0);
         ffm $$2 = fhs.a("urlText", $$0, ffm::a);
         return new ffh.b($$1, $$2);
      }
   }

   public static class c extends ffh {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final ffm e;
      private final ffm f;

      private c(ffh $$0, String $$1, ffm $$2, ffm $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static ffh.c a(ffh $$0, JsonObject $$1) {
         String $$2 = fhs.a("url", $$1);
         ffm $$3 = fhs.a("buttonText", $$1, ffm::a);
         ffm $$4 = fhs.a("message", $$1, ffm::a);
         return new ffh.c($$0, $$2, $$3, $$4);
      }

      public xi d() {
         return this.f.a(xi.c("mco.notification.visitUrl.message.default"));
      }

      public flh a(fra $$0) {
         xi $$1 = this.e.a(ffh.h);
         return flh.a($$1, fpx.b($$0, this.d)).a();
      }
   }
}
