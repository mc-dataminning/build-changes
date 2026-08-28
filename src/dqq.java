import com.mojang.serialization.MapCodec;

public class dqq extends dql {
   public static final MapCodec<dqq> a = b(dqq::new);
   private static final double b = 0.13;
   private static final double c = 0.08;
   private static final double e = 0.05;
   private static final int f = 20;
   private static final ffw g = dmr.b(14.0, 0.0, 15.0);

   @Override
   public MapCodec<dqq> a() {
      return a;
   }

   public dqq(eas.d $$0) {
      super($$0);
   }

   private static boolean c(bwi $$0) {
      return $$0 instanceof bxj || $$0 instanceof ctz || $$0 instanceof cns || $$0 instanceof ctx;
   }

   @Override
   protected ffw b(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return g;
   }

   @Override
   public void a(djm $$0, eat $$1, iv $$2, bwi $$3, double $$4) {
      $$3.a(awn.nc, 1.0F, 1.0F);
      if (!$$0.C) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.al().l())) {
         $$3.a(this.I.g(), this.I.a() * 0.5F, this.I.b() * 0.75F);
      }
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, bwi $$3, bxb $$4) {
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
      ffc $$1 = $$0.dx();
      if (b($$0.dx().e) < -0.13) {
         double $$2 = -0.05 / b($$0.dx().e);
         $$0.i(new ffc($$1.d * $$2, c(-0.05), $$1.f * $$2));
      } else {
         $$0.i(new ffc($$1.d, c(-0.05), $$1.f));
      }

      $$0.k();
   }

   private void a(djm $$0, bwi $$1) {
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
         eat $$2 = dmt.pO.m();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dU().a(new lq(ly.b, $$2), $$0.dz(), $$0.dB(), $$0.dF(), 0.0, 0.0, 0.0);
         }
      }
   }
}
