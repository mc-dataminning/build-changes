import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class emg extends enc {
   private static final Logger f = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;
   public UUID d;
   public Date e;

   public static emg a(JsonObject $$0) {
      emg $$1 = new emg();

      try {
         $$1.a = eoz.a("invitationId", $$0, "");
         $$1.b = eoz.a("worldName", $$0, "");
         $$1.c = eoz.a("worldOwnerName", $$0, "");
         $$1.d = eoz.a("worldOwnerUuid", $$0, ac.d);
         $$1.e = eoz.b("date", $$0);
      } catch (Exception var3) {
         f.error("Could not parse PendingInvite: {}", var3.getMessage());
      }

      return $$1;
   }
}
