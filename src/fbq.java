import com.google.gson.JsonObject;

public class fbq extends fbu {
   public String a;
   public long b;
   public long c;

   public static fbq a(JsonObject $$0) {
      fbq $$1 = new fbq();

      try {
         $$1.a = fdr.b("profileUuid", $$0, null);
         $$1.b = fdr.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fdr.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
