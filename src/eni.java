import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eni extends eng {
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
   public eni.a i = eni.a.a;

   public static eni a(JsonObject $$0) {
      eni $$1 = new eni();

      try {
         $$1.a = epd.a("id", $$0, "");
         $$1.b = epd.a("name", $$0, "");
         $$1.c = epd.a("version", $$0, "");
         $$1.d = epd.a("author", $$0, "");
         $$1.e = epd.a("link", $$0, "");
         $$1.f = epd.a("image", $$0, null);
         $$1.g = epd.a("trailer", $$0, "");
         $$1.h = epd.a("recommendedPlayers", $$0, "");
         $$1.i = eni.a.valueOf(epd.a("type", $$0, eni.a.a.name()));
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
