import com.google.gson.JsonObject;

public class evr extends evv {
   public String a;
   public long b;
   public long c;

   public static evr a(JsonObject $$0) {
      evr $$1 = new evr();

      try {
         $$1.a = exs.b("profileUuid", $$0, null);
         $$1.b = exs.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = exs.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
