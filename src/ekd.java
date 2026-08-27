import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ekd extends ekf {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public ekd.a c = ekd.a.a;

   public static ekd a(String $$0) {
      ekd $$1 = new ekd();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = emb.a("startDate", $$3, 0L);
         $$1.b = emb.a("daysLeft", $$3, 0);
         $$1.c = b(emb.a("subscriptionType", $$3, ekd.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static ekd.a b(String $$0) {
      try {
         return ekd.a.valueOf($$0);
      } catch (Exception var2) {
         return ekd.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
