import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class fib extends fiw {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static fib a(JsonObject $$0) {
      fib $$1 = new fib();

      try {
         $$1.a = fks.b("invitationId", $$0, "");
         $$1.b = fks.b("worldName", $$0, "");
         $$1.c = fks.b("worldOwnerName", $$0, "");
         $$1.d = fks.a("worldOwnerUuid", $$0, ae.e);
         $$1.e = fks.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
