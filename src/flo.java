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

public class flo {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final wy h = wy.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   flo(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<flo> a(String $$0) {
      List<flo> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static flo a(JsonObject $$0) {
      UUID $$1 = fnz.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fnz.a("dismissable", $$0, true);
         boolean $$3 = fnz.a("seen", $$0, false);
         String $$4 = fnz.a("type", $$0);
         flo $$5 = new flo($$1, $$2, $$3, $$4);

         return (flo)(switch ($$4) {
            case "visitUrl" -> flo.c.a($$5, $$0);
            case "infoPopup" -> flo.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends flo {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final flu e;
      private final flu f;
      private final alg g;
      @Nullable
      private final flo.b h;

      private a(flo $$0, flu $$1, flu $$2, alg $$3, @Nullable flo.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static flo.a a(flo $$0, JsonObject $$1) {
         flu $$2 = fnz.a("title", $$1, flu::a);
         flu $$3 = fnz.a("message", $$1, flu::a);
         alg $$4 = alg.a(fnz.a("image", $$1));
         flo.b $$5 = fnz.b("urlButton", $$1, flo.b::a);
         return new flo.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public ftx a(fyn $$0, Consumer<UUID> $$1) {
         wy $$2 = this.e.a();
         if ($$2 == null) {
            flo.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            ftx.a $$3 = new ftx.a($$0, $$2).a(this.g).a(this.f.a(wx.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(flo.h), $$2x -> {
                  fpo $$3x = fpo.Q();
                  $$3x.a(new fxk($$3xx -> {
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

            $$3.a(wx.h, $$1x -> {
               $$1x.aL_();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, flu b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static flo.b a(JsonObject $$0) {
         String $$1 = fnz.a("url", $$0);
         flu $$2 = fnz.a("urlText", $$0, flu::a);
         return new flo.b($$1, $$2);
      }
   }

   public static class c extends flo {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final flu e;
      private final flu f;

      private c(flo $$0, String $$1, flu $$2, flu $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static flo.c a(flo $$0, JsonObject $$1) {
         String $$2 = fnz.a("url", $$1);
         flu $$3 = fnz.a("buttonText", $$1, flu::a);
         flu $$4 = fnz.a("message", $$1, flu::a);
         return new flo.c($$0, $$2, $$3, $$4);
      }

      public wy d() {
         return this.f.a(wy.c("mco.notification.visitUrl.message.default"));
      }

      public fsv a(fyn $$0) {
         wy $$1 = this.e.a(flo.h);
         return fsv.a($$1, fxk.b($$0, this.d)).a();
      }
   }
}
