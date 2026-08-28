import com.mojang.serialization.MapCodec;

public class dhm extends dho {
   public static final MapCodec<dhm> a = b(dhm::new);
   private static final fah b = die.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   @Override
   public MapCodec<? extends dhm> a() {
      return a;
   }

   protected dhm(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return b;
   }
}
