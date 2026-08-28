import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class eij extends ehz {
   public static final MapCodec<eij> b = bqc.b(dus.a).comapFlatMap(eij::a, $$0 -> $$0.c).fieldOf("entries");
   private final bqc<dus> c;

   private static DataResult<eij> a(bqc<dus> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new eij($$0));
   }

   public eij(bqc<dus> $$0) {
      this.c = $$0;
   }

   public eij(bqc.a<dus> $$0) {
      this($$0.a());
   }

   @Override
   protected eia<?> a() {
      return eia.b;
   }

   @Override
   public dus a(azn $$0, jf $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
