import com.mojang.serialization.MapCodec;

public class dqd extends die {
   public static final MapCodec<dqd> a = b(dqd::new);
   private static final double b = 5.0;
   private static final fah c = die.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dqd> a() {
      return a;
   }

   protected dqd(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.a;
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return c;
   }

   @Override
   protected float c(dvj $$0, deg $$1, jh $$2) {
      return 1.0F;
   }
}
