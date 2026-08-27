import com.mojang.serialization.Codec;

public class dsa extends drt<due> {
   public dsa(Codec<due> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drv<due> $$0) {
      cuj $$1 = $$0.b();
      hx $$2 = $$0.e();
      auu $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         djg $$4 = $$1.a_($$2.c());
         if (!$$4.a(cwr.dV) && !$$4.a(cwr.dY) && !$$4.a(cwr.pr)) {
            return false;
         } else {
            $$1.a($$2, cwr.ec.o(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               hx $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (ic $$8 : ic.values()) {
                     if ($$1.a_($$6.a($$8)).a(cwr.ec)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, cwr.ec.o(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
