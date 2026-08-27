import com.mojang.serialization.MapCodec;

public class dhy extends dby {
   public static final MapCodec<dhy> a = b(dhy::new);
   public static final dpq b = dib.d;

   @Override
   public MapCodec<dhy> a() {
      return a;
   }

   public dhy(doy.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, cjt $$3) {
      d($$0, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cyx $$0, ib $$1, doz $$2, bpv $$3) {
      if (!$$3.bT()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boc a(crj $$0, doz $$1, cyx $$2, ib $$3, cjt $$4, bnz $$5, erw $$6) {
      if ($$2.B) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return $$0.f() instanceof cph && new cuo($$4, $$5, $$0, $$6).b() ? boc.e : boc.a;
   }

   private static void d(doz $$0, cyx $$1, ib $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean e_(doz $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(doz $$0, aps $$1, ib $$2, axr $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, crj $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4 && cwr.a(cwt.v, $$3) == 0) {
         int $$5 = 1 + $$1.z.a(5);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(cyx $$0, ib $$1) {
      double $$2 = 0.5625;
      axr $$3 = $$0.z;

      for (ih $$4 : ih.values()) {
         ib $$5 = $$1.a($$4);
         if (!$$0.a_($$5).i($$0, $$5)) {
            ih.a $$6 = $$4.o();
            double $$7 = $$6 == ih.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == ih.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == ih.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(kf.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b);
   }
}
