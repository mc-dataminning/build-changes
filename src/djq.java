import com.mojang.serialization.MapCodec;

public class djq extends djm {
   public static final MapCodec<djq> a = b(djq::new);
   private static final double c = 0.13;
   private static final double e = 0.08;
   private static final double f = 0.05;
   private static final int g = 20;
   protected static final exp b = dfw.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   @Override
   public MapCodec<djq> a() {
      return a;
   }

   public djq(dsz.d $$0) {
      super($$0);
   }

   private static boolean c(bsq $$0) {
      return $$0 instanceof btl || $$0 instanceof cor || $$0 instanceof cjg || $$0 instanceof cot;
   }

   @Override
   protected exp b(dta $$0, dca $$1, jd $$2, exb $$3) {
      return b;
   }

   @Override
   public void a(dcu $$0, dta $$1, jd $$2, bsq $$3, float $$4) {
      $$3.a(avo.mA, 1.0F, 1.0F);
      if (!$$0.B) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.aj().l())) {
         $$3.a(this.aJ.g(), this.aJ.a() * 0.5F, this.aJ.b() * 0.75F);
      }
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, bsq $$3) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean a(jd $$0, bsq $$1) {
      if ($$1.aF()) {
         return false;
      } else if ($$1.dx() > (double)$$0.v() + 0.9375 - 1.0E-7) {
         return false;
      } else if ($$1.dt().d >= -0.08) {
         return false;
      } else {
         double $$2 = Math.abs((double)$$0.u() + 0.5 - $$1.dv());
         double $$3 = Math.abs((double)$$0.w() + 0.5 - $$1.dB());
         double $$4 = 0.4375 + (double)($$1.dk() / 2.0F);
         return $$2 + 1.0E-7 > $$4 || $$3 + 1.0E-7 > $$4;
      }
   }

   private void a(bsq $$0, jd $$1) {
      if ($$0 instanceof aqu && $$0.dQ().Z() % 20L == 0L) {
         an.K.a((aqu)$$0, $$0.dQ().a_($$1));
      }
   }

   private void d(bsq $$0) {
      eww $$1 = $$0.dt();
      if ($$1.d < -0.13) {
         double $$2 = -0.05 / $$1.d;
         $$0.i(new eww($$1.c * $$2, -0.05, $$1.e * $$2));
      } else {
         $$0.i(new eww($$1.c, -0.05, $$1.e));
      }

      $$0.n();
   }

   private void a(dcu $$0, bsq $$1) {
      if (c($$1)) {
         if ($$0.z.a(5) == 0) {
            $$1.a(avo.mA, 1.0F, 1.0F);
         }

         if (!$$0.B && $$0.z.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(bsq $$0) {
      a($$0, 5);
   }

   public static void b(bsq $$0) {
      a($$0, 10);
   }

   private static void a(bsq $$0, int $$1) {
      if ($$0.dQ().B) {
         dta $$2 = dfy.pg.o();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dQ().a(new le(lm.b, $$2), $$0.dv(), $$0.dx(), $$0.dB(), 0.0, 0.0, 0.0);
         }
      }
   }
}
