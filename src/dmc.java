import com.mojang.serialization.MapCodec;

public class dmc extends dly {
   public static final MapCodec<dmc> a = b(dmc::new);
   private static final double c = 0.2058;
   private static final double e = 0.1568;
   private static final double f = 0.1274;
   private static final int g = 20;
   protected static final fal b = dij.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   @Override
   public MapCodec<dmc> a() {
      return a;
   }

   public dmc(dvn.d $$0) {
      super($$0);
   }

   private static boolean c(bui $$0) {
      return $$0 instanceof bve || $$0 instanceof cqo || $$0 instanceof cla || $$0 instanceof cqq;
   }

   @Override
   protected fal b(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return b;
   }

   @Override
   public void a(dff $$0, dvo $$1, jh $$2, bui $$3, float $$4) {
      $$3.a(awo.mz, 1.0F, 1.0F);
      if (!$$0.C) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.ai().l())) {
         $$3.a(this.aK.g(), this.aK.a() * 0.5F, this.aK.b() * 0.75F);
      }
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, bui $$3) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean a(jh $$0, bui $$1) {
      if ($$1.aL()) {
         return false;
      } else if ($$1.dF() > (double)$$0.v() + 0.9375 - 1.0E-7) {
         return false;
      } else if ($$1.dB().e >= -0.1568) {
         return false;
      } else {
         double $$2 = Math.abs((double)$$0.u() + 0.5 - $$1.dD());
         double $$3 = Math.abs((double)$$0.w() + 0.5 - $$1.dJ());
         double $$4 = 0.4375 + (double)($$1.dt() / 2.0F);
         return $$2 + 1.0E-7 > $$4 || $$3 + 1.0E-7 > $$4;
      }
   }

   private void a(bui $$0, jh $$1) {
      if ($$0 instanceof arr && $$0.dY().aa() % 20L == 0L) {
         ao.K.a((arr)$$0, $$0.dY().a_($$1));
      }
   }

   private void d(bui $$0) {
      ezr $$1 = $$0.dB();
      if ($$0.dB().e < -0.2058) {
         double $$2 = $$0.dB().e / 0.98F + 0.08;
         double $$3 = -0.1274 / $$2;
         $$0.h(new ezr($$1.d * $$3, -0.1274, $$1.f * $$3));
      } else {
         $$0.h(new ezr($$1.d, -0.1274, $$1.f));
      }

      $$0.n();
   }

   private void a(dff $$0, bui $$1) {
      if (c($$1)) {
         if ($$0.A.a(5) == 0) {
            $$1.a(awo.mz, 1.0F, 1.0F);
         }

         if (!$$0.C && $$0.A.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(bui $$0) {
      a($$0, 5);
   }

   public static void b(bui $$0) {
      a($$0, 10);
   }

   private static void a(bui $$0, int $$1) {
      if ($$0.dY().C) {
         dvo $$2 = dil.pg.m();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dY().a(new lk(ls.b, $$2), $$0.dD(), $$0.dF(), $$0.dJ(), 0.0, 0.0, 0.0);
         }
      }
   }
}
