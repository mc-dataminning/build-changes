public class cym extends csm {
   public static final dfr a = cyp.a;

   public cym(dez.d $$0) {
      super($$0);
      this.k(this.n().a(a, Boolean.valueOf(false)));
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, cbn $$3) {
      d($$0, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, bii $$3) {
      if (!$$3.bS()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      if ($$1.B) {
         a($$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }

      ciy $$6 = $$3.b($$4);
      return $$6.d() instanceof cgr && new clg($$3, $$4, $$6, $$5).b() ? bgq.d : bgq.a;
   }

   private static void d(dfa $$0, cpm $$1, gu $$2) {
      a($$1, $$2);
      if (!$$0.c(a)) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   public boolean e_(dfa $$0) {
      return $$0.c(a);
   }

   @Override
   public void b(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if ($$0.c(a)) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, ciy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4 && cnh.a(cnj.v, $$3) == 0) {
         int $$5 = 1 + $$1.z.a(5);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, aru $$3) {
      if ($$0.c(a)) {
         a($$1, $$2);
      }
   }

   private static void a(cpm $$0, gu $$1) {
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
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a);
   }
}
