import com.mojang.serialization.MapCodec;

public class dpe extends dkd {
   public static final MapCodec<dpe> a = b(dpe::new);
   protected static final fcl b = dkd.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

   @Override
   public MapCodec<dpe> a() {
      return a;
   }

   public dpe(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected fcl b(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return b;
   }

   @Override
   protected fcl b_(dxo $$0, dge $$1, jh $$2) {
      return fci.b();
   }

   @Override
   protected fcl c(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return fci.b();
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }

   @Override
   protected float c(dxo $$0, dge $$1, jh $$2) {
      return 0.2F;
   }
}
