import com.google.common.base.Strings;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ejb {
   private static final Logger a = LogUtils.getLogger();
   private final String b;
   private final int c;

   private ejb(String $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   public static ejb a(String $$0) {
      if (Strings.isNullOrEmpty($$0)) {
         return null;
      } else {
         try {
            JsonObject $$1 = JsonParser.parseString($$0).getAsJsonObject();
            String $$2 = emb.a("errorMsg", $$1, "");
            int $$3 = emb.a("errorCode", $$1, -1);
            return new ejb($$2, $$3);
         } catch (Exception var4) {
            a.error("Could not parse RealmsError: {}", var4.getMessage());
            a.error("The error was: {}", $$0);
            return null;
         }
      }
   }

   public String a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }
}
