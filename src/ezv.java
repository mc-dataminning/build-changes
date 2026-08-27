import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;

public class ezv extends faq {
   private static final Logger b = LogUtils.getLogger();
   public List<ezu> a = Lists.newArrayList();

   public static ezv a(String $$0) {
      ezv $$1 = new ezv();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         if ($$3.get("invites").isJsonArray()) {
            Iterator<JsonElement> $$4 = $$3.get("invites").getAsJsonArray().iterator();

            while ($$4.hasNext()) {
               $$1.a.add(ezu.a($$4.next().getAsJsonObject()));
            }
         }
      } catch (Exception var5) {
         b.error("Could not parse PendingInvitesList: {}", var5.getMessage());
      }

      return $$1;
   }
}
