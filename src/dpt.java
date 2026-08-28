import com.mojang.serialization.MapCodec;

public class dpt extends djn {
   public static final MapCodec<dpt> a = b(dpt::new);
   public static final dxp b = dpw.d;

   @Override
   public MapCodec<dpt> a() {
      return a;
   }

   public dpt(dwx.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a_(dwy $$0, dgj $$1, ji $$2, coy $$3) {
      e($$0, $$1, $$2);
      super.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dgj $$0, ji $$1, dwy $$2, bum $$3) {
      if (!$$3.ce()) {
         e($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bsl a(cwq $$0, dwy $$1, dgj $$2, ji $$3, coy $$4, bsk $$5, fax $$6) {
      if ($$2.C) {
         a($$2, $$3);
      } else {
         e($$1, $$2, $$3);
      }

      return (bsl)($$0.h() instanceof cuw && new dah($$4, $$5, $$0, $$6).b() ? bsl.e : bsl.a);
   }

   private static void e(dwy $$0, dgj $$1, ji $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean f(dwy $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, cwq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, brw.a(1, 5));
      }
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, azh $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(dgj $$0, ji $$1) {
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
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b);
   }
}
