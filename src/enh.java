import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class enh extends eod {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static enh a(JsonObject $$0) {
      enh $$1 = new enh();

      try {
         $$1.a = eqa.a("invitationId", $$0, "");
         $$1.b = eqa.a("worldName", $$0, "");
         $$1.c = eqa.a("worldOwnerName", $$0, "");
         $$1.d = eqa.a("worldOwnerUuid", $$0, ac.d);
         $$1.e = eqa.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
