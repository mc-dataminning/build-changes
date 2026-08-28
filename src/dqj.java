import com.mojang.serialization.MapCodec;

public class dqj extends din implements dih {
   public static final MapCodec<dqj> a = b(dqj::new);
   protected static final float b = 6.0F;
   protected static final fah c = die.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dqj> a() {
      return a;
   }

   protected dqj(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return c;
   }

   @Override
   public boolean b(dfe $$0, jh $$1, dvj $$2) {
      return o($$2).m().a($$0, $$1) && $$0.u($$1.d());
   }

   @Override
   public boolean a(dfb $$0, azs $$1, jh $$2, dvj $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jh $$2, dvj $$3) {
      dkm.a($$0, o($$3).m(), $$2, 2);
   }

   private static dkm o(dvj $$0) {
      return (dkm)($$0.a(dig.bu) ? dig.iI : dig.iH);
   }
}
