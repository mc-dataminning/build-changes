import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class epm extends epc {
   public static final MapCodec<epm> b = btm.b(ebq.a).comapFlatMap(epm::a, $$0 -> $$0.c).fieldOf("entries");
   private final btm<ebq> c;

   private static DataResult<epm> a(btm<ebq> $$0) {
      return $$0.c() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new epm($$0));
   }

   public epm(btm<ebq> $$0) {
      this.c = $$0;
   }

   public epm(btm.a<ebq> $$0) {
      this($$0.a());
   }

   @Override
   protected epd<?> a() {
      return epd.b;
   }

   @Override
   public ebq a(bai $$0, iw $$1) {
      return this.c.b($$0);
   }
}
