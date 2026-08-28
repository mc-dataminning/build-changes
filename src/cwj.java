import java.util.List;

public class cwj extends cvk {
   public cwj(cvk.a $$0) {
      super($$0);
   }

   @Override
   public cvp v() {
      cvp $$0 = super.v();
      $$0.b(kr.L, new cxo(cxp.a));
      return $$0;
   }

   @Override
   public brp a(czm $$0) {
      deg $$1 = $$0.q();
      je $$2 = $$0.a();
      cnu $$3 = $$0.o();
      cvp $$4 = $$0.n();
      cxo $$5 = $$4.a(kr.L, cxo.a);
      duo $$6 = $$1.a_($$2);
      if ($$0.k() != jj.a && $$6.a(awt.cj) && $$5.a(cxp.a)) {
         $$1.a(null, $$2, awe.kj, awf.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cvs.a($$4, $$3, new cvp(cvt.sl)));
         $$3.b(awo.c.b($$4.h()));
         if (!$$1.B) {
            arh $$7 = (arh)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(ln.am, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, awe.cB, awf.e, 1.0F, 1.0F);
         $$1.a(null, dzl.z, $$2);
         $$1.b($$2, dhl.sI.o());
         return brp.a;
      } else {
         return brp.e;
      }
   }

   @Override
   public String d_(cvp $$0) {
      return cxm.a($$0.a(kr.L, cxo.a).e(), this.a() + ".effect.");
   }

   @Override
   public void a(cvp $$0, cvk.b $$1, List<xd> $$2, cxh $$3) {
      cxo $$4 = $$0.a(kr.L);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1.b());
      }
   }
}
