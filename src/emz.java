import com.google.gson.JsonObject;

public class emz extends end {
   public String a;
   public long b;
   public long c;

   public static emz a(JsonObject $$0) {
      emz $$1 = new emz();

      try {
         $$1.a = epa.a("profileUuid", $$0, null);
         $$1.b = epa.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = epa.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
