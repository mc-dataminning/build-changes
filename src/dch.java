import com.mojang.serialization.MapCodec;

public abstract class dch extends cyc {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final elu h = cvz.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final elu i = cvz.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final elu j = cvz.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dch(dio.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dch> a();

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
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
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }
}
