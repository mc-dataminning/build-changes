public class cyl extends csl {
   public static final dfq a = cyo.a;

   public cyl(dey.d $$0) {
      super($$0);
      this.k(this.n().a(a, Boolean.valueOf(false)));
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, cbm $$3) {
      d($$0, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, bii $$3) {
      if (!$$3.bS()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      if ($$1.B) {
         a($$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }

      cix $$6 = $$3.b($$4);
      return $$6.d() instanceof cgq && new clf($$3, $$4, $$6, $$5).b() ? bgq.d : bgq.a;
   }

   private static void d(dez $$0, cpl $$1, gu $$2) {
      a($$1, $$2);
      if (!$$0.c(a)) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   public boolean e_(dez $$0) {
      return $$0.c(a);
   }

   @Override
   public void b(dez $$0, akk $$1, gu $$2, aru $$3) {
      if ($$0.c(a)) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, cix $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4 && cng.a(cni.v, $$3) == 0) {
         int $$5 = 1 + $$1.z.a(5);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, aru $$3) {
      if ($$0.c(a)) {
         a($$1, $$2);
      }
   }

   private static void a(cpl $$0, gu $$1) {
      double $$2 = 0.5625;
      aru $$3 = $$0.z;

      for (ha $$4 : ha.values()) {
         gu $$5 = $$1.a($$4);
         if (!$$0.a_($$5).i($$0, $$5)) {
            ha.a $$6 = $$4.o();
            double $$7 = $$6 == ha.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == ha.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == ha.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(ip.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a);
   }
}
