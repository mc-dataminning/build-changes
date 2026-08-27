import com.mojang.serialization.MapCodec;

public class dcm extends cvf {
   public static final MapCodec<dcm> a = b(dcm::new);
   public static final int b = 2;
   public static final din c = did.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final eks g = cvf.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dcm> a() {
      return a;
   }

   public dcm(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(c);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return g;
   }

   public int h(dhn $$0) {
      return $$0.c(c);
   }

   private boolean n(dhn $$0) {
      return this.h($$0) == 2;
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, aqv.xg, aqw.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.h($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, aqv.xh, aqw.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         bzi $$4 = bkz.aN.a((csf)$$1);
         if ($$4 != null) {
            ejz $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), atq.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.y_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dlx.i, $$2, dlx.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }

   public static boolean a(crl $$0, hx $$1) {
      return $$0.a_($$1.d()).a(ark.ck);
   }
}
