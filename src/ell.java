import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class ell extends elb {
   public static final MapCodec<ell> b = brr.b(dxv.a).comapFlatMap(ell::a, $$0 -> $$0.c).fieldOf("entries");
   private final brr<dxv> c;

   private static DataResult<ell> a(brr<dxv> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new ell($$0));
   }

   public ell(brr<dxv> $$0) {
      this.c = $$0;
   }

   public ell(brr.a<dxv> $$0) {
      this($$0.a());
   }

   @Override
   protected elc<?> a() {
      return elc.b;
   }

   @Override
   public dxv a(bam $$0, jh $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
