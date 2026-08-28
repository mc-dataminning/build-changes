import java.util.List;

public class cxk extends cwm {
   public cxk(cwm.a $$0) {
      super($$0);
   }

   @Override
   public cwq n() {
      cwq $$0 = super.n();
      $$0.b(kv.Q, new cyp(cyq.a));
      return $$0;
   }

   @Override
   public bsl a(daj $$0) {
      dgj $$1 = $$0.q();
      ji $$2 = $$0.a();
      coy $$3 = $$0.o();
      cwq $$4 = $$0.n();
      cyp $$5 = $$4.a(kv.Q, cyp.a);
      dwy $$6 = $$1.a_($$2);
      if ($$0.k() != jn.a && $$6.a(awp.cl) && $$5.a(cyq.a)) {
         $$1.a(null, $$2, awa.kI, awb.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cwt.a($$4, $$3, new cwq(cwu.th)));
         $$3.b(awk.c.b($$4.h()));
         if (!$$1.C) {
            ard $$7 = (ard)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(lt.ao, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, awa.cB, awb.e, 1.0F, 1.0F);
         $$1.a(null, ebu.z, $$2);
         $$1.b($$2, djp.tk.m());
         return bsl.a;
      } else {
         return bsl.e;
      }
   }

   @Override
   public wp a(cwq $$0) {
      cyp $$1 = $$0.a(kv.Q);
      return $$1 != null ? $$1.a(this.l + ".effect.") : super.a($$0);
   }

   @Override
   public void a(cwq $$0, cwm.b $$1, List<wp> $$2, cyi $$3) {
      cyp $$4 = $$0.a(kv.Q);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1.b());
      }
   }
}
