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

public class fig {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final xv h = xv.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   fig(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<fig> a(String $$0) {
      List<fig> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static fig a(JsonObject $$0) {
      UUID $$1 = fkr.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fkr.a("dismissable", $$0, true);
         boolean $$3 = fkr.a("seen", $$0, false);
         String $$4 = fkr.a("type", $$0);
         fig $$5 = new fig($$1, $$2, $$3, $$4);

         return (fig)(switch ($$4) {
            case "visitUrl" -> fig.c.a($$5, $$0);
            case "infoPopup" -> fig.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends fig {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final fim e;
      private final fim f;
      private final alz g;
      @Nullable
      private final fig.b h;

      private a(fig $$0, fim $$1, fim $$2, alz $$3, @Nullable fig.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fig.a a(fig $$0, JsonObject $$1) {
         fim $$2 = fkr.a("title", $$1, fim::a);
         fim $$3 = fkr.a("message", $$1, fim::a);
         alz $$4 = alz.a(fkr.a("image", $$1));
         fig.b $$5 = fkr.b("urlButton", $$1, fig.b::a);
         return new fig.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fpg a(ftw $$0, Consumer<UUID> $$1) {
         xv $$2 = this.e.a();
         if ($$2 == null) {
            fig.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fpg.a $$3 = new fpg.a($$0, $$2).a(this.g).a(this.f.a(xu.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fig.h), $$2x -> {
                  fme $$3x = fme.Q();
                  $$3x.a(new fst($$3xx -> {
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

            $$3.a(xu.h, $$1x -> {
               $$1x.aP_();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, fim b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fig.b a(JsonObject $$0) {
         String $$1 = fkr.a("url", $$0);
         fim $$2 = fkr.a("urlText", $$0, fim::a);
         return new fig.b($$1, $$2);
      }
   }

   public static class c extends fig {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fim e;
      private final fim f;

      private c(fig $$0, String $$1, fim $$2, fim $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fig.c a(fig $$0, JsonObject $$1) {
         String $$2 = fkr.a("url", $$1);
         fim $$3 = fkr.a("buttonText", $$1, fim::a);
         fim $$4 = fkr.a("message", $$1, fim::a);
         return new fig.c($$0, $$2, $$3, $$4);
      }

      public xv d() {
         return this.f.a(xv.c("mco.notification.visitUrl.message.default"));
      }

      public fod a(ftw $$0) {
         xv $$1 = this.e.a(fig.h);
         return fod.a($$1, fst.b($$0, this.d)).a();
      }
   }
}
