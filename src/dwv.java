import com.mojang.serialization.Codec;

public class dwv extends dvq<dxp> {
   public dwv(Codec<dxp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvs<dxp> $$0) {
      int $$1 = 0;
      axd $$2 = $$0.d();
      cxu $$3 = $$0.b();
      ib $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(dsm.a.d, $$4.u() + $$7, $$4.w() + $$8);
         ib $$10 = new ib($$4.u() + $$7, $$9, $$4.w() + $$8);
         dmz $$11 = dac.mV.o().a(dgw.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(dac.G) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
