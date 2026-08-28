import java.util.List;

public class cyi extends cxk {
   public cyi(cxk.a $$0) {
      super($$0);
   }

   @Override
   public cxo n() {
      cxo $$0 = super.n();
      $$0.b(ku.Q, new czn(czo.a));
      return $$0;
   }

   @Override
   public bti a(dbh $$0) {
      dhh $$1 = $$0.q();
      jh $$2 = $$0.a();
      cpw $$3 = $$0.o();
      cxo $$4 = $$0.n();
      czn $$5 = $$4.a(ku.Q, czn.a);
      dxu $$6 = $$1.a_($$2);
      if ($$0.k() != jm.a && $$6.a(axu.cl) && $$5.a(czo.a)) {
         $$1.a(null, $$2, axf.kC, axg.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cxr.a($$4, $$3, new cxo(cxs.sY)));
         $$3.b(axp.c.b($$4.h()));
         if (!$$1.C) {
            ash $$7 = (ash)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(ls.an, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, axf.cB, axg.e, 1.0F, 1.0F);
         $$1.a(null, ecq.z, $$2);
         $$1.b($$2, dkn.td.m());
         return bti.a;
      } else {
         return bti.e;
      }
   }

   @Override
   public xv a(cxo $$0) {
      czn $$1 = $$0.a(ku.Q);
      return $$1 != null ? $$1.a(this.k + ".effect.") : super.a($$0);
   }

   @Override
   public void a(cxo $$0, cxk.b $$1, List<xv> $$2, czg $$3) {
      czn $$4 = $$0.a(ku.Q);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1.b());
      }
   }
}
