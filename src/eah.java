import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public class eah extends dzx {
   public static final Codec<eah> b = bln.b(dnb.b).comapFlatMap(eah::a, $$0 -> $$0.c).fieldOf("entries").codec();
   private final bln<dnb> c;

   private static DataResult<eah> a(bln<dnb> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new eah($$0));
   }

   public eah(bln<dnb> $$0) {
      this.c = $$0;
   }

   public eah(bln.a<dnb> $$0) {
      this($$0.a());
   }

   @Override
   protected dzy<?> a() {
      return dzy.b;
   }

   @Override
   public dnb a(axd $$0, ib $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
