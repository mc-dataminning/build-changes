import com.google.gson.JsonObject;

public class ekb extends ekf {
   public String a;
   public long b;
   public long c;

   public static ekb a(JsonObject $$0) {
      ekb $$1 = new ekb();

      try {
         $$1.a = emb.a("profileUuid", $$0, null);
         $$1.b = emb.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = emb.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
