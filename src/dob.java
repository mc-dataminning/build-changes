import com.mojang.serialization.MapCodec;

public class dob extends dnw {
   public static final MapCodec<dob> a = b(dob::new);
   private static final double b = 0.13;
   private static final double c = 0.08;
   private static final double e = 0.05;
   private static final int f = 20;
   private static final fcr g = dke.b(14.0, 0.0, 15.0);

   @Override
   public MapCodec<dob> a() {
      return a;
   }

   public dob(dxp.d $$0) {
      super($$0);
   }

   private static boolean c(bva $$0) {
      return $$0 instanceof bvy || $$0 instanceof crq || $$0 instanceof clx || $$0 instanceof cro;
   }

   @Override
   protected fcr b(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return g;
   }

   @Override
   public void a(dgz $$0, dxq $$1, ji $$2, bva $$3, float $$4) {
      $$3.a(awa.mY, 1.0F, 1.0F);
      if (!$$0.C) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.al().l())) {
         $$3.a(this.H.g(), this.H.a() * 0.5F, this.H.b() * 0.75F);
      }
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, bva $$3) {
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

   private boolean a(ji $$0, bva $$1) {
      if ($$1.aJ()) {
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

   private void a(bva $$0, ji $$1) {
      if ($$0 instanceof are && $$0.dU().ae() % 20L == 0L) {
         ap.K.a((are)$$0, $$0.dU().a_($$1));
      }
   }

   private void d(bva $$0) {
      fbx $$1 = $$0.dx();
      if (b($$0.dx().e) < -0.13) {
         double $$2 = -0.05 / b($$0.dx().e);
         $$0.i(new fbx($$1.d * $$2, c(-0.05), $$1.f * $$2));
      } else {
         $$0.i(new fbx($$1.d, c(-0.05), $$1.f));
      }

      $$0.k();
   }

   private void a(dgz $$0, bva $$1) {
      if (c($$1)) {
         if ($$0.A.a(5) == 0) {
            $$1.a(awa.mY, 1.0F, 1.0F);
         }

         if (!$$0.C && $$0.A.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(bva $$0) {
      a($$0, 5);
   }

   public static void b(bva $$0) {
      a($$0, 10);
   }

   private static void a(bva $$0, int $$1) {
      if ($$0.dU().C) {
         dxq $$2 = dkg.pI.m();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dU().a(new ll(lt.b, $$2), $$0.dz(), $$0.dB(), $$0.dF(), 0.0, 0.0, 0.0);
         }
      }
   }
}
