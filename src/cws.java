import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record cws(Map<jj<dfh>, dtn<?>> c) {
   public static final cws a = new cws(Map.of());
   public static final Codec<cws> b = Codec.dispatchedMap(lq.e.s(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dtn<?> $$2 = ((dfh)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dtn::f)).xmap(cws::new, cws::a);

   public cws a(jj<dfh> $$0, dtn<?> $$1) {
      return new cws(ac.a(this.c, $$0, $$1));
   }

   public Map<jj<dfh>, dtn<?>> a() {
      return this.c;
   }
}
