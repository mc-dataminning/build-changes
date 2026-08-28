import com.mojang.serialization.MapCodec;

public class dqz extends dkm implements dkp {
   public static final MapCodec<dqz> a = b(dqz::new);

   @Override
   public MapCodec<dqz> a() {
      return a;
   }

   public dqz(dxu.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dhl $$0, jh $$1, dxv $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(dhi $$0, bam $$1, jh $$2, dxv $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxv $$3) {
      $$0.b($$2.e(), dko.tb.m());
   }

   @Override
   public jh a(jh $$0) {
      return $$0.e();
   }
}
