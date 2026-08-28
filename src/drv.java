import com.mojang.serialization.MapCodec;

public class drv extends djr {
   public static final MapCodec<drv> b = b(drv::new);

   @Override
   public MapCodec<drv> a() {
      return b;
   }

   public drv(dxp.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      return this.a($$0, $$1, $$3) ? this.m() : dkg.a.m();
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      return o($$1.a_($$2.e()));
   }

   public static boolean o(dxq $$0) {
      return $$0.a(awp.aV);
   }

   @Override
   protected boolean g(dxq $$0) {
      return true;
   }
}
