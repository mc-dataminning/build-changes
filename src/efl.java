import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class efl extends efb {
   public static final MapCodec<efl> b = bpc.b(dsa.b).comapFlatMap(efl::a, $$0 -> $$0.c).fieldOf("entries");
   private final bpc<dsa> c;

   private static DataResult<efl> a(bpc<dsa> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new efl($$0));
   }

   public efl(bpc<dsa> $$0) {
      this.c = $$0;
   }

   public efl(bpc.a<dsa> $$0) {
      this($$0.a());
   }

   @Override
   protected efc<?> a() {
      return efc.b;
   }

   @Override
   public dsa a(azf $$0, iz $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
