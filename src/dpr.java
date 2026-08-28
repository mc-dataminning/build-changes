import com.mojang.serialization.MapCodec;

public class dpr extends dij {
   public static final MapCodec<dpr> a = b(dpr::new);
   public static final int b = 2;
   public static final dwn c = dwe.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final fal g = dij.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dpr> a() {
      return a;
   }

   public dpr(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(c);
   }

   @Override
   public fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return g;
   }

   public int o(dvo $$0) {
      return $$0.c(c);
   }

   private boolean q(dvo $$0) {
      return this.o($$0) == 2;
   }

   @Override
   public void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if (!this.q($$0)) {
         $$1.a(null, $$2, awo.yC, awp.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.b(c, Integer.valueOf(this.o($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, awo.yD, awp.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         cjm $$4 = bup.aR.a($$1, buo.e);
         if ($$4 != null) {
            ezr $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), azn.h($$1.A.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.y_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(eak.i, $$2, eak.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.A.a(300));
   }

   @Override
   public boolean a(dvo $$0, esd $$1) {
      return false;
   }

   public static boolean a(dek $$0, jh $$1) {
      return $$0.a_($$1.e()).a(axd.cu);
   }
}
