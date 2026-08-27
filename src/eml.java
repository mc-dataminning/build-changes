import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;

public class eml {
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

   eml(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<eml> a(String $$0) {
      List<eml> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static eml a(JsonObject $$0) {
      UUID $$1 = eoy.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = eoy.a("dismissable", $$0, true);
         boolean $$3 = eoy.a("seen", $$0, false);
         String $$4 = eoy.a("type", $$0);
         eml $$5 = new eml($$1, $$2, $$3, $$4);
         return (eml)("visitUrl".equals($$4) ? eml.a.a($$5, $$0) : $$5);
      }
   }

   public static class a extends eml {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final ems e;
      private final ems f;

      private a(eml $$0, String $$1, ems $$2, ems $$3) {
         super($$0.g, $$0.h, $$0.i, $$0.j);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static eml.a a(eml $$0, JsonObject $$1) {
         String $$2 = eoy.a("url", $$1);
         ems $$3 = eoy.a("buttonText", $$1, ems::a);
         ems $$4 = eoy.a("message", $$1, ems::a);
         return new eml.a($$0, $$2, $$3, $$4);
      }

      public tf d() {
         return this.f.a(tf.c("mco.notification.visitUrl.message.default"));
      }

      public esg a(eya $$0) {
         tf $$1 = this.e.a(tf.c("mco.notification.visitUrl.buttonText.default"));
         return esg.a($$1, ews.b(this.d, $$0, true)).a();
      }
   }
}
