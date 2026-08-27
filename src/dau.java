public class dau extends csm {
   private static final dga a = dfq.aT;
   private static final int b = 20;
   private static final int c = 8;

   public dau(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public void a(cpm $$0, dfa $$1, eha $$2, ccf $$3) {
      int $$4 = a((cpn)$$0, $$1, $$2, (bii)$$3);
      if ($$3.v() instanceof akl $$6) {
         $$6.a(apg.aE);
         ai.L.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(cpn $$0, dfa $$1, eha $$2, bii $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof cbt ? 20 : 8;
      if (!$$0.L().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(eha $$0, ehe $$1) {
      ha $$2 = $$0.b();
      double $$3 = Math.abs(arp.e($$1.c) - 0.5);
      double $$4 = Math.abs(arp.e($$1.d) - 0.5);
      double $$5 = Math.abs(arp.e($$1.e) - 0.5);
      ha.a $$6 = $$2.o();
      double $$7;
      if ($$6 == ha.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == ha.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, arp.c(15.0 * arp.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(cpn $$0, dfa $$1, int $$2, gu $$3, int $$4) {
      $$0.a($$3, $$1.a(a, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if ($$0.c(a) != 0) {
         $$1.a($$2, $$0.a(a, Integer.valueOf(0)), 3);
      }
   }

   @Override
   public int a(dfa $$0, cos $$1, gu $$2, ha $$3) {
      return $$0.c(a);
   }

   @Override
   public boolean f_(dfa $$0) {
      return true;
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a);
   }

   @Override
   public void b(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if (!$$1.r_() && !$$0.a($$3.b())) {
         if ($$0.c(a) > 0 && !$$1.L().a($$2, this)) {
            $$1.a($$2, $$0.a(a, Integer.valueOf(0)), 18);
         }
      }
   }
}
