import com.mojang.serialization.MapCodec;

public class dqy extends dkl implements dko {
   public static final MapCodec<dqy> a = b(dqy::new);

   @Override
   public MapCodec<dqy> a() {
      return a;
   }

   public dqy(dxt.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dhk $$0, jh $$1, dxu $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(dhh $$0, bam $$1, jh $$2, dxu $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxu $$3) {
      $$0.b($$2.e(), dkn.tb.m());
   }

   @Override
   public jh a(jh $$0) {
      return $$0.e();
   }
}
