import com.mojang.serialization.Codec;

public class dpa extends dnr<dqc> {
   public dpa(Codec<dqc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnt<dqc> $$0) {
      cqk $$1 = $$0.b();
      gw $$2 = $$0.e();
      gw.a $$3 = new gw.a();
      gw.a $$4 = new gw.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(dkn.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(hc.a, 1);
            cqo $$10 = $$1.s($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, csr.dO.n(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, csr.dN.n(), 2);
               dfe $$11 = $$1.a_($$4);
               if ($$11.b(daa.a)) {
                  $$1.a($$4, $$11.a(daa.a, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
