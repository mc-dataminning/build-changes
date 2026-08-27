import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class ecp implements eck {
   final float a;

   ecp(float $$0) {
      this.a = $$0;
   }

   @Override
   public ecl b() {
      return ecm.d;
   }

   public boolean a(dzk $$0) {
      return $$0.b().i() < this.a;
   }

   public static eck.a a(float $$0) {
      return () -> new ecp($$0);
   }

   public static class a implements dzt<ecp> {
      public void a(JsonObject $$0, ecp $$1, JsonSerializationContext $$2) {
         $$0.addProperty("chance", $$1.a);
      }

      public ecp b(JsonObject $$0, JsonDeserializationContext $$1) {
         return new ecp(aor.m($$0, "chance"));
      }
   }
}
