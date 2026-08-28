import com.mojang.serialization.MapCodec;

public abstract class dep extends dfw {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final exp h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final exp b = exm.a(
      exm.b(), exm.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), exa.e
   );
   protected final kj.a c;

   @Override
   protected abstract MapCodec<? extends dep> a();

   public dep(dsz.d $$0, kj.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dta $$0) {
      return 0.0;
   }

   protected boolean a(dta $$0, jd $$1, bsq $$2) {
      return $$2.dx() < (double)$$1.v() + this.b($$0) && $$2.cL().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bqs a(cuo $$0, dta $$1, dcu $$2, jd $$3, cmv $$4, bqp $$5, ews $$6) {
      kj $$7 = this.c.b().get($$0.g());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return b;
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2) {
      return h;
   }

   @Override
   protected boolean c_(dta $$0) {
      return true;
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }

   public abstract boolean d(dta var1);

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      jd $$4 = dlo.a((dcu)$$1, $$2);
      if ($$4 != null) {
         eox $$5 = dlo.a($$1, $$4);
         if ($$5 != eoz.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(eox $$0) {
      return false;
   }

   protected void a(dta $$0, dcu $$1, jd $$2, eox $$3) {
   }
}
