import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class eld extends ekt {
   public static final MapCodec<eld> b = brm.b(dxn.a).comapFlatMap(eld::a, $$0 -> $$0.c).fieldOf("entries");
   private final brm<dxn> c;

   private static DataResult<eld> a(brm<dxn> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new eld($$0));
   }

   public eld(brm<dxn> $$0) {
      this.c = $$0;
   }

   public eld(brm.a<dxn> $$0) {
      this($$0.a());
   }

   @Override
   protected eku<?> a() {
      return eku.b;
   }

   @Override
   public dxn a(bam $$0, jh $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
