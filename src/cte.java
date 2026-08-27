public class cte extends ctb {
   private static final double b = 0.13;
   private static final double c = 0.08;
   private static final double d = 0.05;
   private static final int e = 20;
   protected static final efb a = cpn.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   public cte(dca.d $$0) {
      super($$0);
   }

   private static boolean c(bfj $$0) {
      return $$0 instanceof bfz || $$0 instanceof caf || $$0 instanceof bvi || $$0 instanceof cah;
   }

   @Override
   public efb c(dcb $$0, cls $$1, gu $$2, een $$3) {
      return a;
   }

   @Override
   public void a(cmm $$0, dcb $$1, gu $$2, bfj $$3, float $$4) {
      $$3.a(amh.kY, 1.0F, 1.0F);
      if (!$$0.B) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.ag().k())) {
         $$3.a(this.aH.g(), this.aH.a() * 0.5F, this.aH.b() * 0.75F);
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, bfj $$3) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean a(gu $$0, bfj $$1) {
      if ($$1.ay()) {
         return false;
      } else if ($$1.dp() > (double)$$0.v() + 0.9375 - 1.0E-7) {
         return false;
      } else if ($$1.dl().d >= -0.08) {
         return false;
      } else {
         double $$2 = Math.abs((double)$$0.u() + 0.5 - $$1.dn());
         double $$3 = Math.abs((double)$$0.w() + 0.5 - $$1.dt());
         double $$4 = 0.4375 + (double)($$1.dd() / 2.0F);
         return $$2 + 1.0E-7 > $$4 || $$3 + 1.0E-7 > $$4;
      }
   }

   private void a(bfj $$0, gu $$1) {
      if ($$0 instanceof aig && $$0.dI().V() % 20L == 0L) {
         ai.J.a((aig)$$0, $$0.dI().a_($$1));
      }
   }

   private void d(bfj $$0) {
      eei $$1 = $$0.dl();
      if ($$1.d < -0.13) {
         double $$2 = -0.05 / $$1.d;
         $$0.f(new eei($$1.c * $$2, -0.05, $$1.e * $$2));
      } else {
         $$0.f(new eei($$1.c, -0.05, $$1.e));
      }

      $$0.n();
   }

   private void a(cmm $$0, bfj $$1) {
      if (c($$1)) {
         if ($$0.z.a(5) == 0) {
            $$1.a(amh.kY, 1.0F, 1.0F);
         }

         if (!$$0.B && $$0.z.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(bfj $$0) {
      a($$0, 5);
   }

   public static void b(bfj $$0) {
      a($$0, 10);
   }

   private static void a(bfj $$0, int $$1) {
      if ($$0.dI().B) {
         dcb $$2 = cpo.pg.n();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dI().a(new in(iv.c, $$2), $$0.dn(), $$0.dp(), $$0.dt(), 0.0, 0.0, 0.0);
         }
      }
   }
}
