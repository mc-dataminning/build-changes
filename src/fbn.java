import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Set;

public class fbn extends fck {
   public Set<String> a = Sets.newHashSet();

   public static fbn a(String $$0) {
      fbn $$1 = new fbn();
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
