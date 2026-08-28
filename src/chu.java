import javax.annotation.Nullable;

public class chu extends chk {
   private static final bsy bY = btb.bv.n().a(bsx.a().a(bsw.a, 0.0F, btb.bv.m() - 0.03125F, 0.0F)).a(0.5F);

   public chu(btb<? extends chu> $$0, dbz $$1) {
      super($$0, $$1);
   }

   public static bux.a s() {
      return gP().a(buy.q, 15.0).a(buy.r, 0.2F);
   }

   public static boolean c(btb<? extends cfg> $$0, dca $$1, btu $$2, iz $$3, azh $$4) {
      return !btu.a($$2) ? cfg.b($$0, $$1, $$2, $$3, $$4) : btu.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azh $$0) {
      this.f(buy.m).a(a($$0::j));
   }

   @Override
   protected avz v() {
      return awa.Dw;
   }

   @Override
   protected avz o_() {
      return awa.Dx;
   }

   @Override
   protected avz d(bro $$0) {
      return awa.Dy;
   }

   @Nullable
   @Override
   public bsp a(arf $$0, bsp $$1) {
      return btb.bv.a((dbz)$$0);
   }

   @Override
   public bqv b(cmy $$0, bqu $$1) {
      return !this.gF() ? bqv.e : super.b($$0, $$1);
   }

   @Override
   protected void gG() {
   }

   @Override
   public bsy e(buc $$0) {
      return this.p_() ? bY : super.e($$0);
   }
}
