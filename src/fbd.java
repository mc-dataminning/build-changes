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

public class fbd {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final xo h = xo.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   fbd(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<fbd> a(String $$0) {
      List<fbd> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static fbd a(JsonObject $$0) {
      UUID $$1 = fdq.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fdq.a("dismissable", $$0, true);
         boolean $$3 = fdq.a("seen", $$0, false);
         String $$4 = fdq.a("type", $$0);
         fbd $$5 = new fbd($$1, $$2, $$3, $$4);

         return (fbd)(switch ($$4) {
            case "visitUrl" -> fbd.c.a($$5, $$0);
            case "infoPopup" -> fbd.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends fbd {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final fbk e;
      private final fbk f;
      private final ale g;
      @Nullable
      private final fbd.b h;

      private a(fbd $$0, fbk $$1, fbk $$2, ale $$3, @Nullable fbd.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fbd.a a(fbd $$0, JsonObject $$1) {
         fbk $$2 = fdq.a("title", $$1, fbk::a);
         fbk $$3 = fdq.a("message", $$1, fbk::a);
         ale $$4 = new ale(fdq.a("image", $$1));
         fbd.b $$5 = fdq.b("urlButton", $$1, fbd.b::a);
         return new fbd.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fif a(fnc $$0, Consumer<UUID> $$1) {
         xo $$2 = this.e.a();
         if ($$2 == null) {
            fbd.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fif.a $$3 = new fif.a($$0, $$2).a(this.g).a(this.f.a(xn.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fbd.h), $$2x -> {
                  ffe $$3x = ffe.Q();
                  $$3x.a(new flt($$3xx -> {
                     if ($$3xx) {
                        ac.k().a(this.h.a);
                        $$3x.a($$0);
                     } else {
                        $$3x.a($$2x);
                     }
                  }, this.h.a, true));
                  $$1.accept(this.c());
               });
            }

            $$3.a(xn.h, $$1x -> {
               $$1x.d();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, fbk b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fbd.b a(JsonObject $$0) {
         String $$1 = fdq.a("url", $$0);
         fbk $$2 = fdq.a("urlText", $$0, fbk::a);
         return new fbd.b($$1, $$2);
      }
   }

   public static class c extends fbd {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fbk e;
      private final fbk f;

      private c(fbd $$0, String $$1, fbk $$2, fbk $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fbd.c a(fbd $$0, JsonObject $$1) {
         String $$2 = fdq.a("url", $$1);
         fbk $$3 = fdq.a("buttonText", $$1, fbk::a);
         fbk $$4 = fdq.a("message", $$1, fbk::a);
         return new fbd.c($$0, $$2, $$3, $$4);
      }

      public xo d() {
         return this.f.a(xo.c("mco.notification.visitUrl.message.default"));
      }

      public fhd a(fnc $$0) {
         xo $$1 = this.e.a(fbd.h);
         return fhd.a($$1, flt.b($$0, this.d)).a();
      }
   }
}
