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

public class erg {
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

   erg(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<erg> a(String $$0) {
      List<erg> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static erg a(JsonObject $$0) {
      UUID $$1 = ett.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = ett.a("dismissable", $$0, true);
         boolean $$3 = ett.a("seen", $$0, false);
         String $$4 = ett.a("type", $$0);
         erg $$5 = new erg($$1, $$2, $$3, $$4);

         return (erg)(switch ($$4) {
            case "visitUrl" -> erg.c.a($$5, $$0);
            case "infoPopup" -> erg.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends erg {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final ern e;
      private final ern f;
      private final ahg g;
      @Nullable
      private final erg.b h;

      private a(erg $$0, ern $$1, ern $$2, ahg $$3, @Nullable erg.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static erg.a a(erg $$0, JsonObject $$1) {
         ern $$2 = ett.a("title", $$1, ern::a);
         ern $$3 = ett.a("message", $$1, ern::a);
         ahg $$4 = new ahg(ett.a("image", $$1));
         erg.b $$5 = ett.b("urlButton", $$1, erg.b::a);
         return new erg.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public eyh a(fda $$0, Consumer<UUID> $$1) {
         vf $$2 = this.e.a();
         if ($$2 == null) {
            erg.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            eyh.a $$3 = new eyh.a($$0, $$2).a(this.g).a(this.f.a(ve.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(erg.h), $$2x -> {
                  evh $$3x = evh.O();
                  $$3x.a(new fbs($$3xx -> {
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

   static record b(String a, ern b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static erg.b a(JsonObject $$0) {
         String $$1 = ett.a("url", $$0);
         ern $$2 = ett.a("urlText", $$0, ern::a);
         return new erg.b($$1, $$2);
      }
   }

   public static class c extends erg {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final ern e;
      private final ern f;

      private c(erg $$0, String $$1, ern $$2, ern $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static erg.c a(erg $$0, JsonObject $$1) {
         String $$2 = ett.a("url", $$1);
         ern $$3 = ett.a("buttonText", $$1, ern::a);
         ern $$4 = ett.a("message", $$1, ern::a);
         return new erg.c($$0, $$2, $$3, $$4);
      }

      public vf d() {
         return this.f.a(vf.c("mco.notification.visitUrl.message.default"));
      }

      public exf a(fda $$0) {
         vf $$1 = this.e.a(erg.h);
         return exf.a($$1, fbs.b($$0, this.d)).a();
      }
   }
}
