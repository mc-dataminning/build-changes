import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;

public class fbj extends fci {
   private static final Logger b = LogUtils.getLogger();
   public List<fbi> a;

   public static fbj a(String $$0) {
      JsonParser $$1 = new JsonParser();
      fbj $$2 = new fbj();
      $$2.a = Lists.newArrayList();

      try {
         JsonElement $$3 = $$1.parse($$0).getAsJsonObject().get("backups");
         if ($$3.isJsonArray()) {
            Iterator<JsonElement> $$4 = $$3.getAsJsonArray().iterator();

            while ($$4.hasNext()) {
               $$2.a.add(fbi.a($$4.next()));
            }
         }
      } catch (Exception var5) {
         b.error("Could not parse BackupList: {}", var5.getMessage());
      }

      return $$2;
   }
}
