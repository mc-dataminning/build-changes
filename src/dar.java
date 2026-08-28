public class dar extends czu {
   public dar(czu.a $$0) {
      super($$0);
   }

   @Override
   public czy m() {
      czy $$0 = super.m();
      $$0.b(kk.R, new dbu(dbv.a));
      return $$0;
   }

   @Override
   public bur a(ddt $$0) {
      djx $$1 = $$0.q();
      iv $$2 = $$0.a();
      crx $$3 = $$0.o();
      czy $$4 = $$0.n();
      dbu $$5 = $$4.a(kk.R, dbu.a);
      ebe $$6 = $$1.a_($$2);
      if ($$0.k() != jb.a && $$6.a(axe.co) && $$5.a(dbv.a)) {
         $$1.a(null, $$2, awp.kM, awq.e, 1.0F, 1.0F);
         $$3.a($$0.p(), dab.a($$4, $$3, new czy(dac.ts)));
         $$3.b(awz.c.b($$4.h()));
         if (!$$1.C) {
            ars $$7 = (ars)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(ly.ap, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, awp.cB, awq.e, 1.0F, 1.0F);
         $$1.a(null, ege.z, $$2);
         $$1.b($$2, dne.ts.m());
         return bur.a;
      } else {
         return bur.e;
      }
   }

   @Override
   public xa a(czy $$0) {
      dbu $$1 = $$0.a(kk.R);
      return $$1 != null ? $$1.a(this.n + ".effect.") : super.a($$0);
   }
}
