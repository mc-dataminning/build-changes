import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class fmk extends fnf {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static fmk a(JsonObject $$0) {
      fmk $$1 = new fmk();

      try {
         $$1.a = fpc.b("invitationId", $$0, "");
         $$1.b = fpc.b("worldName", $$0, "");
         $$1.c = fpc.b("worldOwnerName", $$0, "");
         $$1.d = fpc.a("worldOwnerUuid", $$0, ag.e);
         $$1.e = fpc.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
