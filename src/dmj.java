import com.mojang.serialization.MapCodec;

public class dmj extends dmf {
   public static final MapCodec<dmj> a = b(dmj::new);
   private static final double c = 0.2058;
   private static final double e = 0.1568;
   private static final double f = 0.1274;
   private static final int g = 20;
   protected static final fas b = diq.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   @Override
   public MapCodec<dmj> a() {
      return a;
   }

   public dmj(dvu.d $$0) {
      super($$0);
   }

   private static boolean c(bul $$0) {
      return $$0 instanceof bvh || $$0 instanceof cqt || $$0 instanceof cld || $$0 instanceof cqr;
   }

   @Override
   protected fas b(dvv $$0, der $$1, jh $$2, fad $$3) {
      return b;
   }

   @Override
   public void a(dfm $$0, dvv $$1, jh $$2, bul $$3, float $$4) {
      $$3.a(awn.mz, 1.0F, 1.0F);
      if (!$$0.C) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.ai().l())) {
         $$3.a(this.aK.g(), this.aK.a() * 0.5F, this.aK.b() * 0.75F);
      }
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, bul $$3) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean a(jh $$0, bul $$1) {
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

   private void a(bul $$0, jh $$1) {
      if ($$0 instanceof arq && $$0.dV().ab() % 20L == 0L) {
         ao.K.a((arq)$$0, $$0.dV().a_($$1));
      }
   }

   private void d(bul $$0) {
      ezy $$1 = $$0.dy();
      if ($$0.dy().e < -0.2058) {
         double $$2 = $$0.dy().e / 0.98F + 0.08;
         double $$3 = -0.1274 / $$2;
         $$0.h(new ezy($$1.d * $$3, -0.1274, $$1.f * $$3));
      } else {
         $$0.h(new ezy($$1.d, -0.1274, $$1.f));
      }

      $$0.k();
   }

   private void a(dfm $$0, bul $$1) {
      if (c($$1)) {
         if ($$0.A.a(5) == 0) {
            $$1.a(awn.mz, 1.0F, 1.0F);
         }

         if (!$$0.C && $$0.A.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(bul $$0) {
      a($$0, 5);
   }

   public static void b(bul $$0) {
      a($$0, 10);
   }

   private static void a(bul $$0, int $$1) {
      if ($$0.dV().C) {
         dvv $$2 = dis.pg.m();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dV().a(new lk(ls.b, $$2), $$0.dA(), $$0.dC(), $$0.dG(), 0.0, 0.0, 0.0);
         }
      }
   }
}
