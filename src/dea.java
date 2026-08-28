import com.mojang.serialization.MapCodec;

public abstract class dea extends dfh {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final ewy h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final ewy b = ewv.a(
      ewv.b(), ewv.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), ewj.e
   );
   protected final kg.a c;

   @Override
   protected abstract MapCodec<? extends dea> a();

   public dea(dsj.d $$0, kg.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dsk $$0) {
      return 0.0;
   }

   protected boolean a(dsk $$0, ja $$1, bsg $$2) {
      return $$2.dx() < (double)$$1.v() + this.b($$0) && $$2.cL().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bqi a(cuc $$0, dsk $$1, dcf $$2, ja $$3, cmk $$4, bqf $$5, ewb $$6) {
      kg $$7 = this.c.b().get($$0.g());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return b;
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2) {
      return h;
   }

   @Override
   protected boolean c_(dsk $$0) {
      return true;
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }

   public abstract boolean d(dsk var1);

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      ja $$4 = dkz.a((dcf)$$1, $$2);
      if ($$4 != null) {
         eog $$5 = dkz.a($$1, $$4);
         if ($$5 != eoi.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(eog $$0) {
      return false;
   }

   protected void a(dsk $$0, dcf $$1, ja $$2, eog $$3) {
   }
}
