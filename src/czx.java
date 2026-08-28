import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record czx(Map<jq<dke>, dyp<?>> c) {
   public static final czx a = new czx(Map.of());
   public static final Codec<czx> b = Codec.dispatchedMap(ma.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dyp<?> $$2 = ((dke)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dyp::f)).xmap(czx::new, czx::a);

   public czx a(jq<dke> $$0, dyp<?> $$1) {
      return new czx(ae.a(this.c, $$0, $$1));
   }

   public Map<jq<dke>, dyp<?>> a() {
      return this.c;
   }
}
