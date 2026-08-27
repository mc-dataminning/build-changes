import com.mojang.serialization.MapCodec;

public class dll extends dde {
   public static final MapCodec<dll> a = b(dll::new);
   private static final drh b = dqx.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dll> a() {
      return a;
   }

   public dll(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dad $$0, dqh $$1, etl $$2, clz $$3) {
      int $$4 = a((dae)$$0, $$1, $$2, (brh)$$3);
      if ($$3.u() instanceof aqi $$6) {
         $$6.a(avm.aE);
         am.M.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(dae $$0, dqh $$1, etl $$2, brh $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof cln ? 20 : 8;
      if (!$$0.O().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(etl $$0, etp $$1) {
      is $$2 = $$0.b();
      double $$3 = Math.abs(axz.e($$1.c) - 0.5);
      double $$4 = Math.abs(axz.e($$1.d) - 0.5);
      double $$5 = Math.abs(axz.e($$1.e) - 0.5);
      is.a $$6 = $$2.o();
      double $$7;
      if ($$6 == is.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == is.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, axz.c(15.0 * axz.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(dae $$0, dqh $$1, int $$2, in $$3, int $$4) {
      $$0.a($$3, $$1.a(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(dqh $$0, czj $$1, in $$2, is $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean e_(dqh $$0) {
      return true;
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b);
   }

   @Override
   protected void b(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.O().a($$2, this)) {
            $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
