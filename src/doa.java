import com.mojang.serialization.MapCodec;

public class doa extends dnv {
   public static final MapCodec<doa> a = b(doa::new);
   private static final double c = 0.2058;
   private static final double e = 0.1568;
   private static final double f = 0.1274;
   private static final int g = 20;
   protected static final fcm b = dke.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   @Override
   public MapCodec<doa> a() {
      return a;
   }

   public doa(dxm.d $$0) {
      super($$0);
   }

   private static boolean c(bvf $$0) {
      return $$0 instanceof bwb || $$0 instanceof crr || $$0 instanceof clx || $$0 instanceof crp;
   }

   @Override
   protected fcm b(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return b;
   }

   @Override
   public void a(dha $$0, dxn $$1, jh $$2, bvf $$3, float $$4) {
      $$3.a(axf.mR, 1.0F, 1.0F);
      if (!$$0.C) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.aj().l())) {
         $$3.a(this.aK.g(), this.aK.a() * 0.5F, this.aK.b() * 0.75F);
      }
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, bvf $$3) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean a(jh $$0, bvf $$1) {
      if ($$1.aJ()) {
         return false;
      } else if ($$1.dC() > (double)$$0.v() + 0.9375 - 1.0E-7) {
         return false;
      } else if ($$1.dy().e >= -0.1568) {
         return false;
      } else {
         double $$2 = Math.abs((double)$$0.u() + 0.5 - $$1.dA());
         double $$3 = Math.abs((double)$$0.w() + 0.5 - $$1.dG());
         double $$4 = 0.4375 + (double)($$1.dq() / 2.0F);
         return $$2 + 1.0E-7 > $$4 || $$3 + 1.0E-7 > $$4;
      }
   }

   private void a(bvf $$0, jh $$1) {
      if ($$0 instanceof asi && $$0.dV().ac() % 20L == 0L) {
         ao.K.a((asi)$$0, $$0.dV().a_($$1));
      }
   }

   private void d(bvf $$0) {
      fbs $$1 = $$0.dy();
      if ($$0.dy().e < -0.2058) {
         double $$2 = $$0.dy().e / 0.98F + 0.08;
         double $$3 = -0.1274 / $$2;
         $$0.h(new fbs($$1.d * $$3, -0.1274, $$1.f * $$3));
      } else {
         $$0.h(new fbs($$1.d, -0.1274, $$1.f));
      }

      $$0.k();
   }

   private void a(dha $$0, bvf $$1) {
      if (c($$1)) {
         if ($$0.A.a(5) == 0) {
            $$1.a(axf.mR, 1.0F, 1.0F);
         }

         if (!$$0.C && $$0.A.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(bvf $$0) {
      a($$0, 5);
   }

   public static void b(bvf $$0) {
      a($$0, 10);
   }

   private static void a(bvf $$0, int $$1) {
      if ($$0.dV().C) {
         dxn $$2 = dkg.pB.m();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dV().a(new lk(ls.b, $$2), $$0.dA(), $$0.dC(), $$0.dG(), 0.0, 0.0, 0.0);
         }
      }
   }
}
