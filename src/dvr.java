import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public class dvr extends dvh {
   public static final Codec<dvr> b = bhv.b(dip.b).comapFlatMap(dvr::a, $$0 -> $$0.c).fieldOf("entries").codec();
   private final bhv<dip> c;

   private static DataResult<dvr> a(bhv<dip> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new dvr($$0));
   }

   public dvr(bhv<dip> $$0) {
      this.c = $$0;
   }

   public dvr(bhv.a<dip> $$0) {
      this($$0.a());
   }

   @Override
   protected dvi<?> a() {
      return dvi.b;
   }

   @Override
   public dip a(auf $$0, hv $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
