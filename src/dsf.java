import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public class dsf extends drv {
   public static final Codec<dsf> b = bfo.b(dfd.b).comapFlatMap(dsf::a, $$0 -> $$0.c).fieldOf("entries").codec();
   private final bfo<dfd> c;

   private static DataResult<dsf> a(bfo<dfd> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new dsf($$0));
   }

   public dsf(bfo<dfd> $$0) {
      this.c = $$0;
   }

   public dsf(bfo.a<dfd> $$0) {
      this($$0.a());
   }

   @Override
   protected drw<?> a() {
      return drw.b;
   }

   @Override
   public dfd a(ash $$0, gw $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
