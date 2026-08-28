import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class egs extends egi {
   public static final MapCodec<egs> b = bpb.b(dtc.b).comapFlatMap(egs::a, $$0 -> $$0.c).fieldOf("entries");
   private final bpb<dtc> c;

   private static DataResult<egs> a(bpb<dtc> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new egs($$0));
   }

   public egs(bpb<dtc> $$0) {
      this.c = $$0;
   }

   public egs(bpb.a<dtc> $$0) {
      this($$0.a());
   }

   @Override
   protected egj<?> a() {
      return egj.b;
   }

   @Override
   public dtc a(ayw $$0, jd $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
