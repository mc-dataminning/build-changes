import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class euf extends eud {
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
   public euf.a i = euf.a.a;

   public static euf a(JsonObject $$0) {
      euf $$1 = new euf();

      try {
         $$1.a = ewa.b("id", $$0, "");
         $$1.b = ewa.b("name", $$0, "");
         $$1.c = ewa.b("version", $$0, "");
         $$1.d = ewa.b("author", $$0, "");
         $$1.e = ewa.b("link", $$0, "");
         $$1.f = ewa.b("image", $$0, null);
         $$1.g = ewa.b("trailer", $$0, "");
         $$1.h = ewa.b("recommendedPlayers", $$0, "");
         $$1.i = euf.a.valueOf(ewa.b("type", $$0, euf.a.a.name()));
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
