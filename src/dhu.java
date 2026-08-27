import com.mojang.serialization.MapCodec;

public class dhu extends dhq {
   public static final MapCodec<dhu> a = b(dhu::new);
   private static final double c = 0.13;
   private static final double e = 0.08;
   private static final double f = 0.05;
   private static final int g = 20;
   protected static final evf b = dea.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   @Override
   public MapCodec<dhu> a() {
      return a;
   }

   public dhu(drc.d $$0) {
      super($$0);
   }

   private static boolean c(brw $$0) {
      return $$0 instanceof bsq || $$0 instanceof cnt || $$0 instanceof cij || $$0 instanceof cnv;
   }

   @Override
   protected evf b(drd $$0, daf $$1, io $$2, eur $$3) {
      return b;
   }

   @Override
   public void a(daz $$0, drd $$1, io $$2, brw $$3, float $$4) {
      $$3.a(avi.mA, 1.0F, 1.0F);
      if (!$$0.B) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.ai().k())) {
         $$3.a(this.aJ.g(), this.aJ.a() * 0.5F, this.aJ.b() * 0.75F);
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, brw $$3) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean a(io $$0, brw $$1) {
      if ($$1.aE()) {
         return false;
      } else if ($$1.dw() > (double)$$0.v() + 0.9375 - 1.0E-7) {
         return false;
      } else if ($$1.ds().d >= -0.08) {
         return false;
      } else {
         double $$2 = Math.abs((double)$$0.u() + 0.5 - $$1.du());
         double $$3 = Math.abs((double)$$0.w() + 0.5 - $$1.dA());
         double $$4 = 0.4375 + (double)($$1.dj() / 2.0F);
         return $$2 + 1.0E-7 > $$4 || $$3 + 1.0E-7 > $$4;
      }
   }

   private void a(brw $$0, io $$1) {
      if ($$0 instanceof aqo && $$0.dP().Y() % 20L == 0L) {
         am.K.a((aqo)$$0, $$0.dP().a_($$1));
      }
   }

   private void d(brw $$0) {
      eum $$1 = $$0.ds();
      if ($$1.d < -0.13) {
         double $$2 = -0.05 / $$1.d;
         $$0.g(new eum($$1.c * $$2, -0.05, $$1.e * $$2));
      } else {
         $$0.g(new eum($$1.c, -0.05, $$1.e));
      }

      $$0.n();
   }

   private void a(daz $$0, brw $$1) {
      if (c($$1)) {
         if ($$0.z.a(5) == 0) {
            $$1.a(avi.mA, 1.0F, 1.0F);
         }

         if (!$$0.B && $$0.z.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(brw $$0) {
      a($$0, 5);
   }

   public static void b(brw $$0) {
      a($$0, 10);
   }

   private static void a(brw $$0, int $$1) {
      if ($$0.dP().B) {
         drd $$2 = dec.pg.n();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dP().a(new kp(ky.b, $$2), $$0.du(), $$0.dw(), $$0.dA(), 0.0, 0.0, 0.0);
         }
      }
   }
}
