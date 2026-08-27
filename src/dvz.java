import com.mojang.serialization.Codec;

public class dvz extends dvs<dyd> {
   public dvz(Codec<dyd> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvu<dyd> $$0) {
      cxw $$1 = $$0.b();
      ib $$2 = $$0.e();
      axd $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dnb $$4 = $$1.a_($$2.c());
         if (!$$4.a(dae.dV) && !$$4.a(dae.dY) && !$$4.a(dae.pr)) {
            return false;
         } else {
            $$1.a($$2, dae.ec.o(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               ib $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (ih $$8 : ih.values()) {
                     if ($$1.a_($$6.a($$8)).a(dae.ec)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, dae.ec.o(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
