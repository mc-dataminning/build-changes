import com.mojang.serialization.MapCodec;

public class dku extends dgw {
   public static final MapCodec<dku> a = b(dku::new);
   private static final ewm[] b = new ewm[]{
      dfb.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dfb.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      dfb.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dfb.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dfb.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dfb.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      dfb.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dfb.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dku> a() {
      return a;
   }

   public dku(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected dbz d() {
      return cuu.ug;
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return b[this.g($$0)];
   }
}
