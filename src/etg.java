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

public class etg {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final vq h = vq.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   etg(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<etg> a(String $$0) {
      List<etg> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static etg a(JsonObject $$0) {
      UUID $$1 = evt.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = evt.a("dismissable", $$0, true);
         boolean $$3 = evt.a("seen", $$0, false);
         String $$4 = evt.a("type", $$0);
         etg $$5 = new etg($$1, $$2, $$3, $$4);

         return (etg)(switch ($$4) {
            case "visitUrl" -> etg.c.a($$5, $$0);
            case "infoPopup" -> etg.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends etg {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final etn e;
      private final etn f;
      private final aiy g;
      @Nullable
      private final etg.b h;

      private a(etg $$0, etn $$1, etn $$2, aiy $$3, @Nullable etg.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static etg.a a(etg $$0, JsonObject $$1) {
         etn $$2 = evt.a("title", $$1, etn::a);
         etn $$3 = evt.a("message", $$1, etn::a);
         aiy $$4 = new aiy(evt.a("image", $$1));
         etg.b $$5 = evt.b("urlButton", $$1, etg.b::a);
         return new etg.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public faj a(ffe $$0, Consumer<UUID> $$1) {
         vq $$2 = this.e.a();
         if ($$2 == null) {
            etg.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            faj.a $$3 = new faj.a($$0, $$2).a(this.g).a(this.f.a(vp.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(etg.h), $$2x -> {
                  exh $$3x = exh.O();
                  $$3x.a(new fdw($$3xx -> {
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

            $$3.a(vp.h, $$1x -> {
               $$1x.d();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, etn b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static etg.b a(JsonObject $$0) {
         String $$1 = evt.a("url", $$0);
         etn $$2 = evt.a("urlText", $$0, etn::a);
         return new etg.b($$1, $$2);
      }
   }

   public static class c extends etg {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final etn e;
      private final etn f;

      private c(etg $$0, String $$1, etn $$2, etn $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static etg.c a(etg $$0, JsonObject $$1) {
         String $$2 = evt.a("url", $$1);
         etn $$3 = evt.a("buttonText", $$1, etn::a);
         etn $$4 = evt.a("message", $$1, etn::a);
         return new etg.c($$0, $$2, $$3, $$4);
      }

      public vq d() {
         return this.f.a(vq.c("mco.notification.visitUrl.message.default"));
      }

      public ezh a(ffe $$0) {
         vq $$1 = this.e.a(etg.h);
         return ezh.a($$1, fdw.b($$0, this.d)).a();
      }
   }
}
