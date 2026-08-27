import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public class egv extends egl {
   public static final Codec<egv> b = bok.b(dtc.b).comapFlatMap(egv::a, $$0 -> $$0.c).fieldOf("entries").codec();
   private final bok<dtc> c;

   private static DataResult<egv> a(bok<dtc> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new egv($$0));
   }

   public egv(bok<dtc> $$0) {
      this.c = $$0;
   }

   public egv(bok.a<dtc> $$0) {
      this($$0.a());
   }

   @Override
   protected egm<?> a() {
      return egm.b;
   }

   @Override
   public dtc a(ayt $$0, ir $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
