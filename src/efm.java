import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class efm implements efh {
   final float a;

   efm(float $$0) {
      this.a = $$0;
   }

   @Override
   public efi b() {
      return efj.d;
   }

   public boolean a(ech $$0) {
      return $$0.b().i() < this.a;
   }

   public static efh.a a(float $$0) {
      return () -> new efm($$0);
   }

   public static class a implements ecq<efm> {
      public void a(JsonObject $$0, efm $$1, JsonSerializationContext $$2) {
         $$0.addProperty("chance", $$1.a);
      }

      public efm b(JsonObject $$0, JsonDeserializationContext $$1) {
         return new efm(arf.m($$0, "chance"));
      }
   }
}
