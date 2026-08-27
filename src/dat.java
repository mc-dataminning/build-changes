public class dat extends csl {
   private static final dfz a = dfp.aT;
   private static final int b = 20;
   private static final int c = 8;

   public dat(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public void a(cpl $$0, dez $$1, egz $$2, cce $$3) {
      int $$4 = a((cpm)$$0, $$1, $$2, (bii)$$3);
      if ($$3.v() instanceof akl $$6) {
         $$6.a(apg.aE);
         ai.L.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(cpm $$0, dez $$1, egz $$2, bii $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof cbs ? 20 : 8;
      if (!$$0.L().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(egz $$0, ehd $$1) {
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

   private static void a(cpm $$0, dez $$1, int $$2, gu $$3, int $$4) {
      $$0.a($$3, $$1.a(a, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      if ($$0.c(a) != 0) {
         $$1.a($$2, $$0.a(a, Integer.valueOf(0)), 3);
      }
   }

   @Override
   public int a(dez $$0, cor $$1, gu $$2, ha $$3) {
      return $$0.c(a);
   }

   @Override
   public boolean f_(dez $$0) {
      return true;
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a);
   }

   @Override
   public void b(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$1.r_() && !$$0.a($$3.b())) {
         if ($$0.c(a) > 0 && !$$1.L().a($$2, this)) {
            $$1.a($$2, $$0.a(a, Integer.valueOf(0)), 18);
         }
      }
   }
}
