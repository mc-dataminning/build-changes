import com.mojang.serialization.MapCodec;

public class dps extends djm {
   public static final MapCodec<dps> a = b(dps::new);
   public static final dxo b = dpv.d;

   @Override
   public MapCodec<dps> a() {
      return a;
   }

   public dps(dww.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a_(dwx $$0, dgi $$1, ji $$2, cox $$3) {
      e($$0, $$1, $$2);
      super.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dgi $$0, ji $$1, dwx $$2, buk $$3) {
      if (!$$3.ce()) {
         e($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bsj a(cwp $$0, dwx $$1, dgi $$2, ji $$3, cox $$4, bsi $$5, faw $$6) {
      if ($$2.C) {
         a($$2, $$3);
      } else {
         e($$1, $$2, $$3);
      }

      return (bsj)($$0.h() instanceof cuv && new dag($$4, $$5, $$0, $$6).b() ? bsj.e : bsj.a);
   }

   private static void e(dwx $$0, dgi $$1, ji $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean f(dwx $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(dwx $$0, arc $$1, ji $$2, azh $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dwx $$0, arc $$1, ji $$2, cwp $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bru.a(1, 5));
      }
   }

   @Override
   public void a(dwx $$0, dgi $$1, ji $$2, azh $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(dgi $$0, ji $$1) {
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
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b);
   }
}
