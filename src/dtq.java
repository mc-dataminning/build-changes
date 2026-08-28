import com.mojang.serialization.MapCodec;

public class dtq extends dma {
   public static final MapCodec<dtq> a = b(dtq::new);
   public static final int b = 2;
   public static final eaz c = eap.aH;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final ffc g = dma.a(14.0, 12.0, 0.0, 16.0);

   @Override
   public MapCodec<dtq> a() {
      return a;
   }

   public dtq(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(c);
   }

   @Override
   public ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return g;
   }

   public int o(dzz $$0) {
      return $$0.c(c);
   }

   private boolean q(dzz $$0) {
      return this.o($$0) == 2;
   }

   @Override
   public void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if (!this.q($$0)) {
         $$1.a(null, $$2, awn.zz, awo.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.b(c, Integer.valueOf(this.o($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, awn.zA, awo.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         clq $$4 = bwm.bj.a($$1, bwl.e);
         if ($$4 != null) {
            fei $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), azm.h($$1.A.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, dzz $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.w_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(eez.i, $$2, eez.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.A.a(300));
   }

   @Override
   public boolean a(dzz $$0, ewv $$1) {
      return false;
   }

   public static boolean a(dib $$0, iu $$1) {
      return $$0.a_($$1.e()).a(axc.cx);
   }
}
