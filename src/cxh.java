import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record cxh(Map<ji<dfa>, dtg<?>> c) {
   public static final cxh a = new cxh(Map.of());
   public static final Codec<cxh> b = Codec.dispatchedMap(lp.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dtg<?> $$2 = ((dfa)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dtg::f)).xmap(cxh::new, cxh::a);

   public cxh a(ji<dfa> $$0, dtg<?> $$1) {
      return new cxh(ac.a(this.c, $$0, $$1));
   }

   public Map<ji<dfa>, dtg<?>> a() {
      return this.c;
   }
}
