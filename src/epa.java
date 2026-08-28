import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class epa extends eoq {
   public static final MapCodec<epa> b = btb.b(ebe.a).comapFlatMap(epa::a, $$0 -> $$0.c).fieldOf("entries");
   private final btb<ebe> c;

   private static DataResult<epa> a(btb<ebe> $$0) {
      return $$0.c() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new epa($$0));
   }

   public epa(btb<ebe> $$0) {
      this.c = $$0;
   }

   public epa(btb.a<ebe> $$0) {
      this($$0.a());
   }

   @Override
   protected eor<?> a() {
      return eor.b;
   }

   @Override
   public ebe a(azx $$0, iv $$1) {
      return this.c.b($$0);
   }
}
