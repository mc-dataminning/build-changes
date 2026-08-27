import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Set;

public class ezr extends fao {
   public Set<String> a = Sets.newHashSet();

   public static ezr a(String $$0) {
      ezr $$1 = new ezr();
      JsonParser $$2 = new JsonParser();

      try {
         JsonElement $$3 = $$2.parse($$0);
         JsonObject $$4 = $$3.getAsJsonObject();
         JsonElement $$5 = $$4.get("ops");
         if ($$5.isJsonArray()) {
            for (JsonElement $$6 : $$5.getAsJsonArray()) {
               $$1.a.add($$6.getAsString());
            }
         }
      } catch (Exception var8) {
      }

      return $$1;
   }
}
