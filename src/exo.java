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

public class exo {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final wg h = wg.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   exo(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<exo> a(String $$0) {
      List<exo> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static exo a(JsonObject $$0) {
      UUID $$1 = fab.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fab.a("dismissable", $$0, true);
         boolean $$3 = fab.a("seen", $$0, false);
         String $$4 = fab.a("type", $$0);
         exo $$5 = new exo($$1, $$2, $$3, $$4);

         return (exo)(switch ($$4) {
            case "visitUrl" -> exo.c.a($$5, $$0);
            case "infoPopup" -> exo.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends exo {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final exv e;
      private final exv f;
      private final ajt g;
      @Nullable
      private final exo.b h;

      private a(exo $$0, exv $$1, exv $$2, ajt $$3, @Nullable exo.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static exo.a a(exo $$0, JsonObject $$1) {
         exv $$2 = fab.a("title", $$1, exv::a);
         exv $$3 = fab.a("message", $$1, exv::a);
         ajt $$4 = new ajt(fab.a("image", $$1));
         exo.b $$5 = fab.b("urlButton", $$1, exo.b::a);
         return new exo.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fer a(fjo $$0, Consumer<UUID> $$1) {
         wg $$2 = this.e.a();
         if ($$2 == null) {
            exo.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fer.a $$3 = new fer.a($$0, $$2).a(this.g).a(this.f.a(wf.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(exo.h), $$2x -> {
                  fbp $$3x = fbp.Q();
                  $$3x.a(new fif($$3xx -> {
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

            $$3.a(wf.h, $$1x -> {
               $$1x.d();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, exv b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static exo.b a(JsonObject $$0) {
         String $$1 = fab.a("url", $$0);
         exv $$2 = fab.a("urlText", $$0, exv::a);
         return new exo.b($$1, $$2);
      }
   }

   public static class c extends exo {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final exv e;
      private final exv f;

      private c(exo $$0, String $$1, exv $$2, exv $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static exo.c a(exo $$0, JsonObject $$1) {
         String $$2 = fab.a("url", $$1);
         exv $$3 = fab.a("buttonText", $$1, exv::a);
         exv $$4 = fab.a("message", $$1, exv::a);
         return new exo.c($$0, $$2, $$3, $$4);
      }

      public wg d() {
         return this.f.a(wg.c("mco.notification.visitUrl.message.default"));
      }

      public fdp a(fjo $$0) {
         wg $$1 = this.e.a(exo.h);
         return fdp.a($$1, fif.b($$0, this.d)).a();
      }
   }
}
