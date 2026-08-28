import java.util.List;

public class cya extends cxc {
   public cya(cxc.a $$0) {
      super($$0);
   }

   @Override
   public cxg n() {
      cxg $$0 = super.n();
      $$0.b(ku.Q, new czf(czg.a));
      return $$0;
   }

   @Override
   public bta a(daz $$0) {
      dgz $$1 = $$0.q();
      jh $$2 = $$0.a();
      cpo $$3 = $$0.o();
      cxg $$4 = $$0.n();
      czf $$5 = $$4.a(ku.Q, czf.a);
      dxo $$6 = $$1.a_($$2);
      if ($$0.k() != jm.a && $$6.a(axk.cl) && $$5.a(czg.a)) {
         $$1.a(null, $$2, awv.kI, aww.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cxj.a($$4, $$3, new cxg(cxk.th)));
         $$3.b(axf.c.b($$4.h()));
         if (!$$1.C) {
            arx $$7 = (arx)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(ls.ao, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, awv.cB, aww.e, 1.0F, 1.0F);
         $$1.a(null, eck.z, $$2);
         $$1.b($$2, dkf.tk.m());
         return bta.a;
      } else {
         return bta.e;
      }
   }

   @Override
   public xk a(cxg $$0) {
      czf $$1 = $$0.a(ku.Q);
      return $$1 != null ? $$1.a(this.l + ".effect.") : super.a($$0);
   }

   @Override
   public void a(cxg $$0, cxc.b $$1, List<xk> $$2, cyy $$3) {
      czf $$4 = $$0.a(ku.Q);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1.b());
      }
   }
}
