import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class end extends enb {
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
   public end.a i = end.a.a;

   public static end a(JsonObject $$0) {
      end $$1 = new end();

      try {
         $$1.a = eoy.a("id", $$0, "");
         $$1.b = eoy.a("name", $$0, "");
         $$1.c = eoy.a("version", $$0, "");
         $$1.d = eoy.a("author", $$0, "");
         $$1.e = eoy.a("link", $$0, "");
         $$1.f = eoy.a("image", $$0, null);
         $$1.g = eoy.a("trailer", $$0, "");
         $$1.h = eoy.a("recommendedPlayers", $$0, "");
         $$1.i = end.a.valueOf(eoy.a("type", $$0, end.a.a.name()));
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
