import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public class dyo extends dye {
   public static final Codec<dyo> b = bkg.b(dlj.b).comapFlatMap(dyo::a, $$0 -> $$0.c).fieldOf("entries").codec();
   private final bkg<dlj> c;

   private static DataResult<dyo> a(bkg<dlj> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new dyo($$0));
   }

   public dyo(bkg<dlj> $$0) {
      this.c = $$0;
   }

   public dyo(bkg.a<dlj> $$0) {
      this($$0.a());
   }

   @Override
   protected dyf<?> a() {
      return dyf.b;
   }

   @Override
   public dlj a(awp $$0, hz $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
