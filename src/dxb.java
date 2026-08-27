import com.mojang.serialization.Codec;

public class dxb extends dvs<dyd> {
   public dxb(Codec<dyd> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvu<dyd> $$0) {
      cxw $$1 = $$0.b();
      ib $$2 = $$0.e();
      ib.a $$3 = new ib.a();
      ib.a $$4 = new ib.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(dso.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(ih.a, 1);
            cya $$10 = $$1.t($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, dae.dO.o(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, dae.dN.o(), 2);
               dnb $$11 = $$1.a_($$4);
               if ($$11.b(dhl.c)) {
                  $$1.a($$4, $$11.a(dhl.c, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
