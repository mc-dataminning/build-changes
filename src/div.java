import com.mojang.serialization.MapCodec;

public class div extends die {
   public static final MapCodec<div> a = b(div::new);
   protected static final fah b = die.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends div> a() {
      return a;
   }

   public div(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return b;
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      return !$$0.a($$3, $$4) ? dig.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      return !$$1.u($$2.e());
   }
}
