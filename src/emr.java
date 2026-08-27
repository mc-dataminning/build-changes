import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class emr extends enn {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static emr a(JsonObject $$0) {
      emr $$1 = new emr();

      try {
         $$1.a = epk.a("invitationId", $$0, "");
         $$1.b = epk.a("worldName", $$0, "");
         $$1.c = epk.a("worldOwnerName", $$0, "");
         $$1.d = epk.a("worldOwnerUuid", $$0, ac.d);
         $$1.e = epk.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
