import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public class dtd extends dst {
   public static final Codec<dtd> b = bgl.b(dgb.b).comapFlatMap(dtd::a, $$0 -> $$0.c).fieldOf("entries").codec();
   private final bgl<dgb> c;

   private static DataResult<dtd> a(bgl<dgb> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new dtd($$0));
   }

   public dtd(bgl<dgb> $$0) {
      this.c = $$0;
   }

   public dtd(bgl.a<dgb> $$0) {
      this($$0.a());
   }

   @Override
   protected dsu<?> a() {
      return dsu.b;
   }

   @Override
   public dgb a(ate $$0, ht $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
