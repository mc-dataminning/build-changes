import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record cwt(Map<jj<dfi>, dto<?>> c) {
   public static final cwt a = new cwt(Map.of());
   public static final Codec<cwt> b = Codec.dispatchedMap(lq.e.s(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dto<?> $$2 = ((dfi)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dto::f)).xmap(cwt::new, cwt::a);

   public cwt a(jj<dfi> $$0, dto<?> $$1) {
      return new cwt(ac.a(this.c, $$0, $$1));
   }

   public Map<jj<dfi>, dto<?>> a() {
      return this.c;
   }
}
