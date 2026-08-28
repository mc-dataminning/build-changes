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

public class fmq {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final xg h = xg.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   fmq(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<fmq> a(String $$0) {
      List<fmq> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static fmq a(JsonObject $$0) {
      UUID $$1 = fpc.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fpc.a("dismissable", $$0, true);
         boolean $$3 = fpc.a("seen", $$0, false);
         String $$4 = fpc.a("type", $$0);
         fmq $$5 = new fmq($$1, $$2, $$3, $$4);

         return (fmq)(switch ($$4) {
            case "visitUrl" -> fmq.c.a($$5, $$0);
            case "infoPopup" -> fmq.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends fmq {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final fmw e;
      private final fmw f;
      private final alr g;
      @Nullable
      private final fmq.b h;

      private a(fmq $$0, fmw $$1, fmw $$2, alr $$3, @Nullable fmq.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fmq.a a(fmq $$0, JsonObject $$1) {
         fmw $$2 = fpc.a("title", $$1, fmw::a);
         fmw $$3 = fpc.a("message", $$1, fmw::a);
         alr $$4 = alr.a(fpc.a("image", $$1));
         fmq.b $$5 = fpc.b("urlButton", $$1, fmq.b::a);
         return new fmq.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fva a(fzq $$0, Consumer<UUID> $$1) {
         xg $$2 = this.e.a();
         if ($$2 == null) {
            fmq.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fva.a $$3 = new fva.a($$0, $$2).a(this.g).a(this.f.a(xf.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fmq.h), $$2x -> {
                  fqq $$3x = fqq.Q();
                  $$3x.a(new fyn($$3xx -> {
                     if ($$3xx) {
                        ag.n().a(this.h.a);
                        $$3x.a($$0);
                     } else {
                        $$3x.a($$2x);
                     }
                  }, this.h.a, true));
                  $$1.accept(this.c());
               });
            }

            $$3.a(xf.h, $$1x -> {
               $$1x.aL_();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, fmw b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fmq.b a(JsonObject $$0) {
         String $$1 = fpc.a("url", $$0);
         fmw $$2 = fpc.a("urlText", $$0, fmw::a);
         return new fmq.b($$1, $$2);
      }
   }

   public static class c extends fmq {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fmw e;
      private final fmw f;

      private c(fmq $$0, String $$1, fmw $$2, fmw $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fmq.c a(fmq $$0, JsonObject $$1) {
         String $$2 = fpc.a("url", $$1);
         fmw $$3 = fpc.a("buttonText", $$1, fmw::a);
         fmw $$4 = fpc.a("message", $$1, fmw::a);
         return new fmq.c($$0, $$2, $$3, $$4);
      }

      public xg d() {
         return this.f.a(xg.c("mco.notification.visitUrl.message.default"));
      }

      public fty a(fzq $$0) {
         xg $$1 = this.e.a(fmq.h);
         return fty.a($$1, fyn.b($$0, this.d)).a();
      }
   }
}
