import com.mojang.serialization.MapCodec;

public class dku extends dez {
   public static final MapCodec<dku> a = b(dku::new);

   @Override
   public MapCodec<dku> a() {
      return a;
   }

   public dku(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected boolean e_(dsc $$0) {
      return true;
   }

   @Override
   protected int a(dsc $$0, dbe $$1, iz $$2, je $$3) {
      return 15;
   }
}
