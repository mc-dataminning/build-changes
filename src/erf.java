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

public class erf {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final vf h = vf.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   erf(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<erf> a(String $$0) {
      List<erf> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static erf a(JsonObject $$0) {
      UUID $$1 = ets.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = ets.a("dismissable", $$0, true);
         boolean $$3 = ets.a("seen", $$0, false);
         String $$4 = ets.a("type", $$0);
         erf $$5 = new erf($$1, $$2, $$3, $$4);

         return (erf)(switch ($$4) {
            case "visitUrl" -> erf.c.a($$5, $$0);
            case "infoPopup" -> erf.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends erf {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final erm e;
      private final erm f;
      private final ahg g;
      @Nullable
      private final erf.b h;

      private a(erf $$0, erm $$1, erm $$2, ahg $$3, @Nullable erf.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static erf.a a(erf $$0, JsonObject $$1) {
         erm $$2 = ets.a("title", $$1, erm::a);
         erm $$3 = ets.a("message", $$1, erm::a);
         ahg $$4 = new ahg(ets.a("image", $$1));
         erf.b $$5 = ets.b("urlButton", $$1, erf.b::a);
         return new erf.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public eyg a(fcz $$0, Consumer<UUID> $$1) {
         vf $$2 = this.e.a();
         if ($$2 == null) {
            erf.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            eyg.a $$3 = new eyg.a($$0, $$2).a(this.g).a(this.f.a(ve.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(erf.h), $$2x -> {
                  evg $$3x = evg.O();
                  $$3x.a(new fbr($$3xx -> {
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

            $$3.a(ve.h, $$1x -> {
               $$1x.aE_();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, erm b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static erf.b a(JsonObject $$0) {
         String $$1 = ets.a("url", $$0);
         erm $$2 = ets.a("urlText", $$0, erm::a);
         return new erf.b($$1, $$2);
      }
   }

   public static class c extends erf {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final erm e;
      private final erm f;

      private c(erf $$0, String $$1, erm $$2, erm $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static erf.c a(erf $$0, JsonObject $$1) {
         String $$2 = ets.a("url", $$1);
         erm $$3 = ets.a("buttonText", $$1, erm::a);
         erm $$4 = ets.a("message", $$1, erm::a);
         return new erf.c($$0, $$2, $$3, $$4);
      }

      public vf d() {
         return this.f.a(vf.c("mco.notification.visitUrl.message.default"));
      }

      public exe a(fcz $$0) {
         vf $$1 = this.e.a(erf.h);
         return exe.a($$1, fbr.b($$0, this.d)).a();
      }
   }
}
