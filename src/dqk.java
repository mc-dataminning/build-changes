import com.mojang.serialization.MapCodec;

public class dqk extends dke {
   public static final MapCodec<dqk> a = b(dqk::new);
   public static final dyh b = dqn.b;

   @Override
   public MapCodec<dqk> a() {
      return a;
   }

   public dqk(dxp.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a_(dxq $$0, dgz $$1, ji $$2, cpr $$3) {
      e($$0, $$1, $$2);
      super.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dgz $$0, ji $$1, dxq $$2, bva $$3) {
      if (!$$3.cd()) {
         e($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bsy a(cxh $$0, dxq $$1, dgz $$2, ji $$3, cpr $$4, bsx $$5, fbt $$6) {
      if ($$2.C) {
         a($$2, $$3);
      } else {
         e($$1, $$2, $$3);
      }

      return (bsy)($$0.h() instanceof cvo && new dax($$4, $$5, $$0, $$6).b() ? bsy.e : bsy.a);
   }

   private static void e(dxq $$0, dgz $$1, ji $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean f(dxq $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, cxh $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bsj.a(1, 5));
      }
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(dgz $$0, ji $$1) {
      double $$2 = 0.5625;
      azh $$3 = $$0.A;

      for (jn $$4 : jn.values()) {
         ji $$5 = $$1.a($$4);
         if (!$$0.a_($$5).s()) {
            jn.a $$6 = $$4.o();
            double $$7 = $$6 == jn.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == jn.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == jn.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(lo.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b);
   }
}
