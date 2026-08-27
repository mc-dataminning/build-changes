import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public class dyh extends dxx {
   public static final Codec<dyh> b = bke.b(dlf.b).comapFlatMap(dyh::a, $$0 -> $$0.c).fieldOf("entries").codec();
   private final bke<dlf> c;

   private static DataResult<dyh> a(bke<dlf> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new dyh($$0));
   }

   public dyh(bke<dlf> $$0) {
      this.c = $$0;
   }

   public dyh(bke.a<dlf> $$0) {
      this($$0.a());
   }

   @Override
   protected dxy<?> a() {
      return dxy.b;
   }

   @Override
   public dlf a(awo $$0, hz $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
