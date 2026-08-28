import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class efm extends efc {
   public static final MapCodec<efm> b = bpd.b(dsb.b).comapFlatMap(efm::a, $$0 -> $$0.c).fieldOf("entries");
   private final bpd<dsb> c;

   private static DataResult<efm> a(bpd<dsb> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new efm($$0));
   }

   public efm(bpd<dsb> $$0) {
      this.c = $$0;
   }

   public efm(bpd.a<dsb> $$0) {
      this($$0.a());
   }

   @Override
   protected efd<?> a() {
      return efd.b;
   }

   @Override
   public dsb a(azg $$0, iz $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
