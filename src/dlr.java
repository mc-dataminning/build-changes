import com.mojang.serialization.MapCodec;

public abstract class dlr extends dhl {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final exa h = dfi.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final exa i = dfi.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final exa j = dfi.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dlr(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dlr> a();

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
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
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }
}
