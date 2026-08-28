import java.util.List;

public class cxh extends cwj {
   public cxh(cwj.a $$0) {
      super($$0);
   }

   @Override
   public cwn n() {
      cwn $$0 = super.n();
      $$0.b(kv.Q, new cym(cyn.a));
      return $$0;
   }

   @Override
   public bsi a(dag $$0) {
      dgg $$1 = $$0.q();
      ji $$2 = $$0.a();
      cov $$3 = $$0.o();
      cwn $$4 = $$0.n();
      cym $$5 = $$4.a(kv.Q, cym.a);
      dwv $$6 = $$1.a_($$2);
      if ($$0.k() != jn.a && $$6.a(awo.cl) && $$5.a(cyn.a)) {
         $$1.a(null, $$2, avz.kI, awa.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cwq.a($$4, $$3, new cwn(cwr.th)));
         $$3.b(awj.c.b($$4.h()));
         if (!$$1.C) {
            arc $$7 = (arc)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(lt.ao, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, avz.cB, awa.e, 1.0F, 1.0F);
         $$1.a(null, ebr.z, $$2);
         $$1.b($$2, djm.tk.m());
         return bsi.a;
      } else {
         return bsi.e;
      }
   }

   @Override
   public wo a(cwn $$0) {
      cym $$1 = $$0.a(kv.Q);
      return $$1 != null ? $$1.a(this.l + ".effect.") : super.a($$0);
   }

   @Override
   public void a(cwn $$0, cwj.b $$1, List<wo> $$2, cyf $$3) {
      cym $$4 = $$0.a(kv.Q);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1.b());
      }
   }
}
