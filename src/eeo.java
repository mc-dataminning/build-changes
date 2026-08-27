import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class eeo extends eee {
   public static final MapCodec<eeo> b = bog.b(drd.b).comapFlatMap(eeo::a, $$0 -> $$0.c).fieldOf("entries");
   private final bog<drd> c;

   private static DataResult<eeo> a(bog<drd> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new eeo($$0));
   }

   public eeo(bog<drd> $$0) {
      this.c = $$0;
   }

   public eeo(bog.a<drd> $$0) {
      this($$0.a());
   }

   @Override
   protected eef<?> a() {
      return eef.b;
   }

   @Override
   public drd a(aym $$0, io $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
