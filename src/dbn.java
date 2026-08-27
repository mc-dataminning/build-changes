import com.mojang.serialization.MapCodec;

public abstract class dbn extends cxi {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final eks h = cvf.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final eks i = cvf.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final eks j = cvf.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dbn(dhm.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dbn> a();

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
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
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }
}
