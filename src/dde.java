import com.mojang.serialization.MapCodec;

public class dde extends cvj implements cvd {
   public static final MapCodec<dde> a = b(dde::new);
   protected static final float b = 6.0F;
   protected static final ekn c = cva.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dde> a() {
      return a;
   }

   protected dde(dhh.d $$0) {
      super($$0);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return c;
   }

   @Override
   public boolean b(csd $$0, ht $$1, dhi $$2) {
      return true;
   }

   @Override
   public boolean a(csa $$0, ats $$1, ht $$2, dhi $$3) {
      return true;
   }

   @Override
   public void a(ame $$0, ats $$1, ht $$2, dhi $$3) {
      cxi $$4 = (cxi)($$3.a(cvc.bu) ? cvc.iI : cvc.iH);
      if ($$4.o().a($$0, $$2) && $$0.t($$2.c())) {
         cxi.a($$0, $$4.o(), $$2, 2);
      }
   }
}
