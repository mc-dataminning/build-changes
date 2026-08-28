import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class ega extends efq {
   public static final MapCodec<ega> b = bor.b(dsl.b).comapFlatMap(ega::a, $$0 -> $$0.c).fieldOf("entries");
   private final bor<dsl> c;

   private static DataResult<ega> a(bor<dsl> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new ega($$0));
   }

   public ega(bor<dsl> $$0) {
      this.c = $$0;
   }

   public ega(bor.a<dsl> $$0) {
      this($$0.a());
   }

   @Override
   protected efr<?> a() {
      return efr.b;
   }

   @Override
   public dsl a(ayo $$0, ja $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
