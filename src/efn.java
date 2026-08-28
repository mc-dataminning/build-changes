import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class efn extends efd {
   public static final MapCodec<efn> b = bpe.b(dsc.b).comapFlatMap(efn::a, $$0 -> $$0.c).fieldOf("entries");
   private final bpe<dsc> c;

   private static DataResult<efn> a(bpe<dsc> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new efn($$0));
   }

   public efn(bpe<dsc> $$0) {
      this.c = $$0;
   }

   public efn(bpe.a<dsc> $$0) {
      this($$0.a());
   }

   @Override
   protected efe<?> a() {
      return efe.b;
   }

   @Override
   public dsc a(azh $$0, iz $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
