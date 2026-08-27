import com.mojang.serialization.MapCodec;

public class cyt extends cyq {
   public static final MapCodec<cyt> a = b(cyt::new);
   private static final double c = 0.13;
   private static final double e = 0.08;
   private static final double f = 0.05;
   private static final int g = 20;
   protected static final ekn b = cva.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   @Override
   public MapCodec<cyt> a() {
      return a;
   }

   public cyt(dhh.d $$0) {
      super($$0);
   }

   private static boolean c(bkq $$0) {
      return $$0 instanceof blg || $$0 instanceof cfl || $$0 instanceof cao || $$0 instanceof cfn;
   }

   @Override
   public ekn b(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return b;
   }

   @Override
   public void a(csa $$0, dhi $$1, ht $$2, bkq $$3, float $$4) {
      $$3.a(aqr.ls, 1.0F, 1.0F);
      if (!$$0.B) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.ah().k())) {
         $$3.a(this.aJ.g(), this.aJ.a() * 0.5F, this.aJ.b() * 0.75F);
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, bkq $$3) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean a(ht $$0, bkq $$1) {
      if ($$1.aC()) {
         return false;
      } else if ($$1.du() > (double)$$0.v() + 0.9375 - 1.0E-7) {
         return false;
      } else if ($$1.dq().d >= -0.08) {
         return false;
      } else {
         double $$2 = Math.abs((double)$$0.u() + 0.5 - $$1.ds());
         double $$3 = Math.abs((double)$$0.w() + 0.5 - $$1.dy());
         double $$4 = 0.4375 + (double)($$1.dh() / 2.0F);
         return $$2 + 1.0E-7 > $$4 || $$3 + 1.0E-7 > $$4;
      }
   }

   private void a(bkq $$0, ht $$1) {
      if ($$0 instanceof amf && $$0.dN().W() % 20L == 0L) {
         al.J.a((amf)$$0, $$0.dN().a_($$1));
      }
   }

   private void d(bkq $$0) {
      eju $$1 = $$0.dq();
      if ($$1.d < -0.13) {
         double $$2 = -0.05 / $$1.d;
         $$0.g(new eju($$1.c * $$2, -0.05, $$1.e * $$2));
      } else {
         $$0.g(new eju($$1.c, -0.05, $$1.e));
      }

      $$0.n();
   }

   private void a(csa $$0, bkq $$1) {
      if (c($$1)) {
         if ($$0.z.a(5) == 0) {
            $$1.a(aqr.ls, 1.0F, 1.0F);
         }

         if (!$$0.B && $$0.z.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(bkq $$0) {
      a($$0, 5);
   }

   public static void b(bkq $$0) {
      a($$0, 10);
   }

   private static void a(bkq $$0, int $$1) {
      if ($$0.dN().B) {
         dhi $$2 = cvc.pg.o();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dN().a(new jk(js.c, $$2), $$0.ds(), $$0.du(), $$0.dy(), 0.0, 0.0, 0.0);
         }
      }
   }
}
