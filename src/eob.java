import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class eob extends enr {
   public static final MapCodec<eob> b = bso.b(eah.a).comapFlatMap(eob::a, $$0 -> $$0.c).fieldOf("entries");
   private final bso<eah> c;

   private static DataResult<eob> a(bso<eah> $$0) {
      return $$0.c() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new eob($$0));
   }

   public eob(bso<eah> $$0) {
      this.c = $$0;
   }

   public eob(bso.a<eah> $$0) {
      this($$0.a());
   }

   @Override
   protected ens<?> a() {
      return ens.b;
   }

   @Override
   public eah a(azv $$0, iu $$1) {
      return this.c.b($$0);
   }
}
