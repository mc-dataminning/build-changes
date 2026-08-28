import java.util.List;

public class cwz extends cwb {
   public cwz(cwb.a $$0) {
      super($$0);
   }

   @Override
   public cwf o() {
      cwf $$0 = super.o();
      $$0.b(ku.Q, new cye(cyf.a));
      return $$0;
   }

   @Override
   public bsh a(czy $$0) {
      dff $$1 = $$0.q();
      jh $$2 = $$0.a();
      cor $$3 = $$0.o();
      cwf $$4 = $$0.n();
      cye $$5 = $$4.a(ku.Q, cye.a);
      dvo $$6 = $$1.a_($$2);
      if ($$0.k() != jm.a && $$6.a(axd.ck) && $$5.a(cyf.a)) {
         $$1.a(null, $$2, awo.kj, awp.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cwi.a($$4, $$3, new cwf(cwj.sB)));
         $$3.b(awy.c.b($$4.h()));
         if (!$$1.C) {
            arq $$7 = (arq)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(ls.am, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, awo.cB, awp.e, 1.0F, 1.0F);
         $$1.a(null, eak.z, $$2);
         $$1.b($$2, dil.sI.m());
         return bsh.a;
      } else {
         return bsh.e;
      }
   }

   @Override
   public xl a(cwf $$0) {
      cye $$1 = $$0.a(ku.Q);
      return $$1 != null ? $$1.a(this.k + ".effect.") : super.a($$0);
   }

   @Override
   public void a(cwf $$0, cwb.b $$1, List<xl> $$2, cxx $$3) {
      cye $$4 = $$0.a(ku.Q);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1.b());
      }
   }
}
