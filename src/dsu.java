import com.mojang.serialization.MapCodec;

public class dsu extends dnu {
   public static final MapCodec<dsu> b = b(dsu::new);

   protected dsu(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected MapCodec<? extends dsu> a() {
      return b;
   }

   @Override
   protected fcl c(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return fci.a();
   }

   @Override
   protected float c(dxo $$0, dge $$1, jh $$2) {
      return 1.0F;
   }

   @Override
   protected boolean e_(dxo $$0) {
      return true;
   }
}
