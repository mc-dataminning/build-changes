import com.mojang.serialization.MapCodec;

public class dkc extends dch implements dcb {
   public static final MapCodec<dkc> a = b(dkc::new);
   protected static final float b = 6.0F;
   protected static final est c = dby.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dkc> a() {
      return a;
   }

   protected dkc(doy.d $$0) {
      super($$0);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return c;
   }

   @Override
   public boolean b(cza $$0, ib $$1, doz $$2) {
      return true;
   }

   @Override
   public boolean a(cyx $$0, axr $$1, ib $$2, doz $$3) {
      return true;
   }

   @Override
   public void a(aps $$0, axr $$1, ib $$2, doz $$3) {
      deg $$4 = (deg)($$3.a(dca.bu) ? dca.iI : dca.iH);
      if ($$4.n().a($$0, $$2) && $$0.u($$2.c())) {
         deg.a($$0, $$4.n(), $$2, 2);
      }
   }
}
