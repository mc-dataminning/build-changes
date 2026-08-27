import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class enf extends end {
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
   public enf.a i = enf.a.a;

   public static enf a(JsonObject $$0) {
      enf $$1 = new enf();

      try {
         $$1.a = epa.a("id", $$0, "");
         $$1.b = epa.a("name", $$0, "");
         $$1.c = epa.a("version", $$0, "");
         $$1.d = epa.a("author", $$0, "");
         $$1.e = epa.a("link", $$0, "");
         $$1.f = epa.a("image", $$0, null);
         $$1.g = epa.a("trailer", $$0, "");
         $$1.h = epa.a("recommendedPlayers", $$0, "");
         $$1.i = enf.a.valueOf(epa.a("type", $$0, enf.a.a.name()));
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
