import com.mojang.serialization.MapCodec;

public class dlr extends dln {
   public static final MapCodec<dlr> a = b(dlr::new);
   private static final double c = 0.2058;
   private static final double e = 0.1568;
   private static final double f = 0.1274;
   private static final int g = 20;
   protected static final fab b = dhy.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   @Override
   public MapCodec<dlr> a() {
      return a;
   }

   public dlr(dvc.d $$0) {
      super($$0);
   }

   private static boolean c(btz $$0) {
      return $$0 instanceof buv || $$0 instanceof cqf || $$0 instanceof ckr || $$0 instanceof cqh;
   }

   @Override
   protected fab b(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return b;
   }

   @Override
   public void a(dev $$0, dvd $$1, jg $$2, btz $$3, float $$4) {
      $$3.a(awk.mz, 1.0F, 1.0F);
      if (!$$0.C) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.ak().l())) {
         $$3.a(this.aK.g(), this.aK.a() * 0.5F, this.aK.b() * 0.75F);
      }
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, btz $$3) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean a(jg $$0, btz $$1) {
      if ($$1.aJ()) {
         return false;
      } else if ($$1.dE() > (double)$$0.v() + 0.9375 - 1.0E-7) {
         return false;
      } else if ($$1.dA().e >= -0.1568) {
         return false;
      } else {
         double $$2 = Math.abs((double)$$0.u() + 0.5 - $$1.dC());
         double $$3 = Math.abs((double)$$0.w() + 0.5 - $$1.dI());
         double $$4 = 0.4375 + (double)($$1.ds() / 2.0F);
         return $$2 + 1.0E-7 > $$4 || $$3 + 1.0E-7 > $$4;
      }
   }

   private void a(btz $$0, jg $$1) {
      if ($$0 instanceof arn && $$0.dX().aa() % 20L == 0L) {
         an.K.a((arn)$$0, $$0.dX().a_($$1));
      }
   }

   private void d(btz $$0) {
      ezh $$1 = $$0.dA();
      if ($$0.dA().e < -0.2058) {
         double $$2 = $$0.dA().e / 0.98F + 0.08;
         double $$3 = -0.1274 / $$2;
         $$0.h(new ezh($$1.d * $$3, -0.1274, $$1.f * $$3));
      } else {
         $$0.h(new ezh($$1.d, -0.1274, $$1.f));
      }

      $$0.n();
   }

   private void a(dev $$0, btz $$1) {
      if (c($$1)) {
         if ($$0.A.a(5) == 0) {
            $$1.a(awk.mz, 1.0F, 1.0F);
         }

         if (!$$0.C && $$0.A.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(btz $$0) {
      a($$0, 5);
   }

   public static void b(btz $$0) {
      a($$0, 10);
   }

   private static void a(btz $$0, int $$1) {
      if ($$0.dX().C) {
         dvd $$2 = dia.pg.m();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dX().a(new li(lq.b, $$2), $$0.dC(), $$0.dE(), $$0.dI(), 0.0, 0.0, 0.0);
         }
      }
   }
}
