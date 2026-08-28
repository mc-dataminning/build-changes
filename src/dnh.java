import com.mojang.serialization.MapCodec;

public class dnh extends dnc {
   public static final MapCodec<dnh> a = b(dnh::new);
   private static final double c = 0.13;
   private static final double e = 0.08;
   private static final double f = 0.05;
   private static final int g = 20;
   protected static final fbt b = djl.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   @Override
   public MapCodec<dnh> a() {
      return a;
   }

   public dnh(dwv.d $$0) {
      super($$0);
   }

   private static boolean c(buk $$0) {
      return $$0 instanceof bvg || $$0 instanceof cqv || $$0 instanceof clc || $$0 instanceof cqt;
   }

   @Override
   protected fbt b(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return b;
   }

   @Override
   public void a(dgh $$0, dww $$1, ji $$2, buk $$3, float $$4) {
      $$3.a(awa.mY, 1.0F, 1.0F);
      if (!$$0.C) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.ak().l())) {
         $$3.a(this.aK.g(), this.aK.a() * 0.5F, this.aK.b() * 0.75F);
      }
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, buk $$3) {
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

   private boolean a(ji $$0, buk $$1) {
      if ($$1.aJ()) {
         return false;
      } else if ($$1.dC() > (double)$$0.v() + 0.9375 - 1.0E-7) {
         return false;
      } else if (a($$1.dy().e) >= -0.08) {
         return false;
      } else {
         double $$2 = Math.abs((double)$$0.u() + 0.5 - $$1.dA());
         double $$3 = Math.abs((double)$$0.w() + 0.5 - $$1.dG());
         double $$4 = 0.4375 + (double)($$1.dq() / 2.0F);
         return $$2 + 1.0E-7 > $$4 || $$3 + 1.0E-7 > $$4;
      }
   }

   private void a(buk $$0, ji $$1) {
      if ($$0 instanceof are && $$0.dV().ad() % 20L == 0L) {
         ap.K.a((are)$$0, $$0.dV().a_($$1));
      }
   }

   private void d(buk $$0) {
      faz $$1 = $$0.dy();
      if (a($$0.dy().e) < -0.13) {
         double $$2 = -0.05 / a($$0.dy().e);
         $$0.i(new faz($$1.d * $$2, b(-0.05), $$1.f * $$2));
      } else {
         $$0.i(new faz($$1.d, b(-0.05), $$1.f));
      }

      $$0.k();
   }

   private void a(dgh $$0, buk $$1) {
      if (c($$1)) {
         if ($$0.A.a(5) == 0) {
            $$1.a(awa.mY, 1.0F, 1.0F);
         }

         if (!$$0.C && $$0.A.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(buk $$0) {
      a($$0, 5);
   }

   public static void b(buk $$0) {
      a($$0, 10);
   }

   private static void a(buk $$0, int $$1) {
      if ($$0.dV().C) {
         dww $$2 = djn.pI.m();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dV().a(new ll(lt.b, $$2), $$0.dA(), $$0.dC(), $$0.dG(), 0.0, 0.0, 0.0);
         }
      }
   }
}
