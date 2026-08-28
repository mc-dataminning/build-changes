import com.mojang.serialization.MapCodec;

public abstract class dpz extends dlp {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final fbt h = djl.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final fbt i = djl.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final fbt j = djl.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dpz(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dpz> a();

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
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
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.b(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }
}
