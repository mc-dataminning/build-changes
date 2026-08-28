import com.mojang.serialization.MapCodec;

public class dth extends dku {
   public static final MapCodec<dth> a = b(dth::new);
   private static final dzm b = dzc.aW;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dth> a() {
      return a;
   }

   public dth(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dhp $$0, dym $$1, fcq $$2, crb $$3) {
      int $$4 = a((dhq)$$0, $$1, $$2, (bvs)$$3);
      if ($$3.q() instanceof aro $$6) {
         $$6.a(awu.aE);
         ap.M.a($$6, $$3, $$2.g(), $$4);
      }
   }

   private static int a(dhq $$0, dym $$1, fcq $$2, bvs $$3) {
      int $$4 = a($$2, $$2.g());
      int $$5 = $$3 instanceof cqp ? 20 : 8;
      if (!$$0.U().a($$2.b(), $$1.b())) {
         a($$0, $$1, $$4, $$2.b(), $$5);
      }

      return $$4;
   }

   private static int a(fcq $$0, fcu $$1) {
      jo $$2 = $$0.c();
      double $$3 = Math.abs(azk.e($$1.d) - 0.5);
      double $$4 = Math.abs(azk.e($$1.e) - 0.5);
      double $$5 = Math.abs(azk.e($$1.f) - 0.5);
      jo.a $$6 = $$2.o();
      double $$7;
      if ($$6 == jo.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == jo.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, azk.c(15.0 * azk.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(dhq $$0, dym $$1, int $$2, jj $$3, int $$4) {
      $$0.a($$3, $$1.b(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(dym $$0, dgv $$1, jj $$2, jo $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean f_(dym $$0) {
      return true;
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dym $$3, boolean $$4) {
      if (!$$1.w_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
