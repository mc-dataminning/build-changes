import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class elj extends ekz {
   public static final MapCodec<elj> b = brj.b(dxq.a).comapFlatMap(elj::a, $$0 -> $$0.c).fieldOf("entries");
   private final brj<dxq> c;

   private static DataResult<elj> a(brj<dxq> $$0) {
      return $$0.c() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new elj($$0));
   }

   public elj(brj<dxq> $$0) {
      this.c = $$0;
   }

   public elj(brj.a<dxq> $$0) {
      this($$0.a());
   }

   @Override
   protected ela<?> a() {
      return ela.b;
   }

   @Override
   public dxq a(azh $$0, ji $$1) {
      return this.c.b($$0);
   }
}
