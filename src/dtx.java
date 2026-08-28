import com.mojang.serialization.MapCodec;

public class dtx extends dmf {
   public static final MapCodec<dtx> a = b(dtx::new);
   public static final int b = 2;
   public static final ebh c = eax.aH;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final ffk g = dmf.a(14.0, 12.0, 0.0, 16.0);

   @Override
   public MapCodec<dtx> a() {
      return a;
   }

   public dtx(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(c);
   }

   @Override
   public ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return g;
   }

   public int o(eah $$0) {
      return $$0.c(c);
   }

   private boolean q(eah $$0) {
      return this.o($$0) == 2;
   }

   @Override
   public void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      if (!this.q($$0)) {
         $$1.a(null, $$2, awn.zC, awo.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.b(c, Integer.valueOf(this.o($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, awn.zD, awo.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         clu $$4 = bwo.bj.a($$1, bwn.e);
         if ($$4 != null) {
            feq $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), azm.h($$1.A.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, eah $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.w_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(efh.i, $$2, efh.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.A.a(300));
   }

   @Override
   public boolean a(eah $$0, exd $$1) {
      return false;
   }

   public static boolean a(dig $$0, iu $$1) {
      return $$0.a_($$1.e()).a(axc.cy);
   }
}
