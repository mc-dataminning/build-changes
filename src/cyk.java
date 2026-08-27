public class cyk extends csk {
   public static final dfp a = cyn.a;

   public cyk(dex.d $$0) {
      super($$0);
      this.k(this.n().a(a, Boolean.valueOf(false)));
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, cbl $$3) {
      d($$0, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, big $$3) {
      if (!$$3.bS()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if ($$1.B) {
         a($$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }

      ciw $$6 = $$3.b($$4);
      return $$6.d() instanceof cgp && new cle($$3, $$4, $$6, $$5).b() ? bgo.d : bgo.a;
   }

   private static void d(dey $$0, cpk $$1, gv $$2) {
      a($$1, $$2);
      if (!$$0.c(a)) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   public boolean e_(dey $$0) {
      return $$0.c(a);
   }

   @Override
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      if ($$0.c(a)) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, ciw $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4 && cnf.a(cnh.v, $$3) == 0) {
         int $$5 = 1 + $$1.z.a(5);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, art $$3) {
      if ($$0.c(a)) {
         a($$1, $$2);
      }
   }

   private static void a(cpk $$0, gv $$1) {
      double $$2 = 0.5625;
      art $$3 = $$0.z;

      for (hb $$4 : hb.values()) {
         gv $$5 = $$1.a($$4);
         if (!$$0.a_($$5).i($$0, $$5)) {
            hb.a $$6 = $$4.o();
            double $$7 = $$6 == hb.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == hb.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == hb.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(iq.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a);
   }
}
