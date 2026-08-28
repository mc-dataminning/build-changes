import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fdz extends feo {
   private static final Logger b = LogUtils.getLogger();
   public String a;

   public static fdz a(String $$0) {
      fdz $$1 = new fdz();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fgl.b("newsLink", $$3, null);
      } catch (Exception var4) {
         b.error("Could not parse RealmsNews: {}", var4.getMessage());
      }

      return $$1;
   }
}
