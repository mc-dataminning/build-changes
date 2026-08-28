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

public class fci {
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

   fci(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<fci> a(String $$0) {
      List<fci> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static fci a(JsonObject $$0) {
      UUID $$1 = fet.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fet.a("dismissable", $$0, true);
         boolean $$3 = fet.a("seen", $$0, false);
         String $$4 = fet.a("type", $$0);
         fci $$5 = new fci($$1, $$2, $$3, $$4);

         return (fci)(switch ($$4) {
            case "visitUrl" -> fci.c.a($$5, $$0);
            case "infoPopup" -> fci.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends fci {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final fcn e;
      private final fcn f;
      private final akq g;
      @Nullable
      private final fci.b h;

      private a(fci $$0, fcn $$1, fcn $$2, akq $$3, @Nullable fci.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fci.a a(fci $$0, JsonObject $$1) {
         fcn $$2 = fet.a("title", $$1, fcn::a);
         fcn $$3 = fet.a("message", $$1, fcn::a);
         akq $$4 = akq.a(fet.a("image", $$1));
         fci.b $$5 = fet.b("urlButton", $$1, fci.b::a);
         return new fci.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fji a(fnx $$0, Consumer<UUID> $$1) {
         wy $$2 = this.e.a();
         if ($$2 == null) {
            fci.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fji.a $$3 = new fji.a($$0, $$2).a(this.g).a(this.f.a(wx.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fci.h), $$2x -> {
                  fgi $$3x = fgi.Q();
                  $$3x.a(new fmu($$3xx -> {
                     if ($$3xx) {
                        ad.k().a(this.h.a);
                        $$3x.a($$0);
                     } else {
                        $$3x.a($$2x);
                     }
                  }, this.h.a, true));
                  $$1.accept(this.c());
               });
            }

            $$3.a(wx.h, $$1x -> {
               $$1x.d();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, fcn b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fci.b a(JsonObject $$0) {
         String $$1 = fet.a("url", $$0);
         fcn $$2 = fet.a("urlText", $$0, fcn::a);
         return new fci.b($$1, $$2);
      }
   }

   public static class c extends fci {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fcn e;
      private final fcn f;

      private c(fci $$0, String $$1, fcn $$2, fcn $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fci.c a(fci $$0, JsonObject $$1) {
         String $$2 = fet.a("url", $$1);
         fcn $$3 = fet.a("buttonText", $$1, fcn::a);
         fcn $$4 = fet.a("message", $$1, fcn::a);
         return new fci.c($$0, $$2, $$3, $$4);
      }

      public wy d() {
         return this.f.a(wy.c("mco.notification.visitUrl.message.default"));
      }

      public fig a(fnx $$0) {
         wy $$1 = this.e.a(fci.h);
         return fig.a($$1, fmu.b($$0, this.d)).a();
      }
   }
}
