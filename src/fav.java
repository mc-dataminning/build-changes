import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import org.slf4j.Logger;

public class fav extends fbv {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public Date b;
   public long c;
   private boolean g;
   public Map<String, String> d = Maps.newHashMap();
   public Map<String, String> e = Maps.newHashMap();

   public static fav a(JsonElement $$0) {
      JsonObject $$1 = $$0.getAsJsonObject();
      fav $$2 = new fav();

      try {
         $$2.a = fds.b("backupId", $$1, "");
         $$2.b = fds.b("lastModifiedDate", $$1);
         $$2.c = fds.a("size", $$1, 0L);
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
