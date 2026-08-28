import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record cys(Map<jq<dij>, dwq<?>> c) {
   public static final cys a = new cys(Map.of());
   public static final Codec<cys> b = Codec.dispatchedMap(lz.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dwq<?> $$2 = ((dij)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dwq::f)).xmap(cys::new, cys::a);

   public cys a(jq<dij> $$0, dwq<?> $$1) {
      return new cys(ae.a(this.c, $$0, $$1));
   }

   public Map<jq<dij>, dwq<?>> a() {
      return this.c;
   }
}
