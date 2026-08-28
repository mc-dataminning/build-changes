import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record cwq(Map<jj<dff>, dtk<?>> c) {
   public static final cwq a = new cwq(Map.of());
   public static final Codec<cwq> b = Codec.dispatchedMap(lq.e.s(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dtk<?> $$2 = ((dff)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dtk::f)).xmap(cwq::new, cwq::a);

   public cwq a(jj<dff> $$0, dtk<?> $$1) {
      return new cwq(ac.a(this.c, $$0, $$1));
   }

   public Map<jj<dff>, dtk<?>> a() {
      return this.c;
   }
}
