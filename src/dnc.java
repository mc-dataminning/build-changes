import com.mojang.serialization.MapCodec;

public class dnc extends die {
   public static final MapCodec<dnc> a = b(dnc::new);
   protected static final fah b = die.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

   @Override
   public MapCodec<dnc> a() {
      return a;
   }

   public dnc(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected fah b(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return b;
   }

   @Override
   protected fah b_(dvj $$0, deg $$1, jh $$2) {
      return fae.b();
   }

   @Override
   protected fah c(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return fae.b();
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }

   @Override
   protected float c(dvj $$0, deg $$1, jh $$2) {
      return 0.2F;
   }
}
