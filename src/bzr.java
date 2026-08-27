import javax.annotation.Nullable;

public class bzr extends bzh {
   public bzr(blj<? extends bzr> $$0, csy $$1) {
      super($$0, $$1);
   }

   public static bna.a u() {
      return gE().a(bnb.l, 15.0).a(bnb.m, 0.2F);
   }

   public static boolean c(blj<? extends bxi> $$0, csz $$1, blz $$2, hv $$3, auf $$4) {
      return !blz.a($$2) ? bxi.b($$0, $$1, $$2, $$3, $$4) : blz.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(auf $$0) {
      this.a(bnb.h).a(a($$0::j));
   }

   @Override
   public bma eS() {
      return bma.b;
   }

   @Override
   protected arb y() {
      return arc.Cj;
   }

   @Override
   protected arb n_() {
      return arc.Ck;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.Cl;
   }

   @Nullable
   @Override
   public bla a(amp $$0, bla $$1) {
      return blj.bs.a((csy)$$0);
   }

   @Override
   public bjl b(cer $$0, bjk $$1) {
      return !this.gt() ? bjl.d : super.b($$0, $$1);
   }

   @Override
   protected void gu() {
   }

   @Override
   protected float a(blg $$0, float $$1) {
      return $$0.b - (this.o_() ? 0.03125F : 0.28125F) * $$1;
   }
}
