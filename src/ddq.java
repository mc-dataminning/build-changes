import com.mojang.serialization.MapCodec;

public class ddq extends cwj {
   public static final MapCodec<ddq> a = b(ddq::new);
   public static final int b = 2;
   public static final dka c = djq.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final emf g = cwj.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<ddq> a() {
      return a;
   }

   public ddq(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(c);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return g;
   }

   public int h(dja $$0) {
      return $$0.c(c);
   }

   private boolean n(dja $$0) {
      return this.h($$0) == 2;
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, arm.xB, arn.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.h($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, arm.xC, arn.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         cae $$4 = blt.aO.a((cti)$$1);
         if ($$4 != null) {
            elm $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), aui.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.y_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dnk.i, $$2, dnk.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }

   public static boolean a(cso $$0, hx $$1) {
      return $$0.a_($$1.d()).a(asb.ck);
   }
}
