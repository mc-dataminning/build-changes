import com.mojang.serialization.MapCodec;

public class dhn extends dho {
   public static final MapCodec<dhn> a = b(dhn::new);
   protected static final float b = 6.0F;
   protected static final fah c = die.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<dhn> a() {
      return a;
   }

   protected dhn(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return c;
   }
}
