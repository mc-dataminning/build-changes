public class cwb extends cvy {
   private static final double b = 0.13;
   private static final double c = 0.08;
   private static final double d = 0.05;
   private static final int e = 20;
   protected static final ehy a = csk.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   public cwb(dex.d $$0) {
      super($$0);
   }

   private static boolean c(big $$0) {
      return $$0 instanceof biw || $$0 instanceof cdc || $$0 instanceof byf || $$0 instanceof cde;
   }

   @Override
   public ehy c(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return a;
   }

   @Override
   public void a(cpk $$0, dey $$1, gv $$2, big $$3, float $$4) {
      $$3.a(aou.kY, 1.0F, 1.0F);
      if (!$$0.B) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.ag().k())) {
         $$3.a(this.aH.g(), this.aH.a() * 0.5F, this.aH.b() * 0.75F);
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, big $$3) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean a(gv $$0, big $$1) {
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

   private void a(big $$0, gv $$1) {
      if ($$0 instanceof akj && $$0.dK().V() % 20L == 0L) {
         ai.J.a((akj)$$0, $$0.dK().a_($$1));
      }
   }

   private void d(big $$0) {
      ehf $$1 = $$0.dn();
      if ($$1.d < -0.13) {
         double $$2 = -0.05 / $$1.d;
         $$0.f(new ehf($$1.c * $$2, -0.05, $$1.e * $$2));
      } else {
         $$0.f(new ehf($$1.c, -0.05, $$1.e));
      }

      $$0.n();
   }

   private void a(cpk $$0, big $$1) {
      if (c($$1)) {
         if ($$0.z.a(5) == 0) {
            $$1.a(aou.kY, 1.0F, 1.0F);
         }

         if (!$$0.B && $$0.z.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(big $$0) {
      a($$0, 5);
   }

   public static void b(big $$0) {
      a($$0, 10);
   }

   private static void a(big $$0, int $$1) {
      if ($$0.dK().B) {
         dey $$2 = csl.pg.n();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dK().a(new io(iw.c, $$2), $$0.dp(), $$0.dr(), $$0.dv(), 0.0, 0.0, 0.0);
         }
      }
   }
}
