import com.google.gson.JsonObject;

public class fim extends fiq {
   public String a;
   public long b;
   public long c;

   public static fim a(JsonObject $$0) {
      fim $$1 = new fim();

      try {
         $$1.a = fkm.b("profileUuid", $$0, null);
         $$1.b = fkm.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fkm.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
