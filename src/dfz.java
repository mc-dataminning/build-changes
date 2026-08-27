import com.mojang.serialization.MapCodec;

public class dfz extends cys {
   public static final MapCodec<dfz> a = b(dfz::new);
   public static final int b = 2;
   public static final dmj c = dlz.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final eos g = cys.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dfz> a() {
      return a;
   }

   public dfz(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(c);
   }

   @Override
   public eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return g;
   }

   public int m(dlj $$0) {
      return $$0.c(c);
   }

   private boolean n(dlj $$0) {
      return this.m($$0) == 2;
   }

   @Override
   public void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, atl.xR, atm.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.m($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, atl.xS, atm.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         ccm $$4 = bnw.aP.a((cvr)$$1);
         if ($$4 != null) {
            enz $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), awi.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.y_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dpw.i, $$2, dpw.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }

   public static boolean a(cux $$0, hz $$1) {
      return $$0.a_($$1.d()).a(aua.cl);
   }
}
