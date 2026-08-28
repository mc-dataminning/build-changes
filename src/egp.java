import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class egp extends egf {
   public static final MapCodec<egp> b = bpa.b(dta.b).comapFlatMap(egp::a, $$0 -> $$0.c).fieldOf("entries");
   private final bpa<dta> c;

   private static DataResult<egp> a(bpa<dta> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new egp($$0));
   }

   public egp(bpa<dta> $$0) {
      this.c = $$0;
   }

   public egp(bpa.a<dta> $$0) {
      this($$0.a());
   }

   @Override
   protected egg<?> a() {
      return egg.b;
   }

   @Override
   public dta a(ayv $$0, jd $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
