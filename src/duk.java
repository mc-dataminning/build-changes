import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public class duk extends dua {
   public static final Codec<duk> b = bhh.b(dhi.b).comapFlatMap(duk::a, $$0 -> $$0.c).fieldOf("entries").codec();
   private final bhh<dhi> c;

   private static DataResult<duk> a(bhh<dhi> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new duk($$0));
   }

   public duk(bhh<dhi> $$0) {
      this.c = $$0;
   }

   public duk(bhh.a<dhi> $$0) {
      this($$0.a());
   }

   @Override
   protected dub<?> a() {
      return dub.b;
   }

   @Override
   public dhi a(ats $$0, ht $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
