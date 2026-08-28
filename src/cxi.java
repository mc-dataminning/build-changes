import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record cxi(Map<ji<dfb>, dth<?>> c) {
   public static final cxi a = new cxi(Map.of());
   public static final Codec<cxi> b = Codec.dispatchedMap(lp.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dth<?> $$2 = ((dfb)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dth::f)).xmap(cxi::new, cxi::a);

   public cxi a(ji<dfb> $$0, dth<?> $$1) {
      return new cxi(ac.a(this.c, $$0, $$1));
   }

   public Map<ji<dfb>, dth<?>> a() {
      return this.c;
   }
}
