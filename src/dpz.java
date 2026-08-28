import com.mojang.serialization.MapCodec;

public class dpz extends djk implements djn {
   public static final MapCodec<dpz> a = b(dpz::new);

   @Override
   public MapCodec<dpz> a() {
      return a;
   }

   public dpz(dwu.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwv $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(dgg $$0, azg $$1, ji $$2, dwv $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azg $$1, ji $$2, dwv $$3) {
      $$0.b($$2.e(), djm.ti.m());
   }

   @Override
   public ji a(ji $$0) {
      return $$0.e();
   }
}
