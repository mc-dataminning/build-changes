import com.mojang.serialization.MapCodec;

public class djf extends dde {
   public static final MapCodec<djf> a = b(djf::new);
   public static final dqy b = dji.d;

   @Override
   public MapCodec<djf> a() {
      return a;
   }

   public djf(dqg.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, clh $$3) {
      d($$0, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dad $$0, in $$1, dqh $$2, brh $$3) {
      if (!$$3.bU()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bpo a(csz $$0, dqh $$1, dad $$2, in $$3, clh $$4, bpl $$5, etl $$6) {
      if ($$2.B) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return $$0.f() instanceof cqx && new cwi($$4, $$5, $$0, $$6).b() ? bpo.e : bpo.a;
   }

   private static void d(dqh $$0, dad $$1, in $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean d_(dqh $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, csz $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4 && cyh.a(cyj.v, $$3) == 0) {
         int $$5 = 1 + $$1.z.a(5);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(dad $$0, in $$1) {
      double $$2 = 0.5625;
      ayg $$3 = $$0.z;

      for (is $$4 : is.values()) {
         in $$5 = $$1.a($$4);
         if (!$$0.a_($$5).i($$0, $$5)) {
            is.a $$6 = $$4.o();
            double $$7 = $$6 == is.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == is.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == is.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(kr.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b);
   }
}
