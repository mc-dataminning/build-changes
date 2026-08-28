import com.mojang.serialization.MapCodec;

public class dsu extends dmm {
   public static final MapCodec<dsu> a = b(dsu::new);
   public static final ebf b = dsx.b;

   @Override
   public MapCodec<dsu> a() {
      return a;
   }

   public dsu(ean.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a_(eao $$0, djh $$1, iv $$2, crj $$3) {
      d($$0, $$1, $$2);
      super.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(djh $$0, iv $$1, eao $$2, bwi $$3) {
      if (!$$3.cc()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bug a(czk $$0, eao $$1, djh $$2, iv $$3, crj $$4, buf $$5, fet $$6) {
      if ($$2.C) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return (bug)($$0.h() instanceof cxs && new ddd($$4, $$5, $$0, $$6).b() ? bug.e : bug.a);
   }

   private static void d(eao $$0, djh $$1, iv $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean f(eao $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, czk $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, btr.a(1, 5));
      }
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(djh $$0, iv $$1) {
      double $$2 = 0.5625;
      azv $$3 = $$0.A;

      for (jb $$4 : jb.values()) {
         iv $$5 = $$1.a($$4);
         if (!$$0.a_($$5).s()) {
            jb.a $$6 = $$4.o();
            double $$7 = $$6 == jb.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == jb.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == jb.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(lt.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b);
   }
}
