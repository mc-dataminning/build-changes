import com.mojang.serialization.MapCodec;

public abstract class doh extends dkb {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final fab h = dhy.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final fab i = dhy.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final fab j = dhy.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected doh(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends doh> a();

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
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
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.b(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }
}
