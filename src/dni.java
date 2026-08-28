import com.mojang.serialization.MapCodec;

public class dni extends dnd {
   public static final MapCodec<dni> a = b(dni::new);
   private static final double c = 0.13;
   private static final double e = 0.08;
   private static final double f = 0.05;
   private static final int g = 20;
   protected static final fbu b = djm.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   @Override
   public MapCodec<dni> a() {
      return a;
   }

   public dni(dww.d $$0) {
      super($$0);
   }

   private static boolean c(buk $$0) {
      return $$0 instanceof bvg || $$0 instanceof cqw || $$0 instanceof clc || $$0 instanceof cqu;
   }

   @Override
   protected fbu b(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return b;
   }

   @Override
   public void a(dgi $$0, dwx $$1, ji $$2, buk $$3, float $$4) {
      $$3.a(awa.mY, 1.0F, 1.0F);
      if (!$$0.C) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.ak().l())) {
         $$3.a(this.aK.g(), this.aK.a() * 0.5F, this.aK.b() * 0.75F);
      }
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, buk $$3) {
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

   private void a(buk $$0, ji $$1) {
      if ($$0 instanceof ard && $$0.dW().ad() % 20L == 0L) {
         ap.K.a((ard)$$0, $$0.dW().a_($$1));
      }
   }

   private void d(buk $$0) {
      fba $$1 = $$0.dz();
      if (a($$0.dz().e) < -0.13) {
         double $$2 = -0.05 / a($$0.dz().e);
         $$0.h(new fba($$1.d * $$2, b(-0.05), $$1.f * $$2));
      } else {
         $$0.h(new fba($$1.d, b(-0.05), $$1.f));
      }

      $$0.k();
   }

   private void a(dgi $$0, buk $$1) {
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
      if ($$0.dW().C) {
         dwx $$2 = djo.pI.m();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dW().a(new ll(lt.b, $$2), $$0.dB(), $$0.dD(), $$0.dH(), 0.0, 0.0, 0.0);
         }
      }
   }
}
