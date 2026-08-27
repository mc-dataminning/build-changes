import com.mojang.serialization.MapCodec;

public class ddx extends cwq {
   public static final MapCodec<ddx> a = b(ddx::new);
   public static final int b = 2;
   public static final dkh c = djx.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final emm g = cwq.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<ddx> a() {
      return a;
   }

   public ddx(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(c);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return g;
   }

   public int h(djh $$0) {
      return $$0.c(c);
   }

   private boolean n(djh $$0) {
      return this.h($$0) == 2;
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, ars.xB, art.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.h($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, ars.xC, art.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         cak $$4 = blz.aO.a((ctp)$$1);
         if ($$4 != null) {
            elt $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), auo.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.y_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dnr.i, $$2, dnr.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }

   public static boolean a(csv $$0, hx $$1) {
      return $$0.a_($$1.d()).a(ash.ck);
   }
}
