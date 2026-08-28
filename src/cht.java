import javax.annotation.Nullable;

public class cht extends chj {
   private static final bsx bY = bta.bv.n().a(bsw.a().a(bsv.a, 0.0F, bta.bv.m() - 0.03125F, 0.0F)).a(0.5F);

   public cht(bta<? extends cht> $$0, dby $$1) {
      super($$0, $$1);
   }

   public static buw.a s() {
      return gP().a(bux.q, 15.0).a(bux.r, 0.2F);
   }

   public static boolean c(bta<? extends cff> $$0, dbz $$1, btt $$2, iz $$3, azh $$4) {
      return !btt.a($$2) ? cff.b($$0, $$1, $$2, $$3, $$4) : btt.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azh $$0) {
      this.f(bux.m).a(a($$0::j));
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
   protected avz d(brn $$0) {
      return awa.Dy;
   }

   @Nullable
   @Override
   public bso a(arf $$0, bso $$1) {
      return bta.bv.a((dby)$$0);
   }

   @Override
   public bqu b(cmx $$0, bqt $$1) {
      return !this.gF() ? bqu.e : super.b($$0, $$1);
   }

   @Override
   protected void gG() {
   }

   @Override
   public bsx e(bub $$0) {
      return this.p_() ? bY : super.e($$0);
   }
}
