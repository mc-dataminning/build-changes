import com.mojang.serialization.MapCodec;

public class dmf extends dex {
   public static final MapCodec<dmf> a = b(dmf::new);
   public static final int b = 2;
   public static final dta c = dsq.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final ewi g = dex.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dmf> a() {
      return a;
   }

   public dmf(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(c);
   }

   @Override
   public ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return g;
   }

   public int m(dsa $$0) {
      return $$0.c(c);
   }

   private boolean n(dsa $$0) {
      return this.m($$0) == 2;
   }

   @Override
   public void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, avz.yv, awa.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.m($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, avz.yw, awa.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         chu $$4 = bsy.aR.a((dbw)$$1);
         if ($$4 != null) {
            evp $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), ayx.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.x_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dwt.i, $$2, dwt.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dsa $$0, eoi $$1) {
      return false;
   }

   public static boolean a(dbc $$0, iz $$1) {
      return $$0.a_($$1.d()).a(awo.cs);
   }
}
