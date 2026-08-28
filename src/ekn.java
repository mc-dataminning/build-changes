import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class ekn extends ekd {
   public static final MapCodec<ekn> b = bqs.b(dwx.a).comapFlatMap(ekn::a, $$0 -> $$0.c).fieldOf("entries");
   private final bqs<dwx> c;

   private static DataResult<ekn> a(bqs<dwx> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new ekn($$0));
   }

   public ekn(bqs<dwx> $$0) {
      this.c = $$0;
   }

   public ekn(bqs.a<dwx> $$0) {
      this($$0.a());
   }

   @Override
   protected eke<?> a() {
      return eke.b;
   }

   @Override
   public dwx a(azh $$0, ji $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
