import com.mojang.serialization.MapCodec;

public class dqx extends diq {
   public static final MapCodec<dqx> a = b(dqx::new);
   private static final dwu b = dwl.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dqx> a() {
      return a;
   }

   public dqx(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dfm $$0, dvv $$1, ezu $$2, cpn $$3) {
      int $$4 = a((dfn)$$0, $$1, $$2, (bul)$$3);
      if ($$3.p() instanceof arq $$6) {
         $$6.a(awx.aE);
         ao.M.a($$6, $$3, $$2.g(), $$4);
      }
   }

   private static int a(dfn $$0, dvv $$1, ezu $$2, bul $$3) {
      int $$4 = a($$2, $$2.g());
      int $$5 = $$3 instanceof cpb ? 20 : 8;
      if (!$$0.S().a($$2.b(), $$1.b())) {
         a($$0, $$1, $$4, $$2.b(), $$5);
      }

      return $$4;
   }

   private static int a(ezu $$0, ezy $$1) {
      jm $$2 = $$0.c();
      double $$3 = Math.abs(azm.e($$1.d) - 0.5);
      double $$4 = Math.abs(azm.e($$1.e) - 0.5);
      double $$5 = Math.abs(azm.e($$1.f) - 0.5);
      jm.a $$6 = $$2.o();
      double $$7;
      if ($$6 == jm.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == jm.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, azm.c(15.0 * azm.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(dfn $$0, dvv $$1, int $$2, jh $$3, int $$4) {
      $$0.a($$3, $$1.b(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(dvv $$0, der $$1, jh $$2, jm $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean f_(dvv $$0) {
      return true;
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b);
   }

   @Override
   protected void b(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if (!$$1.A_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.S().a($$2, this)) {
            $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
