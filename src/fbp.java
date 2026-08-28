import com.google.gson.JsonObject;

public class fbp extends fbt {
   public String a;
   public long b;
   public long c;

   public static fbp a(JsonObject $$0) {
      fbp $$1 = new fbp();

      try {
         $$1.a = fdq.b("profileUuid", $$0, null);
         $$1.b = fdq.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fdq.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
