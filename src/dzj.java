import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public class dzj extends dyz {
   public static final Codec<dzj> b = bkv.b(dme.b).comapFlatMap(dzj::a, $$0 -> $$0.c).fieldOf("entries").codec();
   private final bkv<dme> c;

   private static DataResult<dzj> a(bkv<dme> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new dzj($$0));
   }

   public dzj(bkv<dme> $$0) {
      this.c = $$0;
   }

   public dzj(bkv.a<dme> $$0) {
      this($$0.a());
   }

   @Override
   protected dza<?> a() {
      return dza.b;
   }

   @Override
   public dme a(awt $$0, ib $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
