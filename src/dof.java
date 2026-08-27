import com.mojang.serialization.Codec;

public class dof extends dny<dqj> {
   public dof(Codec<dqj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(doa<dqj> $$0) {
      cqr $$1 = $$0.b();
      gw $$2 = $$0.e();
      ase $$3 = $$0.d();
      if (!$$1.t($$2)) {
         return false;
      } else {
         dfl $$4 = $$1.a_($$2.c());
         if (!$$4.a(csy.dW) && !$$4.a(csy.dZ) && !$$4.a(csy.pr)) {
            return false;
         } else {
            $$1.a($$2, csy.ed.n(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               gw $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (hc $$8 : hc.values()) {
                     if ($$1.a_($$6.a($$8)).a(csy.ed)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, csy.ed.n(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
