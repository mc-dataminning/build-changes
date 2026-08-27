import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class eem extends eec {
   public static final MapCodec<eem> b = boe.b(drb.b).comapFlatMap(eem::a, $$0 -> $$0.c).fieldOf("entries");
   private final boe<drb> c;

   private static DataResult<eem> a(boe<drb> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new eem($$0));
   }

   public eem(boe<drb> $$0) {
      this.c = $$0;
   }

   public eem(boe.a<drb> $$0) {
      this($$0.a());
   }

   @Override
   protected eed<?> a() {
      return eed.b;
   }

   @Override
   public drb a(ayk $$0, io $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
