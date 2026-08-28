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

public class fbg {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final xp h = xp.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   fbg(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<fbg> a(String $$0) {
      List<fbg> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static fbg a(JsonObject $$0) {
      UUID $$1 = fdt.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fdt.a("dismissable", $$0, true);
         boolean $$3 = fdt.a("seen", $$0, false);
         String $$4 = fdt.a("type", $$0);
         fbg $$5 = new fbg($$1, $$2, $$3, $$4);

         return (fbg)(switch ($$4) {
            case "visitUrl" -> fbg.c.a($$5, $$0);
            case "infoPopup" -> fbg.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends fbg {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final fbn e;
      private final fbn f;
      private final alf g;
      @Nullable
      private final fbg.b h;

      private a(fbg $$0, fbn $$1, fbn $$2, alf $$3, @Nullable fbg.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fbg.a a(fbg $$0, JsonObject $$1) {
         fbn $$2 = fdt.a("title", $$1, fbn::a);
         fbn $$3 = fdt.a("message", $$1, fbn::a);
         alf $$4 = new alf(fdt.a("image", $$1));
         fbg.b $$5 = fdt.b("urlButton", $$1, fbg.b::a);
         return new fbg.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fii a(fnf $$0, Consumer<UUID> $$1) {
         xp $$2 = this.e.a();
         if ($$2 == null) {
            fbg.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fii.a $$3 = new fii.a($$0, $$2).a(this.g).a(this.f.a(xo.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fbg.h), $$2x -> {
                  ffh $$3x = ffh.Q();
                  $$3x.a(new flw($$3xx -> {
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

            $$3.a(xo.h, $$1x -> {
               $$1x.d();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, fbn b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fbg.b a(JsonObject $$0) {
         String $$1 = fdt.a("url", $$0);
         fbn $$2 = fdt.a("urlText", $$0, fbn::a);
         return new fbg.b($$1, $$2);
      }
   }

   public static class c extends fbg {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fbn e;
      private final fbn f;

      private c(fbg $$0, String $$1, fbn $$2, fbn $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fbg.c a(fbg $$0, JsonObject $$1) {
         String $$2 = fdt.a("url", $$1);
         fbn $$3 = fdt.a("buttonText", $$1, fbn::a);
         fbn $$4 = fdt.a("message", $$1, fbn::a);
         return new fbg.c($$0, $$2, $$3, $$4);
      }

      public xp d() {
         return this.f.a(xp.c("mco.notification.visitUrl.message.default"));
      }

      public fhg a(fnf $$0) {
         xp $$1 = this.e.a(fbg.h);
         return fhg.a($$1, flw.b($$0, this.d)).a();
      }
   }
}
