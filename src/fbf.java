import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fbf extends fbw {
   private static final Logger b = LogUtils.getLogger();
   public String a;

   public static fbf a(String $$0) {
      fbf $$1 = new fbf();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fdt.b("newsLink", $$3, null);
      } catch (Exception var4) {
         b.error("Could not parse RealmsNews: {}", var4.getMessage());
      }

      return $$1;
   }
}
