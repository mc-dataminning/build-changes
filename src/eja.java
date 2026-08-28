import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class eja extends eiq {
   public static final MapCodec<eja> b = bql.b(dvj.a).comapFlatMap(eja::a, $$0 -> $$0.c).fieldOf("entries");
   private final bql<dvj> c;

   private static DataResult<eja> a(bql<dvj> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new eja($$0));
   }

   public eja(bql<dvj> $$0) {
      this.c = $$0;
   }

   public eja(bql.a<dvj> $$0) {
      this($$0.a());
   }

   @Override
   protected eir<?> a() {
      return eir.b;
   }

   @Override
   public dvj a(azs $$0, jh $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
