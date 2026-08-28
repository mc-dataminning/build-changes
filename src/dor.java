import com.mojang.serialization.MapCodec;

public class dor extends dom {
   public static final MapCodec<dor> a = b(dor::new);
   private static final double b = 0.13;
   private static final double c = 0.08;
   private static final double e = 0.05;
   private static final int f = 20;
   private static final fdo g = dku.b(14.0, 0.0, 15.0);

   @Override
   public MapCodec<dor> a() {
      return a;
   }

   public dor(dyl.d $$0) {
      super($$0);
   }

   private static boolean c(bvs $$0) {
      return $$0 instanceof bwr || $$0 instanceof csh || $$0 instanceof cmo || $$0 instanceof csf;
   }

   @Override
   protected fdo b(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return g;
   }

   @Override
   public void a(dhp $$0, dym $$1, jj $$2, bvs $$3, double $$4) {
      $$3.a(awk.mY, 1.0F, 1.0F);
      if (!$$0.C) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.al().l())) {
         $$3.a(this.H.g(), this.H.a() * 0.5F, this.H.b() * 0.75F);
      }
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, bvs $$3) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private static double b(double $$0) {
      return $$0 / 0.98F + 0.08;
   }

   private static double c(double $$0) {
      return ($$0 - 0.08) * 0.98F;
   }

   private boolean a(jj $$0, bvs $$1) {
      if ($$1.aJ()) {
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

   private void a(bvs $$0, jj $$1) {
      if ($$0 instanceof aro && $$0.dV().ae() % 20L == 0L) {
         ap.K.a((aro)$$0, $$0.dV().a_($$1));
      }
   }

   private void d(bvs $$0) {
      fcu $$1 = $$0.dy();
      if (b($$0.dy().e) < -0.13) {
         double $$2 = -0.05 / b($$0.dy().e);
         $$0.i(new fcu($$1.d * $$2, c(-0.05), $$1.f * $$2));
      } else {
         $$0.i(new fcu($$1.d, c(-0.05), $$1.f));
      }

      $$0.k();
   }

   private void a(dhp $$0, bvs $$1) {
      if (c($$1)) {
         if ($$0.A.a(5) == 0) {
            $$1.a(awk.mY, 1.0F, 1.0F);
         }

         if (!$$0.C && $$0.A.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(bvs $$0) {
      a($$0, 5);
   }

   public static void b(bvs $$0) {
      a($$0, 10);
   }

   private static void a(bvs $$0, int $$1) {
      if ($$0.dV().C) {
         dym $$2 = dkw.pK.m();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dV().a(new ln(lv.b, $$2), $$0.dA(), $$0.dC(), $$0.dG(), 0.0, 0.0, 0.0);
         }
      }
   }
}
