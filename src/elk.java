import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class elk extends ela {
   public static final MapCodec<elk> b = brq.b(dxu.a).comapFlatMap(elk::a, $$0 -> $$0.c).fieldOf("entries");
   private final brq<dxu> c;

   private static DataResult<elk> a(brq<dxu> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new elk($$0));
   }

   public elk(brq<dxu> $$0) {
      this.c = $$0;
   }

   public elk(brq.a<dxu> $$0) {
      this($$0.a());
   }

   @Override
   protected elb<?> a() {
      return elb.b;
   }

   @Override
   public dxu a(bam $$0, jh $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
