import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import org.slf4j.Logger;

public class fea extends fey {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public Date b;
   public long c;
   private boolean g;
   public Map<String, String> d = Maps.newHashMap();
   public Map<String, String> e = Maps.newHashMap();

   public static fea a(JsonElement $$0) {
      JsonObject $$1 = $$0.getAsJsonObject();
      fea $$2 = new fea();

      try {
         $$2.a = fgv.b("backupId", $$1, "");
         $$2.b = fgv.b("lastModifiedDate", $$1);
         $$2.c = fgv.a("size", $$1, 0L);
         if ($$1.has("metadata")) {
            JsonObject $$3 = $$1.getAsJsonObject("metadata");

            for (Entry<String, JsonElement> $$5 : $$3.entrySet()) {
               if (!$$5.getValue().isJsonNull()) {
                  $$2.d.put($$5.getKey(), $$5.getValue().getAsString());
               }
            }
         }
      } catch (Exception var7) {
         f.error("Could not parse Backup: {}", var7.getMessage());
      }

      return $$2;
   }

   public boolean a() {
      return this.g;
   }

   public void a(boolean $$0) {
      this.g = $$0;
   }
}
