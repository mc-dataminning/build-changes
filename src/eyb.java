import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.List;

public class eyb extends eye {
   public long a;
   public List<eya> b = Lists.newArrayList();

   public static eyb a(String $$0) {
      eyb $$1 = new eyb();
      JsonParser $$2 = new JsonParser();

      try {
         JsonElement $$3 = $$2.parse($$0);
         JsonObject $$4 = $$3.getAsJsonObject();
         $$1.a = fab.a("periodInMillis", $$4, -1L);
         JsonElement $$5 = $$4.get("playerActivityDto");
         if ($$5 != null && $$5.isJsonArray()) {
            for (JsonElement $$7 : $$5.getAsJsonArray()) {
               eya $$8 = eya.a($$7.getAsJsonObject());
               $$1.b.add($$8);
            }
         }
      } catch (Exception var10) {
      }

      return $$1;
   }
}
