import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.List;

public class emz extends enc {
   public long a;
   public List<emy> b = Lists.newArrayList();

   public static emz a(String $$0) {
      emz $$1 = new emz();
      JsonParser $$2 = new JsonParser();

      try {
         JsonElement $$3 = $$2.parse($$0);
         JsonObject $$4 = $$3.getAsJsonObject();
         $$1.a = eoz.a("periodInMillis", $$4, -1L);
         JsonElement $$5 = $$4.get("playerActivityDto");
         if ($$5 != null && $$5.isJsonArray()) {
            for (JsonElement $$7 : $$5.getAsJsonArray()) {
               emy $$8 = emy.a($$7.getAsJsonObject());
               $$1.b.add($$8);
            }
         }
      } catch (Exception var10) {
      }

      return $$1;
   }
}
