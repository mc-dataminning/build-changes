import com.mojang.serialization.MapCodec;

public class dlj extends dfi {
   public static final MapCodec<dlj> a = b(dlj::new);
   public static final dtc b = dlm.d;

   @Override
   public MapCodec<dlj> a() {
      return a;
   }

   public dlj(dsk.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a_(dsl $$0, dcg $$1, ja $$2, cml $$3) {
      d($$0, $$1, $$2);
      super.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dcg $$0, ja $$1, dsl $$2, bsh $$3) {
      if (!$$3.bY()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bqj a(cud $$0, dsl $$1, dcg $$2, ja $$3, cml $$4, bqg $$5, ewd $$6) {
      if ($$2.B) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return $$0.g() instanceof csc && new cxn($$4, $$5, $$0, $$6).b() ? bqj.e : bqj.a;
   }

   private static void d(dsl $$0, dcg $$1, ja $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean d_(dsl $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, cud $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bps.a(1, 5));
      }
   }

   @Override
   public void a(dsl $$0, dcg $$1, ja $$2, ayo $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(dcg $$0, ja $$1) {
      double $$2 = 0.5625;
      ayo $$3 = $$0.z;

      for (jf $$4 : jf.values()) {
         ja $$5 = $$1.a($$4);
         if (!$$0.a_($$5).i($$0, $$5)) {
            jf.a $$6 = $$4.o();
            double $$7 = $$6 == jf.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == jf.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == jf.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(le.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b);
   }
}
