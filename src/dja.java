import com.mojang.serialization.MapCodec;

public class dja extends diw {
   public static final MapCodec<dja> a = b(dja::new);
   private static final double c = 0.13;
   private static final double e = 0.08;
   private static final double f = 0.05;
   private static final int g = 20;
   protected static final exn b = dfc.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   @Override
   public MapCodec<dja> a() {
      return a;
   }

   public dja(dtb.d $$0) {
      super($$0);
   }

   private static boolean c(brv $$0) {
      return $$0 instanceof bso || $$0 instanceof cnw || $$0 instanceof cih || $$0 instanceof cny;
   }

   @Override
   protected exn b(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return b;
   }

   @Override
   public void a(dca $$0, dtc $$1, ir $$2, brv $$3, float $$4) {
      $$3.a(avo.mQ, 1.0F, 1.0F);
      if (!$$0.C) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.aj().l())) {
         $$3.a(this.aJ.g(), this.aJ.a() * 0.5F, this.aJ.b() * 0.75F);
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, brv $$3) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean a(ir $$0, brv $$1) {
      if ($$1.aE()) {
         return false;
      } else if ($$1.dB() > (double)$$0.v() + 0.9375 - 1.0E-7) {
         return false;
      } else if ($$1.dx().d >= -0.08) {
         return false;
      } else {
         double $$2 = Math.abs((double)$$0.u() + 0.5 - $$1.dz());
         double $$3 = Math.abs((double)$$0.w() + 0.5 - $$1.dF());
         double $$4 = 0.4375 + (double)($$1.do() / 2.0F);
         return $$2 + 1.0E-7 > $$4 || $$3 + 1.0E-7 > $$4;
      }
   }

   private void a(brv $$0, ir $$1) {
      if ($$0 instanceof aqu && $$0.dU().Z() % 20L == 0L) {
         an.K.a((aqu)$$0, $$0.dU().a_($$1));
      }
   }

   private void d(brv $$0) {
      ewu $$1 = $$0.dx();
      if ($$1.d < -0.13) {
         double $$2 = -0.05 / $$1.d;
         $$0.g(new ewu($$1.c * $$2, -0.05, $$1.e * $$2));
      } else {
         $$0.g(new ewu($$1.c, -0.05, $$1.e));
      }

      $$0.n();
   }

   private void a(dca $$0, brv $$1) {
      if (c($$1)) {
         if ($$0.A.a(5) == 0) {
            $$1.a(avo.mQ, 1.0F, 1.0F);
         }

         if (!$$0.C && $$0.A.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(brv $$0) {
      a($$0, 5);
   }

   public static void b(brv $$0) {
      a($$0, 10);
   }

   private static void a(brv $$0, int $$1) {
      if ($$0.dU().C) {
         dtc $$2 = dfe.qr.n();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dU().a(new ks(lb.b, $$2), $$0.dz(), $$0.dB(), $$0.dF(), 0.0, 0.0, 0.0);
         }
      }
   }
}
