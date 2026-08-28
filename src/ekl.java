import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class ekl extends ekb {
   public static final MapCodec<ekl> b = bqq.b(dwv.a).comapFlatMap(ekl::a, $$0 -> $$0.c).fieldOf("entries");
   private final bqq<dwv> c;

   private static DataResult<ekl> a(bqq<dwv> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new ekl($$0));
   }

   public ekl(bqq<dwv> $$0) {
      this.c = $$0;
   }

   public ekl(bqq.a<dwv> $$0) {
      this($$0.a());
   }

   @Override
   protected ekc<?> a() {
      return ekc.b;
   }

   @Override
   public dwv a(azg $$0, ji $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
