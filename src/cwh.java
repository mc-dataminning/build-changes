import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record cwh(Map<ix<dea>, dsg<?>> c) {
   public static final cwh a = new cwh(Map.of());
   public static final Codec<cwh> b = Codec.dispatchedMap(le.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dsg<?> $$2 = ((dea)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dsg::f)).xmap(cwh::new, cwh::a);

   public cwh a(ix<dea> $$0, dsg<?> $$1) {
      return new cwh(ac.a(this.c, $$0, $$1));
   }

   public Map<ix<dea>, dsg<?>> a() {
      return this.c;
   }
}
