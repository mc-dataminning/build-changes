import com.google.gson.JsonObject;

public class ffj extends ffn {
   public String a;
   public long b;
   public long c;

   public static ffj a(JsonObject $$0) {
      ffj $$1 = new ffj();

      try {
         $$1.a = fhk.b("profileUuid", $$0, null);
         $$1.b = fhk.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fhk.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
