import com.mojang.serialization.MapCodec;

public class dmq extends dfi {
   public static final MapCodec<dmq> a = b(dmq::new);
   public static final int b = 2;
   public static final dtl c = dtb.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final exa g = dfi.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dmq> a() {
      return a;
   }

   public dmq(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(c);
   }

   @Override
   public exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return g;
   }

   public int m(dsl $$0) {
      return $$0.c(c);
   }

   private boolean n(dsl $$0) {
      return this.m($$0) == 2;
   }

   @Override
   public void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, avh.yy, avi.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.m($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, avh.yz, avi.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         chj $$4 = bsn.aR.a((dcg)$$1);
         if ($$4 != null) {
            ewh $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), ayg.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.x_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dxh.i, $$2, dxh.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dsl $$0, eoy $$1) {
      return false;
   }

   public static boolean a(dbm $$0, ja $$1) {
      return $$0.a_($$1.d()).a(avw.cs);
   }
}
