import com.mojang.serialization.MapCodec;

public class doh extends doc {
   public static final MapCodec<doh> a = b(doh::new);
   private static final double c = 0.2058;
   private static final double e = 0.1568;
   private static final double f = 0.1274;
   private static final int g = 20;
   protected static final fcr b = dkl.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   @Override
   public MapCodec<doh> a() {
      return a;
   }

   public doh(dxt.d $$0) {
      super($$0);
   }

   private static boolean c(bvj $$0) {
      return $$0 instanceof bwf || $$0 instanceof crv || $$0 instanceof cmb || $$0 instanceof crt;
   }

   @Override
   protected fcr b(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return b;
   }

   @Override
   public void a(dhh $$0, dxu $$1, jh $$2, bvj $$3, float $$4) {
      $$3.a(axf.mS, 1.0F, 1.0F);
      if (!$$0.C) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.aj().l())) {
         $$3.a(this.aK.g(), this.aK.a() * 0.5F, this.aK.b() * 0.75F);
      }
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, bvj $$3) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean a(jh $$0, bvj $$1) {
      if ($$1.aJ()) {
         return false;
      } else if ($$1.dD() > (double)$$0.v() + 0.9375 - 1.0E-7) {
         return false;
      } else if ($$1.dz().e >= -0.1568) {
         return false;
      } else {
         double $$2 = Math.abs((double)$$0.u() + 0.5 - $$1.dB());
         double $$3 = Math.abs((double)$$0.w() + 0.5 - $$1.dH());
         double $$4 = 0.4375 + (double)($$1.dr() / 2.0F);
         return $$2 + 1.0E-7 > $$4 || $$3 + 1.0E-7 > $$4;
      }
   }

   private void a(bvj $$0, jh $$1) {
      if ($$0 instanceof asi && $$0.dW().ac() % 20L == 0L) {
         ao.K.a((asi)$$0, $$0.dW().a_($$1));
      }
   }

   private void d(bvj $$0) {
      fbx $$1 = $$0.dz();
      if ($$0.dz().e < -0.2058) {
         double $$2 = $$0.dz().e / 0.98F + 0.08;
         double $$3 = -0.1274 / $$2;
         $$0.h(new fbx($$1.d * $$3, -0.1274, $$1.f * $$3));
      } else {
         $$0.h(new fbx($$1.d, -0.1274, $$1.f));
      }

      $$0.k();
   }

   private void a(dhh $$0, bvj $$1) {
      if (c($$1)) {
         if ($$0.A.a(5) == 0) {
            $$1.a(axf.mS, 1.0F, 1.0F);
         }

         if (!$$0.C && $$0.A.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(bvj $$0) {
      a($$0, 5);
   }

   public static void b(bvj $$0) {
      a($$0, 10);
   }

   private static void a(bvj $$0, int $$1) {
      if ($$0.dW().C) {
         dxu $$2 = dkn.pB.m();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dW().a(new lk(ls.b, $$2), $$0.dB(), $$0.dD(), $$0.dH(), 0.0, 0.0, 0.0);
         }
      }
   }
}
