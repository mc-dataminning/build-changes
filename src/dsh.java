import com.mojang.serialization.MapCodec;

public class dsh extends dkd {
   public static final MapCodec<dsh> a = b(dsh::new);
   private static final double b = 5.0;
   private static final fcl c = dkd.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dsh> a() {
      return a;
   }

   protected dsh(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.a;
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return c;
   }

   @Override
   protected float c(dxo $$0, dge $$1, jh $$2) {
      return 1.0F;
   }
}
