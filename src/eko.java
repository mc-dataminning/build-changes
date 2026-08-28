import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class eko extends eke {
   public static final MapCodec<eko> b = bqt.b(dwy.a).comapFlatMap(eko::a, $$0 -> $$0.c).fieldOf("entries");
   private final bqt<dwy> c;

   private static DataResult<eko> a(bqt<dwy> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new eko($$0));
   }

   public eko(bqt<dwy> $$0) {
      this.c = $$0;
   }

   public eko(bqt.a<dwy> $$0) {
      this($$0.a());
   }

   @Override
   protected ekf<?> a() {
      return ekf.b;
   }

   @Override
   public dwy a(azh $$0, ji $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
