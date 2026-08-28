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

public class fks {
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

   fks(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<fks> a(String $$0) {
      List<fks> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static fks a(JsonObject $$0) {
      UUID $$1 = fnd.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fnd.a("dismissable", $$0, true);
         boolean $$3 = fnd.a("seen", $$0, false);
         String $$4 = fnd.a("type", $$0);
         fks $$5 = new fks($$1, $$2, $$3, $$4);

         return (fks)(switch ($$4) {
            case "visitUrl" -> fks.c.a($$5, $$0);
            case "infoPopup" -> fks.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends fks {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final fky e;
      private final fky f;
      private final alg g;
      @Nullable
      private final fks.b h;

      private a(fks $$0, fky $$1, fky $$2, alg $$3, @Nullable fks.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fks.a a(fks $$0, JsonObject $$1) {
         fky $$2 = fnd.a("title", $$1, fky::a);
         fky $$3 = fnd.a("message", $$1, fky::a);
         alg $$4 = alg.a(fnd.a("image", $$1));
         fks.b $$5 = fnd.b("urlButton", $$1, fks.b::a);
         return new fks.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fte a(fxu $$0, Consumer<UUID> $$1) {
         wy $$2 = this.e.a();
         if ($$2 == null) {
            fks.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fte.a $$3 = new fte.a($$0, $$2).a(this.g).a(this.f.a(wx.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fks.h), $$2x -> {
                  fos $$3x = fos.Q();
                  $$3x.a(new fwr($$3xx -> {
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
               $$1x.aK_();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, fky b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fks.b a(JsonObject $$0) {
         String $$1 = fnd.a("url", $$0);
         fky $$2 = fnd.a("urlText", $$0, fky::a);
         return new fks.b($$1, $$2);
      }
   }

   public static class c extends fks {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fky e;
      private final fky f;

      private c(fks $$0, String $$1, fky $$2, fky $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fks.c a(fks $$0, JsonObject $$1) {
         String $$2 = fnd.a("url", $$1);
         fky $$3 = fnd.a("buttonText", $$1, fky::a);
         fky $$4 = fnd.a("message", $$1, fky::a);
         return new fks.c($$0, $$2, $$3, $$4);
      }

      public wy d() {
         return this.f.a(wy.c("mco.notification.visitUrl.message.default"));
      }

      public fsc a(fxu $$0) {
         wy $$1 = this.e.a(fks.h);
         return fsc.a($$1, fwr.b($$0, this.d)).a();
      }
   }
}
