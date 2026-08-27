import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public class dwr extends dwh {
   public static final Codec<dwr> b = bim.b(djp.b).comapFlatMap(dwr::a, $$0 -> $$0.c).fieldOf("entries").codec();
   private final bim<djp> c;

   private static DataResult<dwr> a(bim<djp> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new dwr($$0));
   }

   public dwr(bim<djp> $$0) {
      this.c = $$0;
   }

   public dwr(bim.a<djp> $$0) {
      this($$0.a());
   }

   @Override
   protected dwi<?> a() {
      return dwi.b;
   }

   @Override
   public djp a(auw $$0, hx $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
