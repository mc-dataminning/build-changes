import com.mojang.serialization.MapCodec;

public abstract class dlq extends dhk {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final ewy h = dfh.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ewy i = dfh.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final ewy j = dfh.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dlq(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dlq> a();

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      switch ($$0.c(a).o()) {
         case a:
         default:
            return j;
         case c:
            return i;
         case b:
            return h;
      }
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }
}
