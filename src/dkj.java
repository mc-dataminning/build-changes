import com.mojang.serialization.MapCodec;

public abstract class dkj extends dgd {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final evf h = dea.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final evf i = dea.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final evf j = dea.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dkj(drc.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dkj> a();

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
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
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }
}
