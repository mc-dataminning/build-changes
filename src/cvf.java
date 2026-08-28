import java.util.List;

public class cvf extends cuj {
   private static final int a = 32;

   public cvf(cuj.a $$0) {
      super($$0);
   }

   @Override
   public cuo w() {
      cuo $$0 = super.w();
      $$0.b(km.G, new cwp(cwq.a));
      return $$0;
   }

   @Override
   public cuo a(cuo $$0, dbx $$1, bto $$2) {
      cmw $$3 = $$2 instanceof cmw ? (cmw)$$2 : null;
      if ($$3 instanceof arf) {
         am.A.a((arf)$$3, $$0);
      }

      if (!$$1.B) {
         cwp $$4 = $$0.a(km.G, cwp.a);
         $$4.a($$2x -> {
            if ($$2x.c().a().a()) {
               $$2x.c().a().a($$3, $$3, $$2, $$2x.e(), 1.0);
            } else {
               $$2.b($$2x);
            }
         });
      }

      if ($$3 != null) {
         $$3.b(awj.c.b(this));
         $$0.a(1, $$3);
      }

      if ($$3 == null || !$$3.fP()) {
         if ($$0.e()) {
            return new cuo(cur.sl);
         }

         if ($$3 != null) {
            $$3.gc().f(new cuo(cur.sl));
         }
      }

      $$2.a(dwu.l);
      return $$0;
   }

   @Override
   public bqt a(cyb $$0) {
      dbx $$1 = $$0.q();
      iz $$2 = $$0.a();
      cmw $$3 = $$0.o();
      cuo $$4 = $$0.n();
      cwp $$5 = $$4.a(km.G, cwp.a);
      dsb $$6 = $$1.a_($$2);
      if ($$0.k() != je.a && $$6.a(awo.ci) && $$5.a(cwq.a)) {
         $$1.a(null, $$2, avz.ki, awa.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cuq.a($$4, $$3, new cuo(cur.sl)));
         $$3.b(awj.c.b($$4.g()));
         if (!$$1.B) {
            are $$7 = (are)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(li.am, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, avz.cB, awa.e, 1.0F, 1.0F);
         $$1.a(null, dwu.z, $$2);
         $$1.b($$2, dfa.sI.o());
         return bqt.a($$1.B);
      } else {
         return bqt.e;
      }
   }

   @Override
   public int b(cuo $$0) {
      return 32;
   }

   @Override
   public cwj c(cuo $$0) {
      return cwj.c;
   }

   @Override
   public bqu<cuo> a(dbx $$0, cmw $$1, bqs $$2) {
      return cuq.a($$0, $$1, $$2);
   }

   @Override
   public String i(cuo $$0) {
      return cwn.a($$0.a(km.G, cwp.a).e(), this.a() + ".effect.");
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<xo> $$2, cwh $$3) {
      cwp $$4 = $$0.a(km.G);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1.b());
      }
   }
}
