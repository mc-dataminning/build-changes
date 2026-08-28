import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fig extends fiw {
   private static final Logger b = LogUtils.getLogger();
   @Nullable
   public String a;

   public static fig a(String $$0) {
      fig $$1 = new fig();

      try {
         JsonObject $$2 = JsonParser.parseString($$0).getAsJsonObject();
         $$1.a = fks.b("newsLink", $$2, null);
      } catch (Exception var3) {
         b.error("Could not parse RealmsNews: {}", var3.getMessage());
      }

      return $$1;
   }
}
