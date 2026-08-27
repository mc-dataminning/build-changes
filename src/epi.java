import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class epi extends epg {
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
   public epi.a i = epi.a.a;

   public static epi a(JsonObject $$0) {
      epi $$1 = new epi();

      try {
         $$1.a = erd.b("id", $$0, "");
         $$1.b = erd.b("name", $$0, "");
         $$1.c = erd.b("version", $$0, "");
         $$1.d = erd.b("author", $$0, "");
         $$1.e = erd.b("link", $$0, "");
         $$1.f = erd.b("image", $$0, null);
         $$1.g = erd.b("trailer", $$0, "");
         $$1.h = erd.b("recommendedPlayers", $$0, "");
         $$1.i = epi.a.valueOf(erd.b("type", $$0, epi.a.a.name()));
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
