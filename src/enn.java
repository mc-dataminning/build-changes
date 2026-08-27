import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class enn extends enl {
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
   public enn.a i = enn.a.a;

   public static enn a(JsonObject $$0) {
      enn $$1 = new enn();

      try {
         $$1.a = epi.a("id", $$0, "");
         $$1.b = epi.a("name", $$0, "");
         $$1.c = epi.a("version", $$0, "");
         $$1.d = epi.a("author", $$0, "");
         $$1.e = epi.a("link", $$0, "");
         $$1.f = epi.a("image", $$0, null);
         $$1.g = epi.a("trailer", $$0, "");
         $$1.h = epi.a("recommendedPlayers", $$0, "");
         $$1.i = enn.a.valueOf(epi.a("type", $$0, enn.a.a.name()));
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
