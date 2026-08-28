import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class fba extends fbw {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static fba a(JsonObject $$0) {
      fba $$1 = new fba();

      try {
         $$1.a = fdt.b("invitationId", $$0, "");
         $$1.b = fdt.b("worldName", $$0, "");
         $$1.c = fdt.b("worldOwnerName", $$0, "");
         $$1.d = fdt.a("worldOwnerUuid", $$0, ac.e);
         $$1.e = fdt.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
