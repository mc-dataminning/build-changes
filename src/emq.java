import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;

public class emq {
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

   emq(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<emq> a(String $$0) {
      List<emq> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static emq a(JsonObject $$0) {
      UUID $$1 = epd.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = epd.a("dismissable", $$0, true);
         boolean $$3 = epd.a("seen", $$0, false);
         String $$4 = epd.a("type", $$0);
         emq $$5 = new emq($$1, $$2, $$3, $$4);
         return (emq)("visitUrl".equals($$4) ? emq.a.a($$5, $$0) : $$5);
      }
   }

   public static class a extends emq {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final emx e;
      private final emx f;

      private a(emq $$0, String $$1, emx $$2, emx $$3) {
         super($$0.g, $$0.h, $$0.i, $$0.j);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static emq.a a(emq $$0, JsonObject $$1) {
         String $$2 = epd.a("url", $$1);
         emx $$3 = epd.a("buttonText", $$1, emx::a);
         emx $$4 = epd.a("message", $$1, emx::a);
         return new emq.a($$0, $$2, $$3, $$4);
      }

      public ti d() {
         return this.f.a(ti.c("mco.notification.visitUrl.message.default"));
      }

      public esl a(eyf $$0) {
         ti $$1 = this.e.a(ti.c("mco.notification.visitUrl.buttonText.default"));
         return esl.a($$1, ewx.b(this.d, $$0, true)).a();
      }
   }
}
