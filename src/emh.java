import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class emh extends end {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static emh a(JsonObject $$0) {
      emh $$1 = new emh();

      try {
         $$1.a = epa.a("invitationId", $$0, "");
         $$1.b = epa.a("worldName", $$0, "");
         $$1.c = epa.a("worldOwnerName", $$0, "");
         $$1.d = epa.a("worldOwnerUuid", $$0, ac.c);
         $$1.e = epa.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
