import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class emk extends eng {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static emk a(JsonObject $$0) {
      emk $$1 = new emk();

      try {
         $$1.a = epd.a("invitationId", $$0, "");
         $$1.b = epd.a("worldName", $$0, "");
         $$1.c = epd.a("worldOwnerName", $$0, "");
         $$1.d = epd.a("worldOwnerUuid", $$0, ac.d);
         $$1.e = epd.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
