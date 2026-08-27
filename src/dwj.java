import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public class dwj extends dvz {
   public static final Codec<dwj> b = bil.b(djh.b).comapFlatMap(dwj::a, $$0 -> $$0.c).fieldOf("entries").codec();
   private final bil<djh> c;

   private static DataResult<dwj> a(bil<djh> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new dwj($$0));
   }

   public dwj(bil<djh> $$0) {
      this.c = $$0;
   }

   public dwj(bil.a<djh> $$0) {
      this($$0.a());
   }

   @Override
   protected dwa<?> a() {
      return dwa.b;
   }

   @Override
   public djh a(auv $$0, hx $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
