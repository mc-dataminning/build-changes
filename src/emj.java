import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class emj extends enf {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static emj a(JsonObject $$0) {
      emj $$1 = new emj();

      try {
         $$1.a = epc.a("invitationId", $$0, "");
         $$1.b = epc.a("worldName", $$0, "");
         $$1.c = epc.a("worldOwnerName", $$0, "");
         $$1.d = epc.a("worldOwnerUuid", $$0, ac.d);
         $$1.e = epc.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
