import com.mojang.serialization.MapCodec;

public class dqt extends dke implements dkh {
   public static final MapCodec<dqt> a = b(dqt::new);

   @Override
   public MapCodec<dqt> a() {
      return a;
   }

   public dqt(dxp.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dhc $$0, ji $$1, dxq $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(dgz $$0, azh $$1, ji $$2, dxq $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dxq $$3) {
      $$0.b($$2.e(), dkg.tk.m());
   }

   @Override
   public ji a(ji $$0) {
      return $$0.e();
   }
}
