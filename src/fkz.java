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

public class fkz {
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

   fkz(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<fkz> a(String $$0) {
      List<fkz> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static fkz a(JsonObject $$0) {
      UUID $$1 = fnk.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fnk.a("dismissable", $$0, true);
         boolean $$3 = fnk.a("seen", $$0, false);
         String $$4 = fnk.a("type", $$0);
         fkz $$5 = new fkz($$1, $$2, $$3, $$4);

         return (fkz)(switch ($$4) {
            case "visitUrl" -> fkz.c.a($$5, $$0);
            case "infoPopup" -> fkz.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends fkz {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final flf e;
      private final flf f;
      private final alg g;
      @Nullable
      private final fkz.b h;

      private a(fkz $$0, flf $$1, flf $$2, alg $$3, @Nullable fkz.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fkz.a a(fkz $$0, JsonObject $$1) {
         flf $$2 = fnk.a("title", $$1, flf::a);
         flf $$3 = fnk.a("message", $$1, flf::a);
         alg $$4 = alg.a(fnk.a("image", $$1));
         fkz.b $$5 = fnk.b("urlButton", $$1, fkz.b::a);
         return new fkz.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public ftl a(fyb $$0, Consumer<UUID> $$1) {
         wy $$2 = this.e.a();
         if ($$2 == null) {
            fkz.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            ftl.a $$3 = new ftl.a($$0, $$2).a(this.g).a(this.f.a(wx.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fkz.h), $$2x -> {
                  foz $$3x = foz.Q();
                  $$3x.a(new fwy($$3xx -> {
                     if ($$3xx) {
                        af.n().a(this.h.a);
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

   static record b(String a, flf b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fkz.b a(JsonObject $$0) {
         String $$1 = fnk.a("url", $$0);
         flf $$2 = fnk.a("urlText", $$0, flf::a);
         return new fkz.b($$1, $$2);
      }
   }

   public static class c extends fkz {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final flf e;
      private final flf f;

      private c(fkz $$0, String $$1, flf $$2, flf $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fkz.c a(fkz $$0, JsonObject $$1) {
         String $$2 = fnk.a("url", $$1);
         flf $$3 = fnk.a("buttonText", $$1, flf::a);
         flf $$4 = fnk.a("message", $$1, flf::a);
         return new fkz.c($$0, $$2, $$3, $$4);
      }

      public wy d() {
         return this.f.a(wy.c("mco.notification.visitUrl.message.default"));
      }

      public fsj a(fyb $$0) {
         wy $$1 = this.e.a(fkz.h);
         return fsj.a($$1, fwy.b($$0, this.d)).a();
      }
   }
}
