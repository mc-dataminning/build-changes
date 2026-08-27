import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class emf extends enb {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static emf a(JsonObject $$0) {
      emf $$1 = new emf();

      try {
         $$1.a = eoy.a("invitationId", $$0, "");
         $$1.b = eoy.a("worldName", $$0, "");
         $$1.c = eoy.a("worldOwnerName", $$0, "");
         $$1.d = eoy.a("worldOwnerUuid", $$0, ac.d);
         $$1.e = eoy.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
