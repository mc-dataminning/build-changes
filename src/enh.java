import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class enh extends enf {
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
   public enh.a i = enh.a.a;

   public static enh a(JsonObject $$0) {
      enh $$1 = new enh();

      try {
         $$1.a = epc.a("id", $$0, "");
         $$1.b = epc.a("name", $$0, "");
         $$1.c = epc.a("version", $$0, "");
         $$1.d = epc.a("author", $$0, "");
         $$1.e = epc.a("link", $$0, "");
         $$1.f = epc.a("image", $$0, null);
         $$1.g = epc.a("trailer", $$0, "");
         $$1.h = epc.a("recommendedPlayers", $$0, "");
         $$1.i = enh.a.valueOf(epc.a("type", $$0, enh.a.a.name()));
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
