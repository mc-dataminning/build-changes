import com.mojang.serialization.Codec;

public class dra extends dpv<dru> {
   public dra(Codec<dru> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpx<dru> $$0) {
      int $$1 = 0;
      ats $$2 = $$0.d();
      csu $$3 = $$0.b();
      ht $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(dmr.a.d, $$4.u() + $$7, $$4.w() + $$8);
         ht $$10 = new ht($$4.u() + $$7, $$9, $$4.w() + $$8);
         dhi $$11 = cvc.mV.o().a(dbw.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(cvc.G) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
