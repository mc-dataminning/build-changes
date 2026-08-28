import com.mojang.serialization.MapCodec;

public class djb extends dix {
   public static final MapCodec<djb> a = b(djb::new);
   private static final double c = 0.13;
   private static final double e = 0.08;
   private static final double f = 0.05;
   private static final int g = 20;
   protected static final ewy b = dfh.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   @Override
   public MapCodec<djb> a() {
      return a;
   }

   public djb(dsj.d $$0) {
      super($$0);
   }

   private static boolean c(bsg $$0) {
      return $$0 instanceof btb || $$0 instanceof cof || $$0 instanceof civ || $$0 instanceof coh;
   }

   @Override
   protected ewy b(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return b;
   }

   @Override
   public void a(dcf $$0, dsk $$1, ja $$2, bsg $$3, float $$4) {
      $$3.a(avh.mA, 1.0F, 1.0F);
      if (!$$0.B) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.aj().l())) {
         $$3.a(this.aJ.g(), this.aJ.a() * 0.5F, this.aJ.b() * 0.75F);
      }
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, bsg $$3) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean a(ja $$0, bsg $$1) {
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

   private void a(bsg $$0, ja $$1) {
      if ($$0 instanceof aqn && $$0.dQ().Z() % 20L == 0L) {
         am.K.a((aqn)$$0, $$0.dQ().a_($$1));
      }
   }

   private void d(bsg $$0) {
      ewf $$1 = $$0.dt();
      if ($$1.d < -0.13) {
         double $$2 = -0.05 / $$1.d;
         $$0.i(new ewf($$1.c * $$2, -0.05, $$1.e * $$2));
      } else {
         $$0.i(new ewf($$1.c, -0.05, $$1.e));
      }

      $$0.n();
   }

   private void a(dcf $$0, bsg $$1) {
      if (c($$1)) {
         if ($$0.z.a(5) == 0) {
            $$1.a(avh.mA, 1.0F, 1.0F);
         }

         if (!$$0.B && $$0.z.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(bsg $$0) {
      a($$0, 5);
   }

   public static void b(bsg $$0) {
      a($$0, 10);
   }

   private static void a(bsg $$0, int $$1) {
      if ($$0.dQ().B) {
         dsk $$2 = dfj.pg.o();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dQ().a(new lb(lj.b, $$2), $$0.dv(), $$0.dx(), $$0.dB(), 0.0, 0.0, 0.0);
         }
      }
   }
}
