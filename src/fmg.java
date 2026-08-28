import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;

public class fmg extends fmd {
   private static final Logger e = LogUtils.getLogger();
   public List<fmf> a;
   public int b;
   public int c;
   public int d;

   public fmg() {
   }

   public fmg(int $$0) {
      this.a = Collections.emptyList();
      this.b = 0;
      this.c = $$0;
      this.d = -1;
   }

   public boolean a() {
      return this.b * this.c >= this.d && this.b > 0 && this.d > 0 && this.c > 0;
   }

   public static fmg a(String $$0) {
      fmg $$1 = new fmg();
      $$1.a = Lists.newArrayList();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         if ($$3.get("templates").isJsonArray()) {
            Iterator<JsonElement> $$4 = $$3.get("templates").getAsJsonArray().iterator();

            while ($$4.hasNext()) {
               $$1.a.add(fmf.a($$4.next().getAsJsonObject()));
            }
         }

         $$1.b = fnz.a("page", $$3, 0);
         $$1.c = fnz.a("size", $$3, 0);
         $$1.d = fnz.a("total", $$3, 0);
      } catch (Exception var5) {
         e.error("Could not parse WorldTemplatePaginatedList: {}", var5.getMessage());
      }

      return $$1;
   }
}
