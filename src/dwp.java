import com.mojang.serialization.MapCodec;

public class dwp extends dri {
   public static final MapCodec<dwp> b = b(dwp::new);

   protected dwp(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected MapCodec<? extends dwp> a() {
      return b;
   }

   @Override
   protected fgw c(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return fgt.a();
   }

   @Override
   protected float c(ebq $$0, djn $$1, iw $$2) {
      return 1.0F;
   }

   @Override
   protected boolean e_(ebq $$0) {
      return true;
   }
}
