import com.mojang.serialization.MapCodec;

public class dop extends din {
   public static final MapCodec<dop> a = b(dop::new);
   protected static final float b = 6.0F;
   protected static final fah c = die.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dop> a() {
      return a;
   }

   protected dop(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return c;
   }

   @Override
   protected boolean b(dvj $$0, deg $$1, jh $$2) {
      return $$0.a(axa.aM) || $$0.a(dig.dX) || super.b($$0, $$1, $$2);
   }
}
