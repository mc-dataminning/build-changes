public class cwm extends cwj {
   private static final double b = 0.13;
   private static final double c = 0.08;
   private static final double d = 0.05;
   private static final int e = 20;
   protected static final eig a = csv.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   public cwm(dfi.d $$0) {
      super($$0);
   }

   private static boolean c(biq $$0) {
      return $$0 instanceof bjg || $$0 instanceof cdl || $$0 instanceof byo || $$0 instanceof cdn;
   }

   @Override
   public eig c(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return a;
   }

   @Override
   public void a(cpv $$0, dfj $$1, gw $$2, biq $$3, float $$4) {
      $$3.a(ape.kY, 1.0F, 1.0F);
      if (!$$0.B) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.ag().k())) {
         $$3.a(this.aH.g(), this.aH.a() * 0.5F, this.aH.b() * 0.75F);
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, biq $$3) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean a(gw $$0, biq $$1) {
      if ($$1.aA()) {
         return false;
      } else if ($$1.ds() > (double)$$0.v() + 0.9375 - 1.0E-7) {
         return false;
      } else if ($$1.do().d >= -0.08) {
         return false;
      } else {
         double $$2 = Math.abs((double)$$0.u() + 0.5 - $$1.dq());
         double $$3 = Math.abs((double)$$0.w() + 0.5 - $$1.dw());
         double $$4 = 0.4375 + (double)($$1.df() / 2.0F);
         return $$2 + 1.0E-7 > $$4 || $$3 + 1.0E-7 > $$4;
      }
   }

   private void a(biq $$0, gw $$1) {
      if ($$0 instanceof aks && $$0.dL().V() % 20L == 0L) {
         al.J.a((aks)$$0, $$0.dL().a_($$1));
      }
   }

   private void d(biq $$0) {
      ehn $$1 = $$0.do();
      if ($$1.d < -0.13) {
         double $$2 = -0.05 / $$1.d;
         $$0.f(new ehn($$1.c * $$2, -0.05, $$1.e * $$2));
      } else {
         $$0.f(new ehn($$1.c, -0.05, $$1.e));
      }

      $$0.n();
   }

   private void a(cpv $$0, biq $$1) {
      if (c($$1)) {
         if ($$0.z.a(5) == 0) {
            $$1.a(ape.kY, 1.0F, 1.0F);
         }

         if (!$$0.B && $$0.z.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(biq $$0) {
      a($$0, 5);
   }

   public static void b(biq $$0) {
      a($$0, 10);
   }

   private static void a(biq $$0, int $$1) {
      if ($$0.dL().B) {
         dfj $$2 = csw.pg.n();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dL().a(new ip(ix.c, $$2), $$0.dq(), $$0.ds(), $$0.dw(), 0.0, 0.0, 0.0);
         }
      }
   }
}
