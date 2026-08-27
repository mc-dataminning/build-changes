import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class erb extends eqz {
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
   public erb.a i = erb.a.a;

   public static erb a(JsonObject $$0) {
      erb $$1 = new erb();

      try {
         $$1.a = esw.b("id", $$0, "");
         $$1.b = esw.b("name", $$0, "");
         $$1.c = esw.b("version", $$0, "");
         $$1.d = esw.b("author", $$0, "");
         $$1.e = esw.b("link", $$0, "");
         $$1.f = esw.b("image", $$0, null);
         $$1.g = esw.b("trailer", $$0, "");
         $$1.h = esw.b("recommendedPlayers", $$0, "");
         $$1.i = erb.a.valueOf(esw.b("type", $$0, erb.a.a.name()));
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
