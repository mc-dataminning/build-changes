import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public class eaf extends dzv {
   public static final Codec<eaf> b = blm.b(dmz.b).comapFlatMap(eaf::a, $$0 -> $$0.c).fieldOf("entries").codec();
   private final blm<dmz> c;

   private static DataResult<eaf> a(blm<dmz> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new eaf($$0));
   }

   public eaf(blm<dmz> $$0) {
      this.c = $$0;
   }

   public eaf(blm.a<dmz> $$0) {
      this($$0.a());
   }

   @Override
   protected dzw<?> a() {
      return dzw.b;
   }

   @Override
   public dmz a(axd $$0, ib $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
