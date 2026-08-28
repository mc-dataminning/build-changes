import com.mojang.serialization.MapCodec;

public class dqs extends dkd implements dkg {
   public static final MapCodec<dqs> a = b(dqs::new);

   @Override
   public MapCodec<dqs> a() {
      return a;
   }

   public dqs(dxn.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dhc $$0, jh $$1, dxo $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(dgz $$0, bac $$1, jh $$2, dxo $$3) {
      return true;
   }

   @Override
   public void a(arx $$0, bac $$1, jh $$2, dxo $$3) {
      $$0.b($$2.e(), dkf.ti.m());
   }

   @Override
   public jh a(jh $$0) {
      return $$0.e();
   }
}
