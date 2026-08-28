import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fnh extends fnf {
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
   public fnh.a i = fnh.a.a;

   public static fnh a(JsonObject $$0) {
      fnh $$1 = new fnh();

      try {
         $$1.a = fpc.b("id", $$0, "");
         $$1.b = fpc.b("name", $$0, "");
         $$1.c = fpc.b("version", $$0, "");
         $$1.d = fpc.b("author", $$0, "");
         $$1.e = fpc.b("link", $$0, "");
         $$1.f = fpc.b("image", $$0, null);
         $$1.g = fpc.b("trailer", $$0, "");
         $$1.h = fpc.b("recommendedPlayers", $$0, "");
         $$1.i = fnh.a.valueOf(fpc.b("type", $$0, fnh.a.a.name()));
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
