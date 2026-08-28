import com.google.gson.JsonObject;

public class fbr extends fbv {
   public String a;
   public long b;
   public long c;

   public static fbr a(JsonObject $$0) {
      fbr $$1 = new fbr();

      try {
         $$1.a = fds.b("profileUuid", $$0, null);
         $$1.b = fds.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fds.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
