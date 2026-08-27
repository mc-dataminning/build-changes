public class cwc extends cvz {
   private static final double b = 0.13;
   private static final double c = 0.08;
   private static final double d = 0.05;
   private static final int e = 20;
   protected static final ehw a = csl.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   public cwc(dey.d $$0) {
      super($$0);
   }

   private static boolean c(bii $$0) {
      return $$0 instanceof biy || $$0 instanceof cdd || $$0 instanceof byg || $$0 instanceof cdf;
   }

   @Override
   public ehw c(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return a;
   }

   @Override
   public void a(cpl $$0, dez $$1, gu $$2, bii $$3, float $$4) {
      $$3.a(aow.kY, 1.0F, 1.0F);
      if (!$$0.B) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.ag().k())) {
         $$3.a(this.aH.g(), this.aH.a() * 0.5F, this.aH.b() * 0.75F);
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, bii $$3) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean a(gu $$0, bii $$1) {
      if ($$1.aA()) {
         return false;
      } else if ($$1.dr() > (double)$$0.v() + 0.9375 - 1.0E-7) {
         return false;
      } else if ($$1.dn().d >= -0.08) {
         return false;
      } else {
         double $$2 = Math.abs((double)$$0.u() + 0.5 - $$1.dp());
         double $$3 = Math.abs((double)$$0.w() + 0.5 - $$1.dv());
         double $$4 = 0.4375 + (double)($$1.df() / 2.0F);
         return $$2 + 1.0E-7 > $$4 || $$3 + 1.0E-7 > $$4;
      }
   }

   private void a(bii $$0, gu $$1) {
      if ($$0 instanceof akl && $$0.dK().V() % 20L == 0L) {
         ai.J.a((akl)$$0, $$0.dK().a_($$1));
      }
   }

   private void d(bii $$0) {
      ehd $$1 = $$0.dn();
      if ($$1.d < -0.13) {
         double $$2 = -0.05 / $$1.d;
         $$0.f(new ehd($$1.c * $$2, -0.05, $$1.e * $$2));
      } else {
         $$0.f(new ehd($$1.c, -0.05, $$1.e));
      }

      $$0.n();
   }

   private void a(cpl $$0, bii $$1) {
      if (c($$1)) {
         if ($$0.z.a(5) == 0) {
            $$1.a(aow.kY, 1.0F, 1.0F);
         }

         if (!$$0.B && $$0.z.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(bii $$0) {
      a($$0, 5);
   }

   public static void b(bii $$0) {
      a($$0, 10);
   }

   private static void a(bii $$0, int $$1) {
      if ($$0.dK().B) {
         dez $$2 = csm.pg.n();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dK().a(new in(iv.c, $$2), $$0.dp(), $$0.dr(), $$0.dv(), 0.0, 0.0, 0.0);
         }
      }
   }
}
