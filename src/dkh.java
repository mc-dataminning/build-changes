import com.mojang.serialization.MapCodec;

public abstract class dkh extends dgb {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final evd h = ddy.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final evd i = ddy.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final evd j = ddy.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dkh(dra.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dkh> a();

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
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
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }
}
