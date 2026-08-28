import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class eni extends emy {
   public static final MapCodec<eni> b = bsj.b(dzo.a).comapFlatMap(eni::a, $$0 -> $$0.c).fieldOf("entries");
   private final bsj<dzo> c;

   private static DataResult<eni> a(bsj<dzo> $$0) {
      return $$0.c() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new eni($$0));
   }

   public eni(bsj<dzo> $$0) {
      this.c = $$0;
   }

   public eni(bsj.a<dzo> $$0) {
      this($$0.a());
   }

   @Override
   protected emz<?> a() {
      return emz.b;
   }

   @Override
   public dzo a(azt $$0, iu $$1) {
      return this.c.b($$0);
   }
}
