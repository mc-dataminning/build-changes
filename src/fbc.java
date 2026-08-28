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

public class fbc {
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

   fbc(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<fbc> a(String $$0) {
      List<fbc> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static fbc a(JsonObject $$0) {
      UUID $$1 = fdp.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fdp.a("dismissable", $$0, true);
         boolean $$3 = fdp.a("seen", $$0, false);
         String $$4 = fdp.a("type", $$0);
         fbc $$5 = new fbc($$1, $$2, $$3, $$4);

         return (fbc)(switch ($$4) {
            case "visitUrl" -> fbc.c.a($$5, $$0);
            case "infoPopup" -> fbc.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends fbc {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final fbj e;
      private final fbj f;
      private final ale g;
      @Nullable
      private final fbc.b h;

      private a(fbc $$0, fbj $$1, fbj $$2, ale $$3, @Nullable fbc.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fbc.a a(fbc $$0, JsonObject $$1) {
         fbj $$2 = fdp.a("title", $$1, fbj::a);
         fbj $$3 = fdp.a("message", $$1, fbj::a);
         ale $$4 = new ale(fdp.a("image", $$1));
         fbc.b $$5 = fdp.b("urlButton", $$1, fbc.b::a);
         return new fbc.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fie a(fnb $$0, Consumer<UUID> $$1) {
         xo $$2 = this.e.a();
         if ($$2 == null) {
            fbc.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fie.a $$3 = new fie.a($$0, $$2).a(this.g).a(this.f.a(xn.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fbc.h), $$2x -> {
                  ffd $$3x = ffd.Q();
                  $$3x.a(new fls($$3xx -> {
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

   static record b(String a, fbj b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fbc.b a(JsonObject $$0) {
         String $$1 = fdp.a("url", $$0);
         fbj $$2 = fdp.a("urlText", $$0, fbj::a);
         return new fbc.b($$1, $$2);
      }
   }

   public static class c extends fbc {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fbj e;
      private final fbj f;

      private c(fbc $$0, String $$1, fbj $$2, fbj $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fbc.c a(fbc $$0, JsonObject $$1) {
         String $$2 = fdp.a("url", $$1);
         fbj $$3 = fdp.a("buttonText", $$1, fbj::a);
         fbj $$4 = fdp.a("message", $$1, fbj::a);
         return new fbc.c($$0, $$2, $$3, $$4);
      }

      public xo d() {
         return this.f.a(xo.c("mco.notification.visitUrl.message.default"));
      }

      public fhc a(fnb $$0) {
         xo $$1 = this.e.a(fbc.h);
         return fhc.a($$1, fls.b($$0, this.d)).a();
      }
   }
}
