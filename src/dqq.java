import com.mojang.serialization.MapCodec;

public class dqq extends dij {
   public static final MapCodec<dqq> a = b(dqq::new);
   private static final dwn b = dwe.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dqq> a() {
      return a;
   }

   public dqq(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dff $$0, dvo $$1, ezn $$2, cpk $$3) {
      int $$4 = a((dfg)$$0, $$1, $$2, (bui)$$3);
      if ($$3.s() instanceof arr $$6) {
         $$6.a(awy.aE);
         ao.M.a($$6, $$3, $$2.g(), $$4);
      }
   }

   private static int a(dfg $$0, dvo $$1, ezn $$2, bui $$3) {
      int $$4 = a($$2, $$2.g());
      int $$5 = $$3 instanceof coy ? 20 : 8;
      if (!$$0.R().a($$2.b(), $$1.b())) {
         a($$0, $$1, $$4, $$2.b(), $$5);
      }

      return $$4;
   }

   private static int a(ezn $$0, ezr $$1) {
      jm $$2 = $$0.c();
      double $$3 = Math.abs(azn.e($$1.d) - 0.5);
      double $$4 = Math.abs(azn.e($$1.e) - 0.5);
      double $$5 = Math.abs(azn.e($$1.f) - 0.5);
      jm.a $$6 = $$2.o();
      double $$7;
      if ($$6 == jm.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == jm.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, azn.c(15.0 * azn.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(dfg $$0, dvo $$1, int $$2, jh $$3, int $$4) {
      $$0.a($$3, $$1.b(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(dvo $$0, dek $$1, jh $$2, jm $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean f_(dvo $$0) {
      return true;
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b);
   }

   @Override
   protected void b(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      if (!$$1.y_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.R().a($$2, this)) {
            $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
