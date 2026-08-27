import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public class dup extends duf {
   public static final Codec<dup> b = bhl.b(dhn.b).comapFlatMap(dup::a, $$0 -> $$0.c).fieldOf("entries").codec();
   private final bhl<dhn> c;

   private static DataResult<dup> a(bhl<dhn> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new dup($$0));
   }

   public dup(bhl<dhn> $$0) {
      this.c = $$0;
   }

   public dup(bhl.a<dhn> $$0) {
      this($$0.a());
   }

   @Override
   protected dug<?> a() {
      return dug.b;
   }

   @Override
   public dhn a(atw $$0, hx $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
