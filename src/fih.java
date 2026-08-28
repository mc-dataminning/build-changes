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

public class fih {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final wp h = wp.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   fih(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<fih> a(String $$0) {
      List<fih> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static fih a(JsonObject $$0) {
      UUID $$1 = fks.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fks.a("dismissable", $$0, true);
         boolean $$3 = fks.a("seen", $$0, false);
         String $$4 = fks.a("type", $$0);
         fih $$5 = new fih($$1, $$2, $$3, $$4);

         return (fih)(switch ($$4) {
            case "visitUrl" -> fih.c.a($$5, $$0);
            case "infoPopup" -> fih.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends fih {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final fin e;
      private final fin f;
      private final aku g;
      @Nullable
      private final fih.b h;

      private a(fih $$0, fin $$1, fin $$2, aku $$3, @Nullable fih.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fih.a a(fih $$0, JsonObject $$1) {
         fin $$2 = fks.a("title", $$1, fin::a);
         fin $$3 = fks.a("message", $$1, fin::a);
         aku $$4 = aku.a(fks.a("image", $$1));
         fih.b $$5 = fks.b("urlButton", $$1, fih.b::a);
         return new fih.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fqs a(fvi $$0, Consumer<UUID> $$1) {
         wp $$2 = this.e.a();
         if ($$2 == null) {
            fih.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fqs.a $$3 = new fqs.a($$0, $$2).a(this.g).a(this.f.a(wo.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fih.h), $$2x -> {
                  fmg $$3x = fmg.Q();
                  $$3x.a(new fuf($$3xx -> {
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

            $$3.a(wo.h, $$1x -> {
               $$1x.aO_();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, fin b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fih.b a(JsonObject $$0) {
         String $$1 = fks.a("url", $$0);
         fin $$2 = fks.a("urlText", $$0, fin::a);
         return new fih.b($$1, $$2);
      }
   }

   public static class c extends fih {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fin e;
      private final fin f;

      private c(fih $$0, String $$1, fin $$2, fin $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fih.c a(fih $$0, JsonObject $$1) {
         String $$2 = fks.a("url", $$1);
         fin $$3 = fks.a("buttonText", $$1, fin::a);
         fin $$4 = fks.a("message", $$1, fin::a);
         return new fih.c($$0, $$2, $$3, $$4);
      }

      public wp d() {
         return this.f.a(wp.c("mco.notification.visitUrl.message.default"));
      }

      public fpq a(fvi $$0) {
         wp $$1 = this.e.a(fih.h);
         return fpq.a($$1, fuf.b($$0, this.d)).a();
      }
   }
}
