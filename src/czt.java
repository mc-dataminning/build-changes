import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record czt(Map<jq<dkd>, dyq<?>> c) {
   public static final czt a = new czt(Map.of());
   public static final Codec<czt> b = Codec.dispatchedMap(ma.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dyq<?> $$2 = ((dkd)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dyq::f)).xmap(czt::new, czt::a);

   public czt a(jq<dkd> $$0, dyq<?> $$1) {
      return new czt(ae.a(this.c, $$0, $$1));
   }

   public Map<jq<dkd>, dyq<?>> a() {
      return this.c;
   }
}
