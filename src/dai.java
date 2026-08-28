import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record dai(Map<js<dku>, dzp<?>> c) {
   public static final dai a = new dai(Map.of());
   public static final Codec<dai> b = Codec.dispatchedMap(md.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dzp<?> $$2 = ((dku)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dzp::f)).xmap(dai::new, dai::a);

   public dai a(js<dku> $$0, dzp<?> $$1) {
      return new dai(af.a(this.c, $$0, $$1));
   }

   public Map<js<dku>, dzp<?>> a() {
      return this.c;
   }
}
