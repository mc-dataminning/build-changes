import com.mojang.serialization.MapCodec;

public class dbz extends cvz {
   public static final MapCodec<dbz> a = b(dbz::new);
   public static final djg b = dcc.d;

   @Override
   public MapCodec<dbz> a() {
      return a;
   }

   public dbz(dio.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, cer $$3) {
      d($$0, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, blf $$3) {
      if (!$$3.bT()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if ($$1.B) {
         a($$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }

      cmh $$6 = $$3.b($$4);
      return $$6.d() instanceof cka && new coq($$3, $$4, $$6, $$5).b() ? bjl.d : bjl.a;
   }

   private static void d(dip $$0, csy $$1, hv $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   public boolean e_(dip $$0) {
      return $$0.c(b);
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, cmh $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4 && cqu.a(cqw.v, $$3) == 0) {
         int $$5 = 1 + $$1.z.a(5);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(csy $$0, hv $$1) {
      double $$2 = 0.5625;
      auf $$3 = $$0.z;

      for (ia $$4 : ia.values()) {
         hv $$5 = $$1.a($$4);
         if (!$$0.a_($$5).i($$0, $$5)) {
            ia.a $$6 = $$4.o();
            double $$7 = $$6 == ia.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == ia.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == ia.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(jp.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b);
   }
}
