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

public class erh {
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

   erh(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<erh> a(String $$0) {
      List<erh> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static erh a(JsonObject $$0) {
      UUID $$1 = etu.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = etu.a("dismissable", $$0, true);
         boolean $$3 = etu.a("seen", $$0, false);
         String $$4 = etu.a("type", $$0);
         erh $$5 = new erh($$1, $$2, $$3, $$4);

         return (erh)(switch ($$4) {
            case "visitUrl" -> erh.c.a($$5, $$0);
            case "infoPopup" -> erh.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends erh {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final ero e;
      private final ero f;
      private final ahg g;
      @Nullable
      private final erh.b h;

      private a(erh $$0, ero $$1, ero $$2, ahg $$3, @Nullable erh.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static erh.a a(erh $$0, JsonObject $$1) {
         ero $$2 = etu.a("title", $$1, ero::a);
         ero $$3 = etu.a("message", $$1, ero::a);
         ahg $$4 = new ahg(etu.a("image", $$1));
         erh.b $$5 = etu.b("urlButton", $$1, erh.b::a);
         return new erh.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public eyi a(fdb $$0, Consumer<UUID> $$1) {
         vf $$2 = this.e.a();
         if ($$2 == null) {
            erh.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            eyi.a $$3 = new eyi.a($$0, $$2).a(this.g).a(this.f.a(ve.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(erh.h), $$2x -> {
                  evi $$3x = evi.O();
                  $$3x.a(new fbt($$3xx -> {
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

   static record b(String a, ero b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static erh.b a(JsonObject $$0) {
         String $$1 = etu.a("url", $$0);
         ero $$2 = etu.a("urlText", $$0, ero::a);
         return new erh.b($$1, $$2);
      }
   }

   public static class c extends erh {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final ero e;
      private final ero f;

      private c(erh $$0, String $$1, ero $$2, ero $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static erh.c a(erh $$0, JsonObject $$1) {
         String $$2 = etu.a("url", $$1);
         ero $$3 = etu.a("buttonText", $$1, ero::a);
         ero $$4 = etu.a("message", $$1, ero::a);
         return new erh.c($$0, $$2, $$3, $$4);
      }

      public vf d() {
         return this.f.a(vf.c("mco.notification.visitUrl.message.default"));
      }

      public exg a(fdb $$0) {
         vf $$1 = this.e.a(erh.h);
         return exg.a($$1, fbt.b($$0, this.d)).a();
      }
   }
}
