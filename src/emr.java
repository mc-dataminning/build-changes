import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class emr extends enf {
   private static final Logger d = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;

   public static emr a(String $$0) {
      JsonParser $$1 = new JsonParser();
      emr $$2 = new emr();

      try {
         JsonObject $$3 = $$1.parse($$0).getAsJsonObject();
         $$2.a = epc.a("address", $$3, null);
         $$2.b = epc.a("resourcePackUrl", $$3, null);
         $$2.c = epc.a("resourcePackHash", $$3, null);
      } catch (Exception var4) {
         d.error("Could not parse RealmsServerAddress: {}", var4.getMessage());
      }

      return $$2;
   }
}
