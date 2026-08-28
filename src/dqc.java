import com.mojang.serialization.MapCodec;

public class dqc extends djn implements djq {
   public static final MapCodec<dqc> a = b(dqc::new);

   @Override
   public MapCodec<dqc> a() {
      return a;
   }

   public dqc(dwx.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dgm $$0, ji $$1, dwy $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(dgj $$0, azh $$1, ji $$2, dwy $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwy $$3) {
      $$0.b($$2.e(), djp.ti.m());
   }

   @Override
   public ji a(ji $$0) {
      return $$0.e();
   }
}
