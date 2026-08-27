import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;

public class emm {
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

   emm(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<emm> a(String $$0) {
      List<emm> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static emm a(JsonObject $$0) {
      UUID $$1 = eoz.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = eoz.a("dismissable", $$0, true);
         boolean $$3 = eoz.a("seen", $$0, false);
         String $$4 = eoz.a("type", $$0);
         emm $$5 = new emm($$1, $$2, $$3, $$4);
         return (emm)("visitUrl".equals($$4) ? emm.a.a($$5, $$0) : $$5);
      }
   }

   public static class a extends emm {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final emt e;
      private final emt f;

      private a(emm $$0, String $$1, emt $$2, emt $$3) {
         super($$0.g, $$0.h, $$0.i, $$0.j);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static emm.a a(emm $$0, JsonObject $$1) {
         String $$2 = eoz.a("url", $$1);
         emt $$3 = eoz.a("buttonText", $$1, emt::a);
         emt $$4 = eoz.a("message", $$1, emt::a);
         return new emm.a($$0, $$2, $$3, $$4);
      }

      public tf d() {
         return this.f.a(tf.c("mco.notification.visitUrl.message.default"));
      }

      public esh a(exz $$0) {
         tf $$1 = this.e.a(tf.c("mco.notification.visitUrl.buttonText.default"));
         return esh.a($$1, ewr.b(this.d, $$0, true)).a();
      }
   }
}
