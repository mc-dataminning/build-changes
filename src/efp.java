import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class efp extends eff {
   public static final MapCodec<efp> b = bpg.b(dse.b).comapFlatMap(efp::a, $$0 -> $$0.c).fieldOf("entries");
   private final bpg<dse> c;

   private static DataResult<efp> a(bpg<dse> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new efp($$0));
   }

   public efp(bpg<dse> $$0) {
      this.c = $$0;
   }

   public efp(bpg.a<dse> $$0) {
      this($$0.a());
   }

   @Override
   protected efg<?> a() {
      return efg.b;
   }

   @Override
   public dse a(azh $$0, iz $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
