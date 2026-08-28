import com.mojang.serialization.MapCodec;

public class doo extends die implements dih {
   public static final MapCodec<doo> a = b(doo::new);

   @Override
   public MapCodec<doo> a() {
      return a;
   }

   public doo(dvi.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dfe $$0, jh $$1, dvj $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(dfb $$0, azs $$1, jh $$2, dvj $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jh $$2, dvj $$3) {
      $$0.b($$2.e(), dig.sG.m());
   }

   @Override
   public jh a(jh $$0) {
      return $$0.e();
   }
}
