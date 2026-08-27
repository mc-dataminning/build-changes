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

public class exx {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final wi h = wi.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   exx(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<exx> a(String $$0) {
      List<exx> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static exx a(JsonObject $$0) {
      UUID $$1 = fak.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fak.a("dismissable", $$0, true);
         boolean $$3 = fak.a("seen", $$0, false);
         String $$4 = fak.a("type", $$0);
         exx $$5 = new exx($$1, $$2, $$3, $$4);

         return (exx)(switch ($$4) {
            case "visitUrl" -> exx.c.a($$5, $$0);
            case "infoPopup" -> exx.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends exx {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final eye e;
      private final eye f;
      private final ajv g;
      @Nullable
      private final exx.b h;

      private a(exx $$0, eye $$1, eye $$2, ajv $$3, @Nullable exx.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static exx.a a(exx $$0, JsonObject $$1) {
         eye $$2 = fak.a("title", $$1, eye::a);
         eye $$3 = fak.a("message", $$1, eye::a);
         ajv $$4 = new ajv(fak.a("image", $$1));
         exx.b $$5 = fak.b("urlButton", $$1, exx.b::a);
         return new exx.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public ffa a(fjx $$0, Consumer<UUID> $$1) {
         wi $$2 = this.e.a();
         if ($$2 == null) {
            exx.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            ffa.a $$3 = new ffa.a($$0, $$2).a(this.g).a(this.f.a(wh.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(exx.h), $$2x -> {
                  fby $$3x = fby.Q();
                  $$3x.a(new fio($$3xx -> {
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

            $$3.a(wh.h, $$1x -> {
               $$1x.d();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, eye b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static exx.b a(JsonObject $$0) {
         String $$1 = fak.a("url", $$0);
         eye $$2 = fak.a("urlText", $$0, eye::a);
         return new exx.b($$1, $$2);
      }
   }

   public static class c extends exx {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final eye e;
      private final eye f;

      private c(exx $$0, String $$1, eye $$2, eye $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static exx.c a(exx $$0, JsonObject $$1) {
         String $$2 = fak.a("url", $$1);
         eye $$3 = fak.a("buttonText", $$1, eye::a);
         eye $$4 = fak.a("message", $$1, eye::a);
         return new exx.c($$0, $$2, $$3, $$4);
      }

      public wi d() {
         return this.f.a(wi.c("mco.notification.visitUrl.message.default"));
      }

      public fdy a(fjx $$0) {
         wi $$1 = this.e.a(exx.h);
         return fdy.a($$1, fio.b($$0, this.d)).a();
      }
   }
}
