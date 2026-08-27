import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class eyn extends ezj {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static eyn a(JsonObject $$0) {
      eyn $$1 = new eyn();

      try {
         $$1.a = fbg.b("invitationId", $$0, "");
         $$1.b = fbg.b("worldName", $$0, "");
         $$1.c = fbg.b("worldOwnerName", $$0, "");
         $$1.d = fbg.a("worldOwnerUuid", $$0, ac.e);
         $$1.e = fbg.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
