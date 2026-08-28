import java.util.List;

public class cyj extends cxl {
   public cyj(cxl.a $$0) {
      super($$0);
   }

   @Override
   public cxp n() {
      cxp $$0 = super.n();
      $$0.b(ku.Q, new czo(czp.a));
      return $$0;
   }

   @Override
   public btj a(dbi $$0) {
      dhi $$1 = $$0.q();
      jh $$2 = $$0.a();
      cpx $$3 = $$0.o();
      cxp $$4 = $$0.n();
      czo $$5 = $$4.a(ku.Q, czo.a);
      dxv $$6 = $$1.a_($$2);
      if ($$0.k() != jm.a && $$6.a(axu.cl) && $$5.a(czp.a)) {
         $$1.a(null, $$2, axf.kC, axg.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cxs.a($$4, $$3, new cxp(cxt.sY)));
         $$3.b(axp.c.b($$4.h()));
         if (!$$1.C) {
            ash $$7 = (ash)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(ls.an, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, axf.cB, axg.e, 1.0F, 1.0F);
         $$1.a(null, ecr.z, $$2);
         $$1.b($$2, dko.td.m());
         return btj.a;
      } else {
         return btj.e;
      }
   }

   @Override
   public xv a(cxp $$0) {
      czo $$1 = $$0.a(ku.Q);
      return $$1 != null ? $$1.a(this.l + ".effect.") : super.a($$0);
   }

   @Override
   public void a(cxp $$0, cxl.b $$1, List<xv> $$2, czh $$3) {
      czo $$4 = $$0.a(ku.Q);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1.b());
      }
   }
}
