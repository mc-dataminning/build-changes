import com.mojang.serialization.Codec;

public class dny extends dnr<dqc> {
   public dny(Codec<dqc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnt<dqc> $$0) {
      cqk $$1 = $$0.b();
      gw $$2 = $$0.e();
      arx $$3 = $$0.d();
      if (!$$1.t($$2)) {
         return false;
      } else {
         dfe $$4 = $$1.a_($$2.c());
         if (!$$4.a(csr.dW) && !$$4.a(csr.dZ) && !$$4.a(csr.pr)) {
            return false;
         } else {
            $$1.a($$2, csr.ed.n(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               gw $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (hc $$8 : hc.values()) {
                     if ($$1.a_($$6.a($$8)).a(csr.ed)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, csr.ed.n(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
