import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class efn implements efh {
   final float a;
   final float b;

   efn(float $$0, float $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public efi b() {
      return efj.e;
   }

   @Override
   public Set<eeq<?>> a() {
      return ImmutableSet.of(eet.d);
   }

   public boolean a(ech $$0) {
      big $$1 = $$0.c(eet.d);
      int $$2 = 0;
      if ($$1 instanceof biw) {
         $$2 = cnf.h((biw)$$1);
      }

      return $$0.b().i() < this.a + (float)$$2 * this.b;
   }

   public static efh.a a(float $$0, float $$1) {
      return () -> new efn($$0, $$1);
   }

   public static class a implements ecq<efn> {
      public void a(JsonObject $$0, efn $$1, JsonSerializationContext $$2) {
         $$0.addProperty("chance", $$1.a);
         $$0.addProperty("looting_multiplier", $$1.b);
      }

      public efn b(JsonObject $$0, JsonDeserializationContext $$1) {
         return new efn(arf.m($$0, "chance"), arf.m($$0, "looting_multiplier"));
      }
   }
}
