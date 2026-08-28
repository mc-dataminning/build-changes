import com.mojang.serialization.MapCodec;

public class dmp extends dfh {
   public static final MapCodec<dmp> a = b(dmp::new);
   public static final int b = 2;
   public static final dtk c = dta.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final ewy g = dfh.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dmp> a() {
      return a;
   }

   public dmp(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(c);
   }

   @Override
   public ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return g;
   }

   public int m(dsk $$0) {
      return $$0.c(c);
   }

   private boolean n(dsk $$0) {
      return this.m($$0) == 2;
   }

   @Override
   public void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, avh.yy, avi.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.m($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, avh.yz, avi.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         chi $$4 = bsm.aR.a((dcf)$$1);
         if ($$4 != null) {
            ewf $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), ayg.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.x_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dxg.i, $$2, dxg.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dsk $$0, eow $$1) {
      return false;
   }

   public static boolean a(dbl $$0, ja $$1) {
      return $$0.a_($$1.d()).a(avw.cs);
   }
}
