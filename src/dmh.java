import com.mojang.serialization.MapCodec;

public class dmh extends dez {
   public static final MapCodec<dmh> a = b(dmh::new);
   public static final int b = 2;
   public static final dtc c = dss.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final ewk g = dez.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dmh> a() {
      return a;
   }

   public dmh(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(c);
   }

   @Override
   public ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return g;
   }

   public int m(dsc $$0) {
      return $$0.c(c);
   }

   private boolean n(dsc $$0) {
      return this.m($$0) == 2;
   }

   @Override
   public void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, awa.yv, awb.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.m($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, awa.yw, awb.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         chw $$4 = bta.aR.a((dby)$$1);
         if ($$4 != null) {
            evr $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), ayz.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.x_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dwv.i, $$2, dwv.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dsc $$0, eok $$1) {
      return false;
   }

   public static boolean a(dbe $$0, iz $$1) {
      return $$0.a_($$1.d()).a(awp.cs);
   }
}
