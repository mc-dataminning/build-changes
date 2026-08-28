import com.mojang.serialization.MapCodec;

public class dpn extends dkm {
   public static final MapCodec<dpn> a = b(dpn::new);
   protected static final fcs b = dkm.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

   @Override
   public MapCodec<dpn> a() {
      return a;
   }

   public dpn(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected fcs b(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return b;
   }

   @Override
   protected fcs b_(dxv $$0, dgn $$1, jh $$2) {
      return fcp.b();
   }

   @Override
   protected fcs c(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return fcp.b();
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }

   @Override
   protected float c(dxv $$0, dgn $$1, jh $$2) {
      return 0.2F;
   }
}
