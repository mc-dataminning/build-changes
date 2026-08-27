import com.mojang.serialization.MapCodec;

public class def extends cwy {
   public static final MapCodec<def> a = b(def::new);
   public static final int b = 2;
   public static final dkp c = dkf.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final emv g = cwy.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<def> a() {
      return a;
   }

   public def(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(c);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return g;
   }

   public int h(djp $$0) {
      return $$0.c(c);
   }

   private boolean n(djp $$0) {
      return this.h($$0) == 2;
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, art.xQ, aru.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.h($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, art.xR, aru.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         car $$4 = bmc.aP.a((ctx)$$1);
         if ($$4 != null) {
            emc $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), aup.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.y_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dnz.i, $$2, dnz.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }

   public static boolean a(ctd $$0, hx $$1) {
      return $$0.a_($$1.d()).a(asi.ck);
   }
}
