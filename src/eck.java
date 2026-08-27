import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public class eck extends eca {
   public static final Codec<eck> b = bmk.b(doz.b).comapFlatMap(eck::a, $$0 -> $$0.c).fieldOf("entries").codec();
   private final bmk<doz> c;

   private static DataResult<eck> a(bmk<doz> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new eck($$0));
   }

   public eck(bmk<doz> $$0) {
      this.c = $$0;
   }

   public eck(bmk.a<doz> $$0) {
      this($$0.a());
   }

   @Override
   protected ecb<?> a() {
      return ecb.b;
   }

   @Override
   public doz a(axr $$0, ib $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
