import com.mojang.serialization.MapCodec;

public abstract class dhu extends die {
   protected static final int a = 2;
   protected static final fah b = die.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected dhu(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dhu> a();

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return b;
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      return $$1 == jm.a && !this.a($$0, $$3, $$4) ? dig.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      return a($$1, $$2.e(), jm.b);
   }
}
