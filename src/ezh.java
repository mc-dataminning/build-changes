import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ezh extends ezj {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public ezh.a c = ezh.a.a;

   public static ezh a(String $$0) {
      ezh $$1 = new ezh();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fbg.a("startDate", $$3, 0L);
         $$1.b = fbg.a("daysLeft", $$3, 0);
         $$1.c = b(fbg.b("subscriptionType", $$3, ezh.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static ezh.a b(String $$0) {
      try {
         return ezh.a.valueOf($$0);
      } catch (Exception var2) {
         return ezh.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
