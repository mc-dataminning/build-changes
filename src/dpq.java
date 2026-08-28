import com.mojang.serialization.MapCodec;

public class dpq extends die {
   public static final MapCodec<dpq> a = b(dpq::new);
   protected static final fah b = die.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dpq> a() {
      return a;
   }

   public dpq(dvi.d $$0) {
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
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      dik.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$1 == jm.b && $$2.a(dig.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      $$1.a($$2, this, 20);
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
