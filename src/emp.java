import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class emp extends end {
   private static final Logger d = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;

   public static emp a(String $$0) {
      JsonParser $$1 = new JsonParser();
      emp $$2 = new emp();

      try {
         JsonObject $$3 = $$1.parse($$0).getAsJsonObject();
         $$2.a = epa.a("address", $$3, null);
         $$2.b = epa.a("resourcePackUrl", $$3, null);
         $$2.c = epa.a("resourcePackHash", $$3, null);
      } catch (Exception var4) {
         d.error("Could not parse RealmsServerAddress: {}", var4.getMessage());
      }

      return $$2;
   }
}
