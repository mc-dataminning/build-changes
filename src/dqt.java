import com.mojang.serialization.MapCodec;

public class dqt extends dkn {
   public static final MapCodec<dqt> a = b(dqt::new);
   protected static final float b = 6.0F;
   protected static final fcl c = dkd.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dqt> a() {
      return a;
   }

   protected dqt(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return c;
   }

   @Override
   protected boolean b(dxo $$0, dge $$1, jh $$2) {
      return $$0.a(axk.aO) || $$0.a(dkf.ek) || super.b($$0, $$1, $$2);
   }
}
