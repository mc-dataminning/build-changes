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

public class eoq {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final ur h = ur.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   eoq(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<eoq> a(String $$0) {
      List<eoq> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static eoq a(JsonObject $$0) {
      UUID $$1 = erd.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = erd.a("dismissable", $$0, true);
         boolean $$3 = erd.a("seen", $$0, false);
         String $$4 = erd.a("type", $$0);
         eoq $$5 = new eoq($$1, $$2, $$3, $$4);

         return (eoq)(switch ($$4) {
            case "visitUrl" -> eoq.c.a($$5, $$0);
            case "infoPopup" -> eoq.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends eoq {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final eox e;
      private final eox f;
      private final agg g;
      @Nullable
      private final eoq.b h;

      private a(eoq $$0, eox $$1, eox $$2, agg $$3, @Nullable eoq.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static eoq.a a(eoq $$0, JsonObject $$1) {
         eox $$2 = erd.a("title", $$1, eox::a);
         eox $$3 = erd.a("message", $$1, eox::a);
         agg $$4 = new agg(erd.a("image", $$1));
         eoq.b $$5 = erd.b("urlButton", $$1, eoq.b::a);
         return new eoq.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public evo a(fah $$0, Consumer<UUID> $$1) {
         ur $$2 = this.e.a();
         if ($$2 == null) {
            eoq.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            evo.a $$3 = new evo.a($$0, $$2).a(this.g).a(this.f.a(uq.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(eoq.h), $$2x -> {
                  esr $$3x = esr.N();
                  $$3x.a(new eyz($$3xx -> {
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

            $$3.a(uq.h, $$1x -> {
               $$1x.aE_();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, eox b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static eoq.b a(JsonObject $$0) {
         String $$1 = erd.a("url", $$0);
         eox $$2 = erd.a("urlText", $$0, eox::a);
         return new eoq.b($$1, $$2);
      }
   }

   public static class c extends eoq {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final eox e;
      private final eox f;

      private c(eoq $$0, String $$1, eox $$2, eox $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static eoq.c a(eoq $$0, JsonObject $$1) {
         String $$2 = erd.a("url", $$1);
         eox $$3 = erd.a("buttonText", $$1, eox::a);
         eox $$4 = erd.a("message", $$1, eox::a);
         return new eoq.c($$0, $$2, $$3, $$4);
      }

      public ur d() {
         return this.f.a(ur.c("mco.notification.visitUrl.message.default"));
      }

      public eum a(fah $$0) {
         ur $$1 = this.e.a(eoq.h);
         return eum.a($$1, eyz.b($$0, this.d)).a();
      }
   }
}
