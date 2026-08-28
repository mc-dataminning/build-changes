import com.mojang.serialization.MapCodec;

public abstract class din extends die {
   protected din(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends din> a();

   protected boolean b(dvj $$0, deg $$1, jh $$2) {
      return $$0.a(axa.ag) || $$0.a(dig.cC);
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      return !$$0.a($$3, $$4) ? dig.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      jh $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean e_(dvj $$0) {
      return $$0.y().c();
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return $$1 == erz.c && !this.aH ? true : super.a($$0, $$1);
   }
}
