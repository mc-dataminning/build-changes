import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class esi extends esg {
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
   public esi.a i = esi.a.a;

   public static esi a(JsonObject $$0) {
      esi $$1 = new esi();

      try {
         $$1.a = eud.b("id", $$0, "");
         $$1.b = eud.b("name", $$0, "");
         $$1.c = eud.b("version", $$0, "");
         $$1.d = eud.b("author", $$0, "");
         $$1.e = eud.b("link", $$0, "");
         $$1.f = eud.b("image", $$0, null);
         $$1.g = eud.b("trailer", $$0, "");
         $$1.h = eud.b("recommendedPlayers", $$0, "");
         $$1.i = esi.a.valueOf(eud.b("type", $$0, esi.a.a.name()));
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
