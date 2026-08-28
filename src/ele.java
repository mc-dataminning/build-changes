import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class ele extends eku {
   public static final MapCodec<ele> b = bri.b(dxo.a).comapFlatMap(ele::a, $$0 -> $$0.c).fieldOf("entries");
   private final bri<dxo> c;

   private static DataResult<ele> a(bri<dxo> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new ele($$0));
   }

   public ele(bri<dxo> $$0) {
      this.c = $$0;
   }

   public ele(bri.a<dxo> $$0) {
      this($$0.a());
   }

   @Override
   protected ekv<?> a() {
      return ekv.b;
   }

   @Override
   public dxo a(bac $$0, jh $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
