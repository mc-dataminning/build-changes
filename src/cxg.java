import java.util.List;

public class cxg extends cwi {
   public cxg(cwi.a $$0) {
      super($$0);
   }

   @Override
   public cwm o() {
      cwm $$0 = super.o();
      $$0.b(ku.Q, new cyl(cym.a));
      return $$0;
   }

   @Override
   public bsk a(daf $$0) {
      dfm $$1 = $$0.q();
      jh $$2 = $$0.a();
      cou $$3 = $$0.o();
      cwm $$4 = $$0.n();
      cyl $$5 = $$4.a(ku.Q, cyl.a);
      dvv $$6 = $$1.a_($$2);
      if ($$0.k() != jm.a && $$6.a(axc.ck) && $$5.a(cym.a)) {
         $$1.a(null, $$2, awn.kj, awo.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cwp.a($$4, $$3, new cwm(cwq.sB)));
         $$3.b(awx.c.b($$4.h()));
         if (!$$1.C) {
            arp $$7 = (arp)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(ls.am, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, awn.cB, awo.e, 1.0F, 1.0F);
         $$1.a(null, ear.z, $$2);
         $$1.b($$2, dis.sI.m());
         return bsk.a;
      } else {
         return bsk.e;
      }
   }

   @Override
   public xj a(cwm $$0) {
      cyl $$1 = $$0.a(ku.Q);
      return $$1 != null ? $$1.a(this.k + ".effect.") : super.a($$0);
   }

   @Override
   public void a(cwm $$0, cwi.b $$1, List<xj> $$2, cye $$3) {
      cyl $$4 = $$0.a(ku.Q);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1.b());
      }
   }
}
