import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public class dwi extends dvy {
   public static final Codec<dwi> b = bik.b(djg.b).comapFlatMap(dwi::a, $$0 -> $$0.c).fieldOf("entries").codec();
   private final bik<djg> c;

   private static DataResult<dwi> a(bik<djg> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new dwi($$0));
   }

   public dwi(bik<djg> $$0) {
      this.c = $$0;
   }

   public dwi(bik.a<djg> $$0) {
      this($$0.a());
   }

   @Override
   protected dvz<?> a() {
      return dvz.b;
   }

   @Override
   public djg a(auu $$0, hx $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
