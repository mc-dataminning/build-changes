import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public class dsa extends drq {
   public static final Codec<dsa> b = bey.b(dey.b).comapFlatMap(dsa::a, $$0 -> $$0.c).fieldOf("entries").codec();
   private final bey<dey> c;

   private static DataResult<dsa> a(bey<dey> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new dsa($$0));
   }

   public dsa(bey<dey> $$0) {
      this.c = $$0;
   }

   public dsa(bey.a<dey> $$0) {
      this($$0.a());
   }

   @Override
   protected drr<?> a() {
      return drr.b;
   }

   @Override
   public dey a(art $$0, gv $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
