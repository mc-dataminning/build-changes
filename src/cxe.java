import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record cxe(Map<ji<dex>, dtd<?>> c) {
   public static final cxe a = new cxe(Map.of());
   public static final Codec<cxe> b = Codec.dispatchedMap(lp.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dtd<?> $$2 = ((dex)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dtd::f)).xmap(cxe::new, cxe::a);

   public cxe a(ji<dex> $$0, dtd<?> $$1) {
      return new cxe(ac.a(this.c, $$0, $$1));
   }

   public Map<ji<dex>, dtd<?>> a() {
      return this.c;
   }
}
