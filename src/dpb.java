import com.mojang.serialization.Codec;

public class dpb extends dnw<dpv> {
   public dpb(Codec<dpv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dny<dpv> $$0) {
      int $$1 = 0;
      asc $$2 = $$0.d();
      cqp $$3 = $$0.b();
      gw $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(dks.a.d, $$4.u() + $$7, $$4.w() + $$8);
         gw $$10 = new gw($$4.u() + $$7, $$9, $$4.w() + $$8);
         dfj $$11 = csw.mV.n().a(czs.b, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(csw.G) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
