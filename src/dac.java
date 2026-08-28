import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record dac(Map<jq<dkm>, dyx<?>> c) {
   public static final dac a = new dac(Map.of());
   public static final Codec<dac> b = Codec.dispatchedMap(ma.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dyx<?> $$2 = ((dkm)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dyx::f)).xmap(dac::new, dac::a);

   public dac a(jq<dkm> $$0, dyx<?> $$1) {
      return new dac(ae.a(this.c, $$0, $$1));
   }

   public Map<jq<dkm>, dyx<?>> a() {
      return this.c;
   }
}
