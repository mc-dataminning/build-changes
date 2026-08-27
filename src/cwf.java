import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record cwf(Map<ix<ddy>, dse<?>> c) {
   public static final cwf a = new cwf(Map.of());
   public static final Codec<cwf> b = Codec.dispatchedMap(le.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dse<?> $$2 = ((ddy)$$0.a()).m().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dse::f)).xmap(cwf::new, cwf::a);

   public cwf a(ix<ddy> $$0, dse<?> $$1) {
      return new cwf(ac.a(this.c, $$0, $$1));
   }

   public Map<ix<ddy>, dse<?>> a() {
      return this.c;
   }
}
