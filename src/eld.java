import com.mojang.serialization.Codec;

public class eld extends ejy<elx> {
   public eld(Codec<elx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eka<elx> $$0) {
      int $$1 = 0;
      azv $$2 = $$0.d();
      dkl $$3 = $$0.b();
      iv $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(egs.a.d, $$4.u() + $$7, $$4.w() + $$8);
         iv $$10 = new iv($$4.u() + $$7, $$9, $$4.w() + $$8);
         eat $$11 = dmt.nB.m().b(dtw.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(dmt.J) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
