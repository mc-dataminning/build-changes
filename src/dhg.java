import com.mojang.serialization.MapCodec;

public class dhg extends din implements dih {
   public static final MapCodec<dhg> a = b(dhg::new);
   private static final fah b = fae.a(die.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), die.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<dhg> a() {
      return a;
   }

   protected dhg(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return b;
   }

   @Override
   protected boolean b(dvj $$0, deg $$1, jh $$2) {
      return $$0.a(dig.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(dfe $$0, jh $$1, dvj $$2) {
      return $$0.b_($$1.d()).c();
   }

   @Override
   public boolean a(dfb $$0, azs $$1, jh $$2, dvj $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(arn $$0, azs $$1, jh $$2, dvj $$3) {
      duy.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }
}
