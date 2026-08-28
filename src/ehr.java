import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class ehr extends ehh {
   public static final MapCodec<ehr> b = bpu.b(dua.a).comapFlatMap(ehr::a, $$0 -> $$0.c).fieldOf("entries");
   private final bpu<dua> c;

   private static DataResult<ehr> a(bpu<dua> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new ehr($$0));
   }

   public ehr(bpu<dua> $$0) {
      this.c = $$0;
   }

   public ehr(bpu.a<dua> $$0) {
      this($$0.a());
   }

   @Override
   protected ehi<?> a() {
      return ehi.b;
   }

   @Override
   public dua a(azk $$0, je $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
