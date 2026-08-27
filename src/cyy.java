import com.mojang.serialization.MapCodec;

public class cyy extends cyv {
   public static final MapCodec<cyy> a = b(cyy::new);
   private static final double c = 0.13;
   private static final double e = 0.08;
   private static final double f = 0.05;
   private static final int g = 20;
   protected static final eks b = cvf.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   @Override
   public MapCodec<cyy> a() {
      return a;
   }

   public cyy(dhm.d $$0) {
      super($$0);
   }

   private static boolean c(bkv $$0) {
      return $$0 instanceof bll || $$0 instanceof cfq || $$0 instanceof cat || $$0 instanceof cfs;
   }

   @Override
   public eks b(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return b;
   }

   @Override
   public void a(csf $$0, dhn $$1, hx $$2, bkv $$3, float $$4) {
      $$3.a(aqv.ls, 1.0F, 1.0F);
      if (!$$0.B) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.ah().k())) {
         $$3.a(this.aJ.g(), this.aJ.a() * 0.5F, this.aJ.b() * 0.75F);
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, bkv $$3) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean a(hx $$0, bkv $$1) {
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

   private void a(bkv $$0, hx $$1) {
      if ($$0 instanceof amj && $$0.dN().W() % 20L == 0L) {
         al.J.a((amj)$$0, $$0.dN().a_($$1));
      }
   }

   private void d(bkv $$0) {
      ejz $$1 = $$0.dq();
      if ($$1.d < -0.13) {
         double $$2 = -0.05 / $$1.d;
         $$0.g(new ejz($$1.c * $$2, -0.05, $$1.e * $$2));
      } else {
         $$0.g(new ejz($$1.c, -0.05, $$1.e));
      }

      $$0.n();
   }

   private void a(csf $$0, bkv $$1) {
      if (c($$1)) {
         if ($$0.z.a(5) == 0) {
            $$1.a(aqv.ls, 1.0F, 1.0F);
         }

         if (!$$0.B && $$0.z.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(bkv $$0) {
      a($$0, 5);
   }

   public static void b(bkv $$0) {
      a($$0, 10);
   }

   private static void a(bkv $$0, int $$1) {
      if ($$0.dN().B) {
         dhn $$2 = cvh.pg.o();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dN().a(new jo(jw.c, $$2), $$0.ds(), $$0.du(), $$0.dy(), 0.0, 0.0, 0.0);
         }
      }
   }
}
