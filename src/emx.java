import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;

public class emx {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   final UUID g;
   final boolean h;
   final boolean i;
   final String j;

   emx(UUID $$0, boolean $$1, boolean $$2, String $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
   }

   public boolean a() {
      return this.i;
   }

   public boolean b() {
      return this.h;
   }

   public UUID c() {
      return this.g;
   }

   public static List<emx> a(String $$0) {
      List<emx> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static emx a(JsonObject $$0) {
      UUID $$1 = epk.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = epk.a("dismissable", $$0, true);
         boolean $$3 = epk.a("seen", $$0, false);
         String $$4 = epk.a("type", $$0);
         emx $$5 = new emx($$1, $$2, $$3, $$4);
         return (emx)("visitUrl".equals($$4) ? emx.a.a($$5, $$0) : $$5);
      }
   }

   public static class a extends emx {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final ene e;
      private final ene f;

      private a(emx $$0, String $$1, ene $$2, ene $$3) {
         super($$0.g, $$0.h, $$0.i, $$0.j);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static emx.a a(emx $$0, JsonObject $$1) {
         String $$2 = epk.a("url", $$1);
         ene $$3 = epk.a("buttonText", $$1, ene::a);
         ene $$4 = epk.a("message", $$1, ene::a);
         return new emx.a($$0, $$2, $$3, $$4);
      }

      public tn d() {
         return this.f.a(tn.c("mco.notification.visitUrl.message.default"));
      }

      public ess a(eym $$0) {
         tn $$1 = this.e.a(tn.c("mco.notification.visitUrl.buttonText.default"));
         return ess.a($$1, exe.b(this.d, $$0, true)).a();
      }
   }
}
