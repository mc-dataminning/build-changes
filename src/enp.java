import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class enp extends enn {
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
   public enp.a i = enp.a.a;

   public static enp a(JsonObject $$0) {
      enp $$1 = new enp();

      try {
         $$1.a = epk.a("id", $$0, "");
         $$1.b = epk.a("name", $$0, "");
         $$1.c = epk.a("version", $$0, "");
         $$1.d = epk.a("author", $$0, "");
         $$1.e = epk.a("link", $$0, "");
         $$1.f = epk.a("image", $$0, null);
         $$1.g = epk.a("trailer", $$0, "");
         $$1.h = epk.a("recommendedPlayers", $$0, "");
         $$1.i = enp.a.valueOf(epk.a("type", $$0, enp.a.a.name()));
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
