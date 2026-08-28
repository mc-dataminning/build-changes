import com.mojang.serialization.MapCodec;

public class dio extends dik {
   public static final MapCodec<dio> a = b(dio::new);
   private static final double c = 0.13;
   private static final double e = 0.08;
   private static final double f = 0.05;
   private static final int g = 20;
   protected static final ewf b = deu.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   @Override
   public MapCodec<dio> a() {
      return a;
   }

   public dio(drw.d $$0) {
      super($$0);
   }

   private static boolean c(bsp $$0) {
      return $$0 instanceof btk || $$0 instanceof coo || $$0 instanceof cjd || $$0 instanceof coq;
   }

   @Override
   protected ewf b(drx $$0, daz $$1, iz $$2, evr $$3) {
      return b;
   }

   @Override
   public void a(dbt $$0, drx $$1, iz $$2, bsp $$3, float $$4) {
      $$3.a(avw.mA, 1.0F, 1.0F);
      if (!$$0.B) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.aj().k())) {
         $$3.a(this.aJ.g(), this.aJ.a() * 0.5F, this.aJ.b() * 0.75F);
      }
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, bsp $$3) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean a(iz $$0, bsp $$1) {
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

   private void a(bsp $$0, iz $$1) {
      if ($$0 instanceof arc && $$0.dP().Z() % 20L == 0L) {
         am.K.a((arc)$$0, $$0.dP().a_($$1));
      }
   }

   private void d(bsp $$0) {
      evm $$1 = $$0.ds();
      if ($$1.d < -0.13) {
         double $$2 = -0.05 / $$1.d;
         $$0.h(new evm($$1.c * $$2, -0.05, $$1.e * $$2));
      } else {
         $$0.h(new evm($$1.c, -0.05, $$1.e));
      }

      $$0.n();
   }

   private void a(dbt $$0, bsp $$1) {
      if (c($$1)) {
         if ($$0.z.a(5) == 0) {
            $$1.a(avw.mA, 1.0F, 1.0F);
         }

         if (!$$0.B && $$0.z.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(bsp $$0) {
      a($$0, 5);
   }

   public static void b(bsp $$0) {
      a($$0, 10);
   }

   private static void a(bsp $$0, int $$1) {
      if ($$0.dP().B) {
         drx $$2 = dew.pg.n();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dP().a(new la(lj.b, $$2), $$0.du(), $$0.dw(), $$0.dA(), 0.0, 0.0, 0.0);
         }
      }
   }
}
