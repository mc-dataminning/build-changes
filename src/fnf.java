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

public class fnf {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final xc h = xc.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   fnf(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<fnf> a(String $$0) {
      List<fnf> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static fnf a(JsonObject $$0) {
      UUID $$1 = fpr.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fpr.a("dismissable", $$0, true);
         boolean $$3 = fpr.a("seen", $$0, false);
         String $$4 = fpr.a("type", $$0);
         fnf $$5 = new fnf($$1, $$2, $$3, $$4);

         return (fnf)(switch ($$4) {
            case "visitUrl" -> fnf.c.a($$5, $$0);
            case "infoPopup" -> fnf.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends fnf {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final fnl e;
      private final fnl f;
      private final alk g;
      @Nullable
      private final fnf.b h;

      private a(fnf $$0, fnl $$1, fnl $$2, alk $$3, @Nullable fnf.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fnf.a a(fnf $$0, JsonObject $$1) {
         fnl $$2 = fpr.a("title", $$1, fnl::a);
         fnl $$3 = fpr.a("message", $$1, fnl::a);
         alk $$4 = alk.a(fpr.a("image", $$1));
         fnf.b $$5 = fpr.b("urlButton", $$1, fnf.b::a);
         return new fnf.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fvp a(gaf $$0, Consumer<UUID> $$1) {
         xc $$2 = this.e.a();
         if ($$2 == null) {
            fnf.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fvp.a $$3 = new fvp.a($$0, $$2).a(this.g).a(this.f.a(xb.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fnf.h), $$2x -> {
                  frf $$3x = frf.Q();
                  $$3x.a(new fzc($$3xx -> {
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

            $$3.a(xb.h, $$1x -> {
               $$1x.aP_();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, fnl b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fnf.b a(JsonObject $$0) {
         String $$1 = fpr.a("url", $$0);
         fnl $$2 = fpr.a("urlText", $$0, fnl::a);
         return new fnf.b($$1, $$2);
      }
   }

   public static class c extends fnf {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fnl e;
      private final fnl f;

      private c(fnf $$0, String $$1, fnl $$2, fnl $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fnf.c a(fnf $$0, JsonObject $$1) {
         String $$2 = fpr.a("url", $$1);
         fnl $$3 = fpr.a("buttonText", $$1, fnl::a);
         fnl $$4 = fpr.a("message", $$1, fnl::a);
         return new fnf.c($$0, $$2, $$3, $$4);
      }

      public xc d() {
         return this.f.a(xc.c("mco.notification.visitUrl.message.default"));
      }

      public fun a(gaf $$0) {
         xc $$1 = this.e.a(fnf.h);
         return fun.a($$1, fzc.b($$0, this.d)).a();
      }
   }
}
