import com.mojang.serialization.MapCodec;

public class drj extends dku implements dkx {
   public static final MapCodec<drj> a = b(drj::new);

   @Override
   public MapCodec<drj> a() {
      return a;
   }

   public drj(dyl.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
      $$0.b($$2.e(), dkw.tm.m());
   }

   @Override
   public jj a(jj $$0) {
      return $$0.e();
   }
}
