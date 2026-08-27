import com.mojang.serialization.MapCodec;

public class djf extends dby {
   public static final MapCodec<djf> a = b(djf::new);
   public static final int b = 2;
   public static final dpz c = dpp.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final est g = dby.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<djf> a() {
      return a;
   }

   public djf(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(c);
   }

   @Override
   public est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return g;
   }

   public int m(doz $$0) {
      return $$0.c(c);
   }

   private boolean n(doz $$0) {
      return this.m($$0) == 2;
   }

   @Override
   public void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, aum.yc, aun.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.m($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, aum.yd, aun.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         ces $$4 = bqb.aQ.a((cyx)$$1);
         if ($$4 != null) {
            esa $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), axk.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.x_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dts.i, $$2, dts.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(doz $$0, elh $$1) {
      return false;
   }

   public static boolean a(cyd $$0, ib $$1) {
      return $$0.a_($$1.d()).a(avc.cm);
   }
}
