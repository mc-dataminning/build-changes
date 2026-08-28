import java.util.List;

public class cve extends cui {
   private static final int a = 32;

   public cve(cui.a $$0) {
      super($$0);
   }

   @Override
   public cun w() {
      cun $$0 = super.w();
      $$0.b(km.F, new cwo(cwp.a));
      return $$0;
   }

   @Override
   public cun a(cun $$0, dbw $$1, btn $$2) {
      cmv $$3 = $$2 instanceof cmv ? (cmv)$$2 : null;
      if ($$3 instanceof arf) {
         am.A.a((arf)$$3, $$0);
      }

      if (!$$1.B) {
         cwo $$4 = $$0.a(km.F, cwo.a);
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
            return new cun(cuq.sl);
         }

         if ($$3 != null) {
            $$3.gc().f(new cun(cuq.sl));
         }
      }

      $$2.a(dwt.l);
      return $$0;
   }

   @Override
   public bqs a(cya $$0) {
      dbw $$1 = $$0.q();
      iz $$2 = $$0.a();
      cmv $$3 = $$0.o();
      cun $$4 = $$0.n();
      cwo $$5 = $$4.a(km.F, cwo.a);
      dsa $$6 = $$1.a_($$2);
      if ($$0.k() != je.a && $$6.a(awo.ci) && $$5.a(cwp.a)) {
         $$1.a(null, $$2, avz.ki, awa.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cup.a($$4, $$3, new cun(cuq.sl)));
         $$3.b(awj.c.b($$4.g()));
         if (!$$1.B) {
            are $$7 = (are)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(li.am, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, avz.cB, awa.e, 1.0F, 1.0F);
         $$1.a(null, dwt.z, $$2);
         $$1.b($$2, dez.sI.o());
         return bqs.a($$1.B);
      } else {
         return bqs.e;
      }
   }

   @Override
   public int b(cun $$0) {
      return 32;
   }

   @Override
   public cwi c(cun $$0) {
      return cwi.c;
   }

   @Override
   public bqt<cun> a(dbw $$0, cmv $$1, bqr $$2) {
      return cup.a($$0, $$1, $$2);
   }

   @Override
   public String i(cun $$0) {
      return cwm.a($$0.a(km.F, cwo.a).e(), this.a() + ".effect.");
   }

   @Override
   public void a(cun $$0, cui.b $$1, List<xo> $$2, cwg $$3) {
      cwo $$4 = $$0.a(km.F);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1.b());
      }
   }
}
