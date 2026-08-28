import com.mojang.serialization.MapCodec;

public class dql extends dqg {
   public static final MapCodec<dql> a = b(dql::new);
   private static final double b = 0.13;
   private static final double c = 0.08;
   private static final double e = 0.05;
   private static final int f = 20;
   private static final ffr g = dmm.b(14.0, 0.0, 15.0);

   @Override
   public MapCodec<dql> a() {
      return a;
   }

   public dql(ean.d $$0) {
      super($$0);
   }

   private static boolean c(bwi $$0) {
      return $$0 instanceof bxj || $$0 instanceof ctw || $$0 instanceof cnp || $$0 instanceof ctu;
   }

   @Override
   protected ffr b(eao $$0, din $$1, iv $$2, ffc $$3) {
      return g;
   }

   @Override
   public void a(djh $$0, eao $$1, iv $$2, bwi $$3, double $$4) {
      $$3.a(awn.nc, 1.0F, 1.0F);
      if (!$$0.C) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.al().l())) {
         $$3.a(this.I.g(), this.I.a() * 0.5F, this.I.b() * 0.75F);
      }
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, bwi $$3, bxb $$4) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private static double b(double $$0) {
      return $$0 / 0.98F + 0.08;
   }

   private static double c(double $$0) {
      return ($$0 - 0.08) * 0.98F;
   }

   private boolean a(iv $$0, bwi $$1) {
      if ($$1.aH()) {
         return false;
      } else if ($$1.dB() > (double)$$0.v() + 0.9375 - 1.0E-7) {
         return false;
      } else if (b($$1.dx().e) >= -0.08) {
         return false;
      } else {
         double $$2 = Math.abs((double)$$0.u() + 0.5 - $$1.dz());
         double $$3 = Math.abs((double)$$0.w() + 0.5 - $$1.dF());
         double $$4 = 0.4375 + (double)($$1.dp() / 2.0F);
         return $$2 + 1.0E-7 > $$4 || $$3 + 1.0E-7 > $$4;
      }
   }

   private void a(bwi $$0, iv $$1) {
      if ($$0 instanceof arr && $$0.dU().ae() % 20L == 0L) {
         aq.K.a((arr)$$0, $$0.dU().a_($$1));
      }
   }

   private void d(bwi $$0) {
      fex $$1 = $$0.dx();
      if (b($$0.dx().e) < -0.13) {
         double $$2 = -0.05 / b($$0.dx().e);
         $$0.i(new fex($$1.d * $$2, c(-0.05), $$1.f * $$2));
      } else {
         $$0.i(new fex($$1.d, c(-0.05), $$1.f));
      }

      $$0.k();
   }

   private void a(djh $$0, bwi $$1) {
      if (c($$1)) {
         if ($$0.A.a(5) == 0) {
            $$1.a(awn.nc, 1.0F, 1.0F);
         }

         if (!$$0.C && $$0.A.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(bwi $$0) {
      a($$0, 5);
   }

   public static void b(bwi $$0) {
      a($$0, 10);
   }

   private static void a(bwi $$0, int $$1) {
      if ($$0.dU().C) {
         eao $$2 = dmo.pO.m();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dU().a(new lq(ly.b, $$2), $$0.dz(), $$0.dB(), $$0.dF(), 0.0, 0.0, 0.0);
         }
      }
   }
}
