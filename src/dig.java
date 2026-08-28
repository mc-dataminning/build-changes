import com.mojang.serialization.MapCodec;

public abstract class dig extends djn {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final fbv h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final fbv b = fbs.a(
      fbs.b(), fbs.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), fbf.e
   );
   protected final ko.a c;

   @Override
   protected abstract MapCodec<? extends dig> a();

   public dig(dwx.d $$0, ko.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dwy $$0) {
      return 0.0;
   }

   protected boolean a(dwy $$0, ji $$1, bum $$2) {
      return $$2.dC() < (double)$$1.v() + this.b($$0) && $$2.cR().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bsl a(cwq $$0, dwy $$1, dgj $$2, ji $$3, coy $$4, bsk $$5, fax $$6) {
      ko $$7 = this.c.b().get($$0.h());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return b;
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2) {
      return h;
   }

   @Override
   protected boolean c_(dwy $$0) {
      return true;
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }

   public abstract boolean d(dwy var1);

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      ji $$4 = dpj.a((dgj)$$1, $$2);
      if ($$4 != null) {
         esz $$5 = dpj.a($$1, $$4);
         if ($$5 != etb.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(esz $$0) {
      return false;
   }

   protected void a(dwy $$0, dgj $$1, ji $$2, esz $$3) {
   }
}
