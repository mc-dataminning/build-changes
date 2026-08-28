import java.util.List;

public class cye extends cxg {
   public cye(cxg.a $$0) {
      super($$0);
   }

   @Override
   public cxk n() {
      cxk $$0 = super.n();
      $$0.b(ku.Q, new czj(czk.a));
      return $$0;
   }

   @Override
   public bte a(dbd $$0) {
      dha $$1 = $$0.q();
      jh $$2 = $$0.a();
      cps $$3 = $$0.o();
      cxk $$4 = $$0.n();
      czj $$5 = $$4.a(ku.Q, czj.a);
      dxn $$6 = $$1.a_($$2);
      if ($$0.k() != jm.a && $$6.a(axu.cl) && $$5.a(czk.a)) {
         $$1.a(null, $$2, axf.kB, axg.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cxn.a($$4, $$3, new cxk(cxo.sY)));
         $$3.b(axp.c.b($$4.h()));
         if (!$$1.C) {
            ash $$7 = (ash)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(ls.an, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, axf.cB, axg.e, 1.0F, 1.0F);
         $$1.a(null, ecj.z, $$2);
         $$1.b($$2, dkg.td.m());
         return bte.a;
      } else {
         return bte.e;
      }
   }

   @Override
   public xv a(cxk $$0) {
      czj $$1 = $$0.a(ku.Q);
      return $$1 != null ? $$1.a(this.k + ".effect.") : super.a($$0);
   }

   @Override
   public void a(cxk $$0, cxg.b $$1, List<xv> $$2, czc $$3) {
      czj $$4 = $$0.a(ku.Q);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1.b());
      }
   }
}
