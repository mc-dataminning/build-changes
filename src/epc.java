import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class epc extends eos {
   public static final MapCodec<epc> b = btd.b(ebg.a).comapFlatMap(epc::a, $$0 -> $$0.c).fieldOf("entries");
   private final btd<ebg> c;

   private static DataResult<epc> a(btd<ebg> $$0) {
      return $$0.c() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new epc($$0));
   }

   public epc(btd<ebg> $$0) {
      this.c = $$0;
   }

   public epc(btd.a<ebg> $$0) {
      this($$0.a());
   }

   @Override
   protected eot<?> a() {
      return eot.b;
   }

   @Override
   public ebg a(azz $$0, iw $$1) {
      return this.c.b($$0);
   }
}
