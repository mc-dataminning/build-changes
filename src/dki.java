import com.mojang.serialization.MapCodec;

public class dki extends die {
   public static final MapCodec<dki> a = b(dki::new);
   protected static final fah b = dla.c;

   @Override
   public MapCodec<dki> a() {
      return a;
   }

   protected dki(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(dvj $$0) {
      return true;
   }

   @Override
   public dvj a(czs $$0) {
      return !this.m().a((dfe)$$0.q(), $$0.a()) ? die.a(this.m(), dig.j.m(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$1 == jm.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      dla.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      dvj $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dlc;
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return b;
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }
}
