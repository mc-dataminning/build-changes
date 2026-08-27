import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class ecq implements eck {
   final float a;
   final float b;

   ecq(float $$0, float $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ecl b() {
      return ecm.e;
   }

   @Override
   public Set<ebt<?>> a() {
      return ImmutableSet.of(ebw.d);
   }

   public boolean a(dzk $$0) {
      bfj $$1 = $$0.c(ebw.d);
      int $$2 = 0;
      if ($$1 instanceof bfz) {
         $$2 = cki.h((bfz)$$1);
      }

      return $$0.b().i() < this.a + (float)$$2 * this.b;
   }

   public static eck.a a(float $$0, float $$1) {
      return () -> new ecq($$0, $$1);
   }

   public static class a implements dzt<ecq> {
      public void a(JsonObject $$0, ecq $$1, JsonSerializationContext $$2) {
         $$0.addProperty("chance", $$1.a);
         $$0.addProperty("looting_multiplier", $$1.b);
      }

      public ecq b(JsonObject $$0, JsonDeserializationContext $$1) {
         return new ecq(aor.m($$0, "chance"), aor.m($$0, "looting_multiplier"));
      }
   }
}
