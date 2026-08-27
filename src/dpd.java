import com.mojang.serialization.Codec;

public class dpd extends dny<dpx> {
   public dpd(Codec<dpx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(doa<dpx> $$0) {
      int $$1 = 0;
      ase $$2 = $$0.d();
      cqr $$3 = $$0.b();
      gw $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(dku.a.d, $$4.u() + $$7, $$4.w() + $$8);
         gw $$10 = new gw($$4.u() + $$7, $$9, $$4.w() + $$8);
         dfl $$11 = csy.mV.n().a(czu.b, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(csy.G) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
