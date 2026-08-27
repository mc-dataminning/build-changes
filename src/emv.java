import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;

public class emv {
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

   emv(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<emv> a(String $$0) {
      List<emv> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static emv a(JsonObject $$0) {
      UUID $$1 = epi.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = epi.a("dismissable", $$0, true);
         boolean $$3 = epi.a("seen", $$0, false);
         String $$4 = epi.a("type", $$0);
         emv $$5 = new emv($$1, $$2, $$3, $$4);
         return (emv)("visitUrl".equals($$4) ? emv.a.a($$5, $$0) : $$5);
      }
   }

   public static class a extends emv {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final enc e;
      private final enc f;

      private a(emv $$0, String $$1, enc $$2, enc $$3) {
         super($$0.g, $$0.h, $$0.i, $$0.j);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static emv.a a(emv $$0, JsonObject $$1) {
         String $$2 = epi.a("url", $$1);
         enc $$3 = epi.a("buttonText", $$1, enc::a);
         enc $$4 = epi.a("message", $$1, enc::a);
         return new emv.a($$0, $$2, $$3, $$4);
      }

      public tl d() {
         return this.f.a(tl.c("mco.notification.visitUrl.message.default"));
      }

      public esq a(eyk $$0) {
         tl $$1 = this.e.a(tl.c("mco.notification.visitUrl.buttonText.default"));
         return esq.a($$1, exc.b(this.d, $$0, true)).a();
      }
   }
}
