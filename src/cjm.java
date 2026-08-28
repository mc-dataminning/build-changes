import javax.annotation.Nullable;

public class cjm extends cjc {
   private static final buo bY = bus.bO.n().a(bun.a().a(bum.a, 0.0F, bus.bO.m() - 0.03125F, 0.0F)).a(0.5F);

   public cjm(bus<? extends cjm> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public static bwo.a p() {
      return gU().a(bwp.s, 15.0).a(bwp.v, 0.2F);
   }

   public static boolean c(bus<? extends cgy> $$0, dgj $$1, bur $$2, ji $$3, azh $$4) {
      return !bur.a($$2) ? cgy.b($$0, $$1, $$2, $$3, $$4) : bur.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azh $$0) {
      this.g(bwp.o).a(a($$0::j));
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
   protected avz e(btb $$0) {
      return awa.Eq;
   }

   @Nullable
   @Override
   public buc a(ard $$0, buc $$1) {
      return bus.bO.a($$0, bur.e);
   }

   @Override
   public bsk b(cox $$0, bsj $$1) {
      return (bsk)(!this.gJ() ? bsk.e : super.b($$0, $$1));
   }

   @Override
   protected void gK() {
   }

   @Override
   public buo e(bvt $$0) {
      return this.e_() ? bY : super.e($$0);
   }
}
