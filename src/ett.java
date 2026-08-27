import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.List;

public class ett extends etw {
   public long a;
   public List<ets> b = Lists.newArrayList();

   public static ett a(String $$0) {
      ett $$1 = new ett();
      JsonParser $$2 = new JsonParser();

      try {
         JsonElement $$3 = $$2.parse($$0);
         JsonObject $$4 = $$3.getAsJsonObject();
         $$1.a = evt.a("periodInMillis", $$4, -1L);
         JsonElement $$5 = $$4.get("playerActivityDto");
         if ($$5 != null && $$5.isJsonArray()) {
            for (JsonElement $$7 : $$5.getAsJsonArray()) {
               ets $$8 = ets.a($$7.getAsJsonObject());
               $$1.b.add($$8);
            }
         }
      } catch (Exception var10) {
      }

      return $$1;
   }
}
