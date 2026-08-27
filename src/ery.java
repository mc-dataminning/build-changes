import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ery extends erw {
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
   public ery.a i = ery.a.a;

   public static ery a(JsonObject $$0) {
      ery $$1 = new ery();

      try {
         $$1.a = ett.b("id", $$0, "");
         $$1.b = ett.b("name", $$0, "");
         $$1.c = ett.b("version", $$0, "");
         $$1.d = ett.b("author", $$0, "");
         $$1.e = ett.b("link", $$0, "");
         $$1.f = ett.b("image", $$0, null);
         $$1.g = ett.b("trailer", $$0, "");
         $$1.h = ett.b("recommendedPlayers", $$0, "");
         $$1.i = ery.a.valueOf(ett.b("type", $$0, ery.a.a.name()));
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
