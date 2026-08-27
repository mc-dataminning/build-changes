import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public class dsn extends dsd {
   public static final Codec<dsn> b = bfk.b(dfl.b).comapFlatMap(dsn::a, $$0 -> $$0.c).fieldOf("entries").codec();
   private final bfk<dfl> c;

   private static DataResult<dsn> a(bfk<dfl> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new dsn($$0));
   }

   public dsn(bfk<dfl> $$0) {
      this.c = $$0;
   }

   public dsn(bfk.a<dfl> $$0) {
      this($$0.a());
   }

   @Override
   protected dse<?> a() {
      return dse.b;
   }

   @Override
   public dfl a(ase $$0, gw $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
