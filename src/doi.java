import com.mojang.serialization.MapCodec;

public class doi extends dod {
   public static final MapCodec<doi> a = b(doi::new);
   private static final double c = 0.13;
   private static final double e = 0.08;
   private static final double f = 0.05;
   private static final int g = 20;
   protected static final fcs b = dkm.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   @Override
   public MapCodec<doi> a() {
      return a;
   }

   public doi(dxu.d $$0) {
      super($$0);
   }

   private static boolean c(bvk $$0) {
      return $$0 instanceof bwg || $$0 instanceof crw || $$0 instanceof cmc || $$0 instanceof cru;
   }

   @Override
   protected fcs b(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return b;
   }

   @Override
   public void a(dhi $$0, dxv $$1, jh $$2, bvk $$3, float $$4) {
      $$3.a(axf.mS, 1.0F, 1.0F);
      if (!$$0.C) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.aj().l())) {
         $$3.a(this.aK.g(), this.aK.a() * 0.5F, this.aK.b() * 0.75F);
      }
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, bvk $$3) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private static double a(double $$0) {
      return $$0 / 0.98F + 0.08;
   }

   private static double b(double $$0) {
      return ($$0 - 0.08) * 0.98F;
   }

   private boolean a(jh $$0, bvk $$1) {
      if ($$1.aJ()) {
         return false;
      } else if ($$1.dD() > (double)$$0.v() + 0.9375 - 1.0E-7) {
         return false;
      } else if (a($$1.dz().e) >= -0.08) {
         return false;
      } else {
         double $$2 = Math.abs((double)$$0.u() + 0.5 - $$1.dB());
         double $$3 = Math.abs((double)$$0.w() + 0.5 - $$1.dH());
         double $$4 = 0.4375 + (double)($$1.dr() / 2.0F);
         return $$2 + 1.0E-7 > $$4 || $$3 + 1.0E-7 > $$4;
      }
   }

   private void a(bvk $$0, jh $$1) {
      if ($$0 instanceof asi && $$0.dW().ac() % 20L == 0L) {
         ao.K.a((asi)$$0, $$0.dW().a_($$1));
      }
   }

   private void d(bvk $$0) {
      fby $$1 = $$0.dz();
      if (a($$0.dz().e) < -0.13) {
         double $$2 = -0.05 / a($$0.dz().e);
         $$0.h(new fby($$1.d * $$2, b(-0.05), $$1.f * $$2));
      } else {
         $$0.h(new fby($$1.d, b(-0.05), $$1.f));
      }

      $$0.k();
   }

   private void a(dhi $$0, bvk $$1) {
      if (c($$1)) {
         if ($$0.A.a(5) == 0) {
            $$1.a(axf.mS, 1.0F, 1.0F);
         }

         if (!$$0.C && $$0.A.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(bvk $$0) {
      a($$0, 5);
   }

   public static void b(bvk $$0) {
      a($$0, 10);
   }

   private static void a(bvk $$0, int $$1) {
      if ($$0.dW().C) {
         dxv $$2 = dko.pB.m();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dW().a(new lk(ls.b, $$2), $$0.dB(), $$0.dD(), $$0.dH(), 0.0, 0.0, 0.0);
         }
      }
   }
}
