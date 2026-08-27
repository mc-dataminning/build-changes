import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public class eds extends edi {
   public static final Codec<eds> b = bnw.b(dqh.b).comapFlatMap(eds::a, $$0 -> $$0.c).fieldOf("entries").codec();
   private final bnw<dqh> c;

   private static DataResult<eds> a(bnw<dqh> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new eds($$0));
   }

   public eds(bnw<dqh> $$0) {
      this.c = $$0;
   }

   public eds(bnw.a<dqh> $$0) {
      this($$0.a());
   }

   @Override
   protected edj<?> a() {
      return edj.b;
   }

   @Override
   public dqh a(ayg $$0, in $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
