import com.mojang.serialization.MapCodec;

public abstract class doz extends dkt {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final fas h = diq.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final fas i = diq.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final fas j = diq.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected doz(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends doz> a();

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
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
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.b(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }
}
