import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record cxb(Map<ji<deu>, dta<?>> c) {
   public static final cxb a = new cxb(Map.of());
   public static final Codec<cxb> b = Codec.dispatchedMap(lp.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dta<?> $$2 = ((deu)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dta::f)).xmap(cxb::new, cxb::a);

   public cxb a(ji<deu> $$0, dta<?> $$1) {
      return new cxb(ac.a(this.c, $$0, $$1));
   }

   public Map<ji<deu>, dta<?>> a() {
      return this.c;
   }
}
