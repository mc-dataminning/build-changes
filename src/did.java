import com.mojang.serialization.MapCodec;

public abstract class did extends djk {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final fbs h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final fbs b = fbp.a(
      fbp.b(), fbp.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), fbc.e
   );
   protected final ko.a c;

   @Override
   protected abstract MapCodec<? extends did> a();

   public did(dwu.d $$0, ko.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dwv $$0) {
      return 0.0;
   }

   protected boolean a(dwv $$0, ji $$1, buj $$2) {
      return $$2.dD() < (double)$$1.v() + this.b($$0) && $$2.cR().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bsi a(cwn $$0, dwv $$1, dgg $$2, ji $$3, cov $$4, bsh $$5, fau $$6) {
      ko $$7 = this.c.b().get($$0.h());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return b;
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2) {
      return h;
   }

   @Override
   protected boolean c_(dwv $$0) {
      return true;
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }

   public abstract boolean d(dwv var1);

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      ji $$4 = dpg.a((dgg)$$1, $$2);
      if ($$4 != null) {
         esw $$5 = dpg.a($$1, $$4);
         if ($$5 != esy.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(esw $$0) {
      return false;
   }

   protected void a(dwv $$0, dgg $$1, ji $$2, esw $$3) {
   }
}
