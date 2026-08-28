import java.util.List;

public class cwv extends cvx {
   public cwv(cvx.a $$0) {
      super($$0);
   }

   @Override
   public cwb o() {
      cwb $$0 = super.o();
      $$0.b(ku.Q, new cya(cyb.a));
      return $$0;
   }

   @Override
   public bsd a(czu $$0) {
      dfb $$1 = $$0.q();
      jh $$2 = $$0.a();
      com $$3 = $$0.o();
      cwb $$4 = $$0.n();
      cya $$5 = $$4.a(ku.Q, cya.a);
      dvj $$6 = $$1.a_($$2);
      if ($$0.k() != jm.a && $$6.a(axa.ck) && $$5.a(cyb.a)) {
         $$1.a(null, $$2, awl.kj, awm.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cwe.a($$4, $$3, new cwb(cwf.sl)));
         $$3.b(awv.c.b($$4.h()));
         if (!$$1.C) {
            arn $$7 = (arn)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(lr.am, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, awl.cB, awm.e, 1.0F, 1.0F);
         $$1.a(null, eag.z, $$2);
         $$1.b($$2, dig.sI.m());
         return bsd.a;
      } else {
         return bsd.e;
      }
   }

   @Override
   public xi a(cwb $$0) {
      cya $$1 = $$0.a(ku.Q);
      return $$1 != null ? $$1.a(this.k + ".effect.") : super.a($$0);
   }

   @Override
   public void a(cwb $$0, cvx.b $$1, List<xi> $$2, cxt $$3) {
      cya $$4 = $$0.a(ku.Q);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1.b());
      }
   }
}
