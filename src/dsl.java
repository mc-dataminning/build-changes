import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public class dsl extends dsb {
   public static final Codec<dsl> b = bfi.b(dfj.b).comapFlatMap(dsl::a, $$0 -> $$0.c).fieldOf("entries").codec();
   private final bfi<dfj> c;

   private static DataResult<dsl> a(bfi<dfj> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new dsl($$0));
   }

   public dsl(bfi<dfj> $$0) {
      this.c = $$0;
   }

   public dsl(bfi.a<dfj> $$0) {
      this($$0.a());
   }

   @Override
   protected dsc<?> a() {
      return dsc.b;
   }

   @Override
   public dfj a(asc $$0, gw $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
