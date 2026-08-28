import com.mojang.serialization.MapCodec;

public class dli extends dfh {
   public static final MapCodec<dli> a = b(dli::new);
   public static final dtb b = dll.d;

   @Override
   public MapCodec<dli> a() {
      return a;
   }

   public dli(dsj.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a_(dsk $$0, dcf $$1, ja $$2, cmk $$3) {
      d($$0, $$1, $$2);
      super.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dcf $$0, ja $$1, dsk $$2, bsg $$3) {
      if (!$$3.bX()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bqi a(cuc $$0, dsk $$1, dcf $$2, ja $$3, cmk $$4, bqf $$5, ewb $$6) {
      if ($$2.B) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return $$0.g() instanceof csb && new cxm($$4, $$5, $$0, $$6).b() ? bqi.e : bqi.a;
   }

   private static void d(dsk $$0, dcf $$1, ja $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean d_(dsk $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, cuc $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bpr.a(1, 5));
      }
   }

   @Override
   public void a(dsk $$0, dcf $$1, ja $$2, ayo $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(dcf $$0, ja $$1) {
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
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b);
   }
}
