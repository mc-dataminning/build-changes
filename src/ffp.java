import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffp extends ffn {
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
   public ffp.a i = ffp.a.a;

   public static ffp a(JsonObject $$0) {
      ffp $$1 = new ffp();

      try {
         $$1.a = fhk.b("id", $$0, "");
         $$1.b = fhk.b("name", $$0, "");
         $$1.c = fhk.b("version", $$0, "");
         $$1.d = fhk.b("author", $$0, "");
         $$1.e = fhk.b("link", $$0, "");
         $$1.f = fhk.b("image", $$0, null);
         $$1.g = fhk.b("trailer", $$0, "");
         $$1.h = fhk.b("recommendedPlayers", $$0, "");
         $$1.i = ffp.a.valueOf(fhk.b("type", $$0, ffp.a.a.name()));
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
