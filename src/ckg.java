import javax.annotation.Nullable;

public class ckg extends cjw {
   private static final bvd bF = bvi.bO.n().a(bvc.a().a(bvb.a, 0.0F, bvi.bO.m() - 0.03125F, 0.0F)).a(0.5F);

   public ckg(bvi<? extends ckg> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public static bxf.a q() {
      return gU().a(bxg.s, 15.0).a(bxg.v, 0.2F);
   }

   public static boolean c(bvi<? extends chp> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      return !bvh.a($$2) ? chp.b($$0, $$1, $$2, $$3, $$4) : bvh.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azh $$0) {
      this.g(bxg.o).a(a($$0::j));
   }

   @Override
   protected avz u() {
      return awa.Ey;
   }

   @Override
   protected avz l_() {
      return awa.Ez;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.EA;
   }

   @Nullable
   @Override
   public buq a(ard $$0, buq $$1) {
      return bvi.bO.a($$0, bvh.e);
   }

   @Override
   public bsy b(cpr $$0, bsx $$1) {
      return (bsy)(!this.gJ() ? bsy.e : super.b($$0, $$1));
   }

   @Override
   protected void gK() {
   }

   @Override
   public bvd e(bwk $$0) {
      return this.n_() ? bF : super.e($$0);
   }
}
