import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class eje extends eiu {
   public static final MapCodec<eje> b = bqp.b(dvo.a).comapFlatMap(eje::a, $$0 -> $$0.c).fieldOf("entries");
   private final bqp<dvo> c;

   private static DataResult<eje> a(bqp<dvo> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new eje($$0));
   }

   public eje(bqp<dvo> $$0) {
      this.c = $$0;
   }

   public eje(bqp.a<dvo> $$0) {
      this($$0.a());
   }

   @Override
   protected eiv<?> a() {
      return eiv.b;
   }

   @Override
   public dvo a(azv $$0, jh $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
