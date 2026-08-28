import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class ent extends enj {
   public static final MapCodec<ent> b = bsm.b(dzz.a).comapFlatMap(ent::a, $$0 -> $$0.c).fieldOf("entries");
   private final bsm<dzz> c;

   private static DataResult<ent> a(bsm<dzz> $$0) {
      return $$0.c() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new ent($$0));
   }

   public ent(bsm<dzz> $$0) {
      this.c = $$0;
   }

   public ent(bsm.a<dzz> $$0) {
      this($$0.a());
   }

   @Override
   protected enk<?> a() {
      return enk.b;
   }

   @Override
   public dzz a(azv $$0, iu $$1) {
      return this.c.b($$0);
   }
}
