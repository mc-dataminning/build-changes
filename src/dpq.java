import com.mojang.serialization.MapCodec;

public class dpq extends djk {
   public static final MapCodec<dpq> a = b(dpq::new);
   public static final dxm b = dpt.d;

   @Override
   public MapCodec<dpq> a() {
      return a;
   }

   public dpq(dwu.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a_(dwv $$0, dgg $$1, ji $$2, cov $$3) {
      e($$0, $$1, $$2);
      super.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dgg $$0, ji $$1, dwv $$2, buj $$3) {
      if (!$$3.ce()) {
         e($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bsi a(cwn $$0, dwv $$1, dgg $$2, ji $$3, cov $$4, bsh $$5, fau $$6) {
      if ($$2.C) {
         a($$2, $$3);
      } else {
         e($$1, $$2, $$3);
      }

      return (bsi)($$0.h() instanceof cut && new dae($$4, $$5, $$0, $$6).b() ? bsi.e : bsi.a);
   }

   private static void e(dwv $$0, dgg $$1, ji $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean f(dwv $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, cwn $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, brt.a(1, 5));
      }
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, azg $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(dgg $$0, ji $$1) {
      double $$2 = 0.5625;
      azg $$3 = $$0.A;

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
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b);
   }
}
