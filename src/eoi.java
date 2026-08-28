import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class eoi extends eny {
   public static final MapCodec<eoi> b = bsq.b(eao.a).comapFlatMap(eoi::a, $$0 -> $$0.c).fieldOf("entries");
   private final bsq<eao> c;

   private static DataResult<eoi> a(bsq<eao> $$0) {
      return $$0.c() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new eoi($$0));
   }

   public eoi(bsq<eao> $$0) {
      this.c = $$0;
   }

   public eoi(bsq.a<eao> $$0) {
      this($$0.a());
   }

   @Override
   protected enz<?> a() {
      return enz.b;
   }

   @Override
   public eao a(azv $$0, iv $$1) {
      return this.c.b($$0);
   }
}
