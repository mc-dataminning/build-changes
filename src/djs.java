import com.mojang.serialization.MapCodec;

public class djs extends djo {
   public static final MapCodec<djs> a = b(djs::new);
   private static final double c = 0.13;
   private static final double e = 0.08;
   private static final double f = 0.05;
   private static final int g = 20;
   protected static final ext b = dfy.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   @Override
   public MapCodec<djs> a() {
      return a;
   }

   public djs(dtb.d $$0) {
      super($$0);
   }

   private static boolean c(bsr $$0) {
      return $$0 instanceof btn || $$0 instanceof cot || $$0 instanceof cji || $$0 instanceof cov;
   }

   @Override
   protected ext b(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return b;
   }

   @Override
   public void a(dcw $$0, dtc $$1, jd $$2, bsr $$3, float $$4) {
      $$3.a(avp.mA, 1.0F, 1.0F);
      if (!$$0.B) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.aj().l())) {
         $$3.a(this.aJ.g(), this.aJ.a() * 0.5F, this.aJ.b() * 0.75F);
      }
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, bsr $$3) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean a(jd $$0, bsr $$1) {
      if ($$1.aF()) {
         return false;
      } else if ($$1.dw() > (double)$$0.v() + 0.9375 - 1.0E-7) {
         return false;
      } else if ($$1.ds().d >= -0.08) {
         return false;
      } else {
         double $$2 = Math.abs((double)$$0.u() + 0.5 - $$1.du());
         double $$3 = Math.abs((double)$$0.w() + 0.5 - $$1.dA());
         double $$4 = 0.4375 + (double)($$1.dk() / 2.0F);
         return $$2 + 1.0E-7 > $$4 || $$3 + 1.0E-7 > $$4;
      }
   }

   private void a(bsr $$0, jd $$1) {
      if ($$0 instanceof aqv && $$0.dP().Z() % 20L == 0L) {
         an.K.a((aqv)$$0, $$0.dP().a_($$1));
      }
   }

   private void d(bsr $$0) {
      exa $$1 = $$0.ds();
      if ($$1.d < -0.13) {
         double $$2 = -0.05 / $$1.d;
         $$0.i(new exa($$1.c * $$2, -0.05, $$1.e * $$2));
      } else {
         $$0.i(new exa($$1.c, -0.05, $$1.e));
      }

      $$0.n();
   }

   private void a(dcw $$0, bsr $$1) {
      if (c($$1)) {
         if ($$0.z.a(5) == 0) {
            $$1.a(avp.mA, 1.0F, 1.0F);
         }

         if (!$$0.B && $$0.z.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(bsr $$0) {
      a($$0, 5);
   }

   public static void b(bsr $$0) {
      a($$0, 10);
   }

   private static void a(bsr $$0, int $$1) {
      if ($$0.dP().B) {
         dtc $$2 = dga.pg.o();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dP().a(new le(lm.b, $$2), $$0.du(), $$0.dw(), $$0.dA(), 0.0, 0.0, 0.0);
         }
      }
   }
}
