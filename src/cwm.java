import java.util.List;

public class cwm extends cvn {
   public cwm(cvn.a $$0) {
      super($$0);
   }

   @Override
   public cvs v() {
      cvs $$0 = super.v();
      $$0.b(ks.L, new cxr(cxs.a));
      return $$0;
   }

   @Override
   public brs a(czp $$0) {
      dej $$1 = $$0.q();
      jf $$2 = $$0.a();
      cnx $$3 = $$0.o();
      cvs $$4 = $$0.n();
      cxr $$5 = $$4.a(ks.L, cxr.a);
      dus $$6 = $$1.a_($$2);
      if ($$0.k() != jk.a && $$6.a(awv.cj) && $$5.a(cxs.a)) {
         $$1.a(null, $$2, awg.kj, awh.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cvv.a($$4, $$3, new cvs(cvw.sl)));
         $$3.b(awq.c.b($$4.h()));
         if (!$$1.B) {
            arj $$7 = (arj)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(lo.am, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, awg.cB, awh.e, 1.0F, 1.0F);
         $$1.a(null, dzp.z, $$2);
         $$1.b($$2, dho.sI.n());
         return brs.a;
      } else {
         return brs.e;
      }
   }

   @Override
   public String d_(cvs $$0) {
      return cxp.a($$0.a(ks.L, cxr.a).e(), this.a() + ".effect.");
   }

   @Override
   public void a(cvs $$0, cvn.b $$1, List<xe> $$2, cxk $$3) {
      cxr $$4 = $$0.a(ks.L);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1.b());
      }
   }
}
