import com.mojang.serialization.MapCodec;

public class dng extends dfk implements dfe {
   public static final MapCodec<dng> a = b(dng::new);
   protected static final float b = 6.0F;
   protected static final ewm c = dfb.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dng> a() {
      return a;
   }

   protected dng(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return c;
   }

   @Override
   public boolean b(dcd $$0, iz $$1, dse $$2) {
      return true;
   }

   @Override
   public boolean a(dca $$0, azh $$1, iz $$2, dse $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dse $$3) {
      dhj $$4 = (dhj)($$3.a(dfd.bu) ? dfd.iI : dfd.iH);
      if ($$4.o().a($$0, $$2) && $$0.u($$2.c())) {
         dhj.a($$0, $$4.o(), $$2, 2);
      }
   }
}
