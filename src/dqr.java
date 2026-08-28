import com.mojang.serialization.MapCodec;

public class dqr extends dke implements dkh {
   public static final MapCodec<dqr> a = b(dqr::new);

   @Override
   public MapCodec<dqr> a() {
      return a;
   }

   public dqr(dxm.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dhd $$0, jh $$1, dxn $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(dha $$0, bam $$1, jh $$2, dxn $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxn $$3) {
      $$0.b($$2.e(), dkg.tb.m());
   }

   @Override
   public jh a(jh $$0) {
      return $$0.e();
   }
}
