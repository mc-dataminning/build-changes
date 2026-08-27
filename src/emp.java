import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class emp extends enl {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static emp a(JsonObject $$0) {
      emp $$1 = new emp();

      try {
         $$1.a = epi.a("invitationId", $$0, "");
         $$1.b = epi.a("worldName", $$0, "");
         $$1.c = epi.a("worldOwnerName", $$0, "");
         $$1.d = epi.a("worldOwnerUuid", $$0, ac.d);
         $$1.e = epi.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
