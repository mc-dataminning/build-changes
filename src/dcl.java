import com.mojang.serialization.MapCodec;

public class dcl extends dci {
   public static final MapCodec<dcl> a = b(dcl::new);
   private static final double c = 0.13;
   private static final double e = 0.08;
   private static final double f = 0.05;
   private static final int g = 20;
   protected static final eos b = cys.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   @Override
   public MapCodec<dcl> a() {
      return a;
   }

   public dcl(dli.d $$0) {
      super($$0);
   }

   private static boolean c(bnq $$0) {
      return $$0 instanceof boi || $$0 instanceof cje || $$0 instanceof cdx || $$0 instanceof cjg;
   }

   @Override
   protected eos b(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return b;
   }

   @Override
   public void a(cvr $$0, dlj $$1, hz $$2, bnq $$3, float $$4) {
      $$3.a(atl.mc, 1.0F, 1.0F);
      if (!$$0.B) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.ah().k())) {
         $$3.a(this.aJ.g(), this.aJ.a() * 0.5F, this.aJ.b() * 0.75F);
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, bnq $$3) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean a(hz $$0, bnq $$1) {
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

   private void a(bnq $$0, hz $$1) {
      if ($$0 instanceof aox && $$0.dM().X() % 20L == 0L) {
         am.K.a((aox)$$0, $$0.dM().a_($$1));
      }
   }

   private void d(bnq $$0) {
      enz $$1 = $$0.dp();
      if ($$1.d < -0.13) {
         double $$2 = -0.05 / $$1.d;
         $$0.g(new enz($$1.c * $$2, -0.05, $$1.e * $$2));
      } else {
         $$0.g(new enz($$1.c, -0.05, $$1.e));
      }

      $$0.n();
   }

   private void a(cvr $$0, bnq $$1) {
      if (c($$1)) {
         if ($$0.z.a(5) == 0) {
            $$1.a(atl.mc, 1.0F, 1.0F);
         }

         if (!$$0.B && $$0.z.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(bnq $$0) {
      a($$0, 5);
   }

   public static void b(bnq $$0) {
      a($$0, 10);
   }

   private static void a(bnq $$0, int $$1) {
      if ($$0.dM().B) {
         dlj $$2 = cyu.pg.o();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dM().a(new jr(jz.c, $$2), $$0.dr(), $$0.dt(), $$0.dx(), 0.0, 0.0, 0.0);
         }
      }
   }
}
