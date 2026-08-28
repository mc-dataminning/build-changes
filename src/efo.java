import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class efo extends efe {
   public static final MapCodec<efo> b = bpf.b(dsd.b).comapFlatMap(efo::a, $$0 -> $$0.c).fieldOf("entries");
   private final bpf<dsd> c;

   private static DataResult<efo> a(bpf<dsd> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new efo($$0));
   }

   public efo(bpf<dsd> $$0) {
      this.c = $$0;
   }

   public efo(bpf.a<dsd> $$0) {
      this($$0.a());
   }

   @Override
   protected eff<?> a() {
      return eff.b;
   }

   @Override
   public dsd a(azh $$0, iz $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
