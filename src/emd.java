import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import org.slf4j.Logger;

public class emd extends end {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public Date b;
   public long c;
   private boolean g;
   public Map<String, String> d = Maps.newHashMap();
   public Map<String, String> e = Maps.newHashMap();

   public static emd a(JsonElement $$0) {
      JsonObject $$1 = $$0.getAsJsonObject();
      emd $$2 = new emd();

      try {
         $$2.a = epa.a("backupId", $$1, "");
         $$2.b = epa.b("lastModifiedDate", $$1);
         $$2.c = epa.a("size", $$1, 0L);
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
