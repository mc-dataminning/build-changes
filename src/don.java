import com.mojang.serialization.MapCodec;

public abstract class don extends dkh {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final fah h = die.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final fah i = die.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final fah j = die.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected don(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends don> a();

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
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
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.b(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }
}
