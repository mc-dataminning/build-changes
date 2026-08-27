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
   static final xe h = xe.c("mco.notification.visitUrl.buttonText.default");
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
      UUID $$1 = fev.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fev.a("dismissable", $$0, true);
         boolean $$3 = fev.a("seen", $$0, false);
         String $$4 = fev.a("type", $$0);
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
      private final fcp e;
      private final fcp f;
      private final akt g;
      @Nullable
      private final fci.b h;

      private a(fci $$0, fcp $$1, fcp $$2, akt $$3, @Nullable fci.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fci.a a(fci $$0, JsonObject $$1) {
         fcp $$2 = fev.a("title", $$1, fcp::a);
         fcp $$3 = fev.a("message", $$1, fcp::a);
         akt $$4 = new akt(fev.a("image", $$1));
         fci.b $$5 = fev.b("urlButton", $$1, fci.b::a);
         return new fci.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fjp a(fon $$0, Consumer<UUID> $$1) {
         xe $$2 = this.e.a();
         if ($$2 == null) {
            fci.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fjp.a $$3 = new fjp.a($$0, $$2).a(this.g).a(this.f.a(xd.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fci.h), $$2x -> {
                  fgj $$3x = fgj.Q();
                  $$3x.a(new fnd($$3xx -> {
                     if ($$3xx) {
                        ad.j().a(this.h.a);
                        $$3x.a($$0);
                     } else {
                        $$3x.a($$2x);
                     }
                  }, this.h.a, true));
                  $$1.accept(this.c());
               });
            }

            $$3.a(xd.h, $$1x -> {
               $$1x.d();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, fcp b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fci.b a(JsonObject $$0) {
         String $$1 = fev.a("url", $$0);
         fcp $$2 = fev.a("urlText", $$0, fcp::a);
         return new fci.b($$1, $$2);
      }
   }

   public static class c extends fci {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fcp e;
      private final fcp f;

      private c(fci $$0, String $$1, fcp $$2, fcp $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fci.c a(fci $$0, JsonObject $$1) {
         String $$2 = fev.a("url", $$1);
         fcp $$3 = fev.a("buttonText", $$1, fcp::a);
         fcp $$4 = fev.a("message", $$1, fcp::a);
         return new fci.c($$0, $$2, $$3, $$4);
      }

      public xe d() {
         return this.f.a(xe.c("mco.notification.visitUrl.message.default"));
      }

      public fin a(fon $$0) {
         xe $$1 = this.e.a(fci.h);
         return fin.a($$1, fnd.b($$0, this.d)).a();
      }
   }
}
