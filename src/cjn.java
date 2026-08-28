import javax.annotation.Nullable;

public class cjn extends cjd {
   private static final bup bY = but.bO.n().a(buo.a().a(bun.a, 0.0F, but.bO.m() - 0.03125F, 0.0F)).a(0.5F);

   public cjn(but<? extends cjn> $$0, dgj $$1) {
      super($$0, $$1);
   }

   public static bwp.a p() {
      return gU().a(bwq.s, 15.0).a(bwq.v, 0.2F);
   }

   public static boolean c(but<? extends cgz> $$0, dgk $$1, bus $$2, ji $$3, azh $$4) {
      return !bus.a($$2) ? cgz.b($$0, $$1, $$2, $$3, $$4) : bus.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azh $$0) {
      this.g(bwq.o).a(a($$0::j));
   }

   @Override
   protected avz u() {
      return awa.Eo;
   }

   @Override
   protected avz o_() {
      return awa.Ep;
   }

   @Override
   protected avz e(btc $$0) {
      return awa.Eq;
   }

   @Nullable
   @Override
   public bud a(ard $$0, bud $$1) {
      return but.bO.a($$0, bus.e);
   }

   @Override
   public bsl b(coy $$0, bsk $$1) {
      return (bsl)(!this.gJ() ? bsl.e : super.b($$0, $$1));
   }

   @Override
   protected void gK() {
   }

   @Override
   public bup e(bvu $$0) {
      return this.e_() ? bY : super.e($$0);
   }
}
