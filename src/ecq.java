import com.mojang.serialization.Codec;

public class ecq extends ebl<edk> {
   public ecq(Codec<edk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebn<edk> $$0) {
      int $$1 = 0;
      ayo $$2 = $$0.d();
      ddc $$3 = $$0.b();
      ja $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(dyg.a.d, $$4.u() + $$7, $$4.w() + $$8);
         ja $$10 = new ja($$4.u() + $$7, $$9, $$4.w() + $$8);
         dsl $$11 = dfk.mV.o().a(dmf.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(dfk.G) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
