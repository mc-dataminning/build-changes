import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fby extends fbw {
   private static final Logger j = LogUtils.getLogger();
   public String a = "";
   public String b = "";
   public String c = "";
   public String d = "";
   public String e = "";
   @Nullable
   public String f;
   public String g = "";
   public String h = "";
   public fby.a i = fby.a.a;

   public static fby a(JsonObject $$0) {
      fby $$1 = new fby();

      try {
         $$1.a = fdt.b("id", $$0, "");
         $$1.b = fdt.b("name", $$0, "");
         $$1.c = fdt.b("version", $$0, "");
         $$1.d = fdt.b("author", $$0, "");
         $$1.e = fdt.b("link", $$0, "");
         $$1.f = fdt.b("image", $$0, null);
         $$1.g = fdt.b("trailer", $$0, "");
         $$1.h = fdt.b("recommendedPlayers", $$0, "");
         $$1.i = fby.a.valueOf(fdt.b("type", $$0, fby.a.a.name()));
      } catch (Exception var3) {
         j.error("Could not parse WorldTemplate: {}", var3.getMessage());
      }

      return $$1;
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }
}
