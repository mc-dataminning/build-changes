import com.mojang.serialization.Codec;

public class elv extends ekm<emy> {
   public elv(Codec<emy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eko<emy> $$0) {
      dky $$1 = $$0.b();
      iw $$2 = $$0.e();
      iw.a $$3 = new iw.a();
      iw.a $$4 = new iw.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(ehf.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(jc.a, 1);
            dlc $$10 = $$1.u($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, dng.ee.m(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, dng.ed.m(), 2);
               ebg $$11 = $$1.a_($$4);
               if ($$11.b(duy.c)) {
                  $$1.a($$4, $$11.b(duy.c, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
