import com.mojang.serialization.MapCodec;

public class dgy extends dgu {
   public static final MapCodec<dgy> a = b(dgy::new);
   private static final double c = 0.13;
   private static final double e = 0.08;
   private static final double f = 0.05;
   private static final int g = 20;
   protected static final eui b = dde.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   @Override
   public MapCodec<dgy> a() {
      return a;
   }

   public dgy(dqg.d $$0) {
      super($$0);
   }

   private static boolean c(brh $$0) {
      return $$0 instanceof bsa || $$0 instanceof cnc || $$0 instanceof chs || $$0 instanceof cne;
   }

   @Override
   protected eui b(dqh $$0, czj $$1, in $$2, etu $$3) {
      return b;
   }

   @Override
   public void a(dad $$0, dqh $$1, in $$2, brh $$3, float $$4) {
      $$3.a(avc.mq, 1.0F, 1.0F);
      if (!$$0.B) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.ai().k())) {
         $$3.a(this.aJ.g(), this.aJ.a() * 0.5F, this.aJ.b() * 0.75F);
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, brh $$3) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean a(in $$0, brh $$1) {
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

   private void a(brh $$0, in $$1) {
      if ($$0 instanceof aqi && $$0.dN().Y() % 20L == 0L) {
         am.K.a((aqi)$$0, $$0.dN().a_($$1));
      }
   }

   private void d(brh $$0) {
      etp $$1 = $$0.dq();
      if ($$1.d < -0.13) {
         double $$2 = -0.05 / $$1.d;
         $$0.g(new etp($$1.c * $$2, -0.05, $$1.e * $$2));
      } else {
         $$0.g(new etp($$1.c, -0.05, $$1.e));
      }

      $$0.n();
   }

   private void a(dad $$0, brh $$1) {
      if (c($$1)) {
         if ($$0.z.a(5) == 0) {
            $$1.a(avc.mq, 1.0F, 1.0F);
         }

         if (!$$0.B && $$0.z.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(brh $$0) {
      a($$0, 5);
   }

   public static void b(brh $$0) {
      a($$0, 10);
   }

   private static void a(brh $$0, int $$1) {
      if ($$0.dN().B) {
         dqh $$2 = ddg.pg.n();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dN().a(new ko(kx.b, $$2), $$0.ds(), $$0.du(), $$0.dy(), 0.0, 0.0, 0.0);
         }
      }
   }
}
