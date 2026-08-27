import com.mojang.serialization.MapCodec;

public class ddv extends dds {
   public static final MapCodec<ddv> a = b(ddv::new);
   private static final double c = 0.13;
   private static final double e = 0.08;
   private static final double f = 0.05;
   private static final int g = 20;
   protected static final eqm b = dac.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   @Override
   public MapCodec<ddv> a() {
      return a;
   }

   public ddv(dna.d $$0) {
      super($$0);
   }

   private static boolean c(box $$0) {
      return $$0 instanceof bpp || $$0 instanceof ckp || $$0 instanceof cff || $$0 instanceof ckr;
   }

   @Override
   protected eqm b(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return b;
   }

   @Override
   public void a(cxb $$0, dnb $$1, ib $$2, box $$3, float $$4) {
      $$3.a(aty.mj, 1.0F, 1.0F);
      if (!$$0.B) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.ah().k())) {
         $$3.a(this.aJ.g(), this.aJ.a() * 0.5F, this.aJ.b() * 0.75F);
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, box $$3) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean a(ib $$0, box $$1) {
      if ($$1.aC()) {
         return false;
      } else if ($$1.dt() > (double)$$0.v() + 0.9375 - 1.0E-7) {
         return false;
      } else if ($$1.dp().d >= -0.08) {
         return false;
      } else {
         double $$2 = Math.abs((double)$$0.u() + 0.5 - $$1.dr());
         double $$3 = Math.abs((double)$$0.w() + 0.5 - $$1.dx());
         double $$4 = 0.4375 + (double)($$1.dg() / 2.0F);
         return $$2 + 1.0E-7 > $$4 || $$3 + 1.0E-7 > $$4;
      }
   }

   private void a(box $$0, ib $$1) {
      if ($$0 instanceof apg && $$0.dM().X() % 20L == 0L) {
         am.K.a((apg)$$0, $$0.dM().a_($$1));
      }
   }

   private void d(box $$0) {
      ept $$1 = $$0.dp();
      if ($$1.d < -0.13) {
         double $$2 = -0.05 / $$1.d;
         $$0.g(new ept($$1.c * $$2, -0.05, $$1.e * $$2));
      } else {
         $$0.g(new ept($$1.c, -0.05, $$1.e));
      }

      $$0.n();
   }

   private void a(cxb $$0, box $$1) {
      if (c($$1)) {
         if ($$0.z.a(5) == 0) {
            $$1.a(aty.mj, 1.0F, 1.0F);
         }

         if (!$$0.B && $$0.z.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(box $$0) {
      a($$0, 5);
   }

   public static void b(box $$0) {
      a($$0, 10);
   }

   private static void a(box $$0, int $$1) {
      if ($$0.dM().B) {
         dnb $$2 = dae.pg.o();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dM().a(new ju(kc.c, $$2), $$0.dr(), $$0.dt(), $$0.dx(), 0.0, 0.0, 0.0);
         }
      }
   }
}
