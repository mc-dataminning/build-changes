import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ezv extends ezt {
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
   public ezv.a i = ezv.a.a;

   public static ezv a(JsonObject $$0) {
      ezv $$1 = new ezv();

      try {
         $$1.a = fbq.b("id", $$0, "");
         $$1.b = fbq.b("name", $$0, "");
         $$1.c = fbq.b("version", $$0, "");
         $$1.d = fbq.b("author", $$0, "");
         $$1.e = fbq.b("link", $$0, "");
         $$1.f = fbq.b("image", $$0, null);
         $$1.g = fbq.b("trailer", $$0, "");
         $$1.h = fbq.b("recommendedPlayers", $$0, "");
         $$1.i = ezv.a.valueOf(fbq.b("type", $$0, ezv.a.a.name()));
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
