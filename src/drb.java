import com.mojang.serialization.MapCodec;

public class drb extends dqw {
   public static final MapCodec<drb> a = b(drb::new);
   private static final double b = 0.13;
   private static final double c = 0.08;
   private static final double e = 0.05;
   private static final int f = 20;
   private static final fgk g = dnc.b(14.0, 0.0, 15.0);

   @Override
   public MapCodec<drb> a() {
      return a;
   }

   public drb(ebd.d $$0) {
      super($$0);
   }

   private static boolean c(bwt $$0) {
      return $$0 instanceof bxu || $$0 instanceof cuk || $$0 instanceof cod || $$0 instanceof cui;
   }

   @Override
   protected fgk b(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return g;
   }

   @Override
   public void a(djx $$0, ebe $$1, iv $$2, bwt $$3, double $$4) {
      $$3.a(awp.nc, 1.0F, 1.0F);
      if (!$$0.C) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.al().l())) {
         $$3.a(this.I.g(), this.I.a() * 0.5F, this.I.b() * 0.75F);
      }
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, bwt $$3, bxm $$4) {
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

   private boolean a(iv $$0, bwt $$1) {
      if ($$1.aH()) {
         return false;
      } else if ($$1.dC() > (double)$$0.v() + 0.9375 - 1.0E-7) {
         return false;
      } else if (b($$1.dy().e) >= -0.08) {
         return false;
      } else {
         double $$2 = Math.abs((double)$$0.u() + 0.5 - $$1.dA());
         double $$3 = Math.abs((double)$$0.w() + 0.5 - $$1.dG());
         double $$4 = 0.4375 + (double)($$1.dq() / 2.0F);
         return $$2 + 1.0E-7 > $$4 || $$3 + 1.0E-7 > $$4;
      }
   }

   private void a(bwt $$0, iv $$1) {
      if ($$0 instanceof art && $$0.dV().ae() % 20L == 0L) {
         aq.K.a((art)$$0, $$0.dV().a_($$1));
      }
   }

   private void d(bwt $$0) {
      ffq $$1 = $$0.dy();
      if (b($$0.dy().e) < -0.13) {
         double $$2 = -0.05 / b($$0.dy().e);
         $$0.i(new ffq($$1.d * $$2, c(-0.05), $$1.f * $$2));
      } else {
         $$0.i(new ffq($$1.d, c(-0.05), $$1.f));
      }

      $$0.k();
   }

   private void a(djx $$0, bwt $$1) {
      if (c($$1)) {
         if ($$0.A.a(5) == 0) {
            $$1.a(awp.nc, 1.0F, 1.0F);
         }

         if (!$$0.C && $$0.A.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(bwt $$0) {
      a($$0, 5);
   }

   public static void b(bwt $$0) {
      a($$0, 10);
   }

   private static void a(bwt $$0, int $$1) {
      if ($$0.dV().C) {
         ebe $$2 = dne.pO.m();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dV().a(new lq(ly.b, $$2), $$0.dA(), $$0.dC(), $$0.dG(), 0.0, 0.0, 0.0);
         }
      }
   }
}
