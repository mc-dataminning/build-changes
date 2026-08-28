import com.mojang.serialization.MapCodec;

public class dtb extends dod {
   public static final MapCodec<dtb> b = b(dtb::new);

   protected dtb(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected MapCodec<? extends dtb> a() {
      return b;
   }

   @Override
   protected fcs c(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return fcp.a();
   }

   @Override
   protected float c(dxv $$0, dgn $$1, jh $$2) {
      return 1.0F;
   }

   @Override
   protected boolean e_(dxv $$0) {
      return true;
   }
}
