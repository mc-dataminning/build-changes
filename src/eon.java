import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class eon extends eod {
   public static final MapCodec<eon> b = bsq.b(eat.a).comapFlatMap(eon::a, $$0 -> $$0.c).fieldOf("entries");
   private final bsq<eat> c;

   private static DataResult<eon> a(bsq<eat> $$0) {
      return $$0.c() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new eon($$0));
   }

   public eon(bsq<eat> $$0) {
      this.c = $$0;
   }

   public eon(bsq.a<eat> $$0) {
      this($$0.a());
   }

   @Override
   protected eoe<?> a() {
      return eoe.b;
   }

   @Override
   public eat a(azv $$0, iv $$1) {
      return this.c.b($$0);
   }
}
