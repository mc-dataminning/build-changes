import com.mojang.serialization.MapCodec;

public class dkm extends dde {
   public static final MapCodec<dkm> a = b(dkm::new);
   public static final int b = 2;
   public static final drh c = dqx.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final eui g = dde.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dkm> a() {
      return a;
   }

   public dkm(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(c);
   }

   @Override
   public eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return g;
   }

   public int m(dqh $$0) {
      return $$0.c(c);
   }

   private boolean n(dqh $$0) {
      return this.m($$0) == 2;
   }

   @Override
   public void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, avc.yk, avd.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.m($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, avc.yl, avd.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         cgg $$4 = brn.aQ.a((dad)$$1);
         if ($$4 != null) {
            etp $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), axz.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.x_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dva.i, $$2, dva.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dqh $$0, emp $$1) {
      return false;
   }

   public static boolean a(czj $$0, in $$1) {
      return $$0.a_($$1.d()).a(avr.cs);
   }
}
