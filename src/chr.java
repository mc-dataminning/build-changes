import javax.annotation.Nullable;

public class chr extends chh {
   private static final bsv bY = bsy.bv.n().a(bsu.a().a(bst.a, 0.0F, bsy.bv.m() - 0.03125F, 0.0F)).a(0.5F);

   public chr(bsy<? extends chr> $$0, dbw $$1) {
      super($$0, $$1);
   }

   public static buu.a s() {
      return gP().a(buv.q, 15.0).a(buv.r, 0.2F);
   }

   public static boolean c(bsy<? extends cfd> $$0, dbx $$1, btr $$2, iz $$3, azf $$4) {
      return !btr.a($$2) ? cfd.b($$0, $$1, $$2, $$3, $$4) : btr.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azf $$0) {
      this.f(buv.m).a(a($$0::j));
   }

   @Override
   protected avy v() {
      return avz.Dw;
   }

   @Override
   protected avy o_() {
      return avz.Dx;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.Dy;
   }

   @Nullable
   @Override
   public bsm a(are $$0, bsm $$1) {
      return bsy.bv.a((dbw)$$0);
   }

   @Override
   public bqs b(cmv $$0, bqr $$1) {
      return !this.gF() ? bqs.e : super.b($$0, $$1);
   }

   @Override
   protected void gG() {
   }

   @Override
   public bsv e(btz $$0) {
      return this.p_() ? bY : super.e($$0);
   }
}
