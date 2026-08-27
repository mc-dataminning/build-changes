public class cwo extends cwl {
   private static final double b = 0.13;
   private static final double c = 0.08;
   private static final double d = 0.05;
   private static final int e = 20;
   protected static final eii a = csx.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   public cwo(dfk.d $$0) {
      super($$0);
   }

   private static boolean c(bis $$0) {
      return $$0 instanceof bji || $$0 instanceof cdn || $$0 instanceof byq || $$0 instanceof cdp;
   }

   @Override
   public eii c(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return a;
   }

   @Override
   public void a(cpx $$0, dfl $$1, gw $$2, bis $$3, float $$4) {
      $$3.a(apf.kY, 1.0F, 1.0F);
      if (!$$0.B) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.ag().k())) {
         $$3.a(this.aH.g(), this.aH.a() * 0.5F, this.aH.b() * 0.75F);
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, bis $$3) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean a(gw $$0, bis $$1) {
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

   private void a(bis $$0, gw $$1) {
      if ($$0 instanceof akt && $$0.dL().V() % 20L == 0L) {
         al.J.a((akt)$$0, $$0.dL().a_($$1));
      }
   }

   private void d(bis $$0) {
      ehp $$1 = $$0.do();
      if ($$1.d < -0.13) {
         double $$2 = -0.05 / $$1.d;
         $$0.f(new ehp($$1.c * $$2, -0.05, $$1.e * $$2));
      } else {
         $$0.f(new ehp($$1.c, -0.05, $$1.e));
      }

      $$0.n();
   }

   private void a(cpx $$0, bis $$1) {
      if (c($$1)) {
         if ($$0.z.a(5) == 0) {
            $$1.a(apf.kY, 1.0F, 1.0F);
         }

         if (!$$0.B && $$0.z.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(bis $$0) {
      a($$0, 5);
   }

   public static void b(bis $$0) {
      a($$0, 10);
   }

   private static void a(bis $$0, int $$1) {
      if ($$0.dL().B) {
         dfl $$2 = csy.pg.n();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dL().a(new ip(ix.c, $$2), $$0.dq(), $$0.ds(), $$0.dw(), 0.0, 0.0, 0.0);
         }
      }
   }
}
