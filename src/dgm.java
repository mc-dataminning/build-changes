import com.mojang.serialization.MapCodec;

public class dgm extends czf {
   public static final MapCodec<dgm> a = b(dgm::new);
   public static final int b = 2;
   public static final dne c = dmu.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final epo g = czf.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dgm> a() {
      return a;
   }

   public dgm(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(c);
   }

   @Override
   public epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return g;
   }

   public int m(dme $$0) {
      return $$0.c(c);
   }

   private boolean n(dme $$0) {
      return this.m($$0) == 2;
   }

   @Override
   public void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, atp.xR, atq.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.m($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, atp.xS, atq.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         cdb $$4 = bol.aP.a((cwe)$$1);
         if ($$4 != null) {
            eov $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), awm.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.y_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dqr.i, $$2, dqr.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }

   public static boolean a(cvk $$0, ib $$1) {
      return $$0.a_($$1.d()).a(aue.cl);
   }
}
