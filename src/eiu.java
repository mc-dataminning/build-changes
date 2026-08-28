import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class eiu extends eik {
   public static final MapCodec<eiu> b = bqg.b(dvd.a).comapFlatMap(eiu::a, $$0 -> $$0.c).fieldOf("entries");
   private final bqg<dvd> c;

   private static DataResult<eiu> a(bqg<dvd> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new eiu($$0));
   }

   public eiu(bqg<dvd> $$0) {
      this.c = $$0;
   }

   public eiu(bqg.a<dvd> $$0) {
      this($$0.a());
   }

   @Override
   protected eil<?> a() {
      return eil.b;
   }

   @Override
   public dvd a(azr $$0, jg $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
