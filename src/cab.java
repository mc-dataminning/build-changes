import javax.annotation.Nullable;

public class cab extends bzr {
   public cab(blt<? extends cab> $$0, cti $$1) {
      super($$0, $$1);
   }

   public static bnk.a u() {
      return gE().a(bnl.l, 15.0).a(bnl.m, 0.2F);
   }

   public static boolean c(blt<? extends bxs> $$0, ctj $$1, bmj $$2, hx $$3, aup $$4) {
      return !bmj.a($$2) ? bxs.b($$0, $$1, $$2, $$3, $$4) : bmj.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(aup $$0) {
      this.a(bnl.h).a(a($$0::j));
   }

   @Override
   public bmk eS() {
      return bmk.b;
   }

   @Override
   protected arl y() {
      return arm.Cj;
   }

   @Override
   protected arl n_() {
      return arm.Ck;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.Cl;
   }

   @Nullable
   @Override
   public blk a(amz $$0, blk $$1) {
      return blt.bs.a((cti)$$0);
   }

   @Override
   public bjv b(cfb $$0, bju $$1) {
      return !this.gt() ? bjv.d : super.b($$0, $$1);
   }

   @Override
   protected void gu() {
   }

   @Override
   protected float a(blq $$0, float $$1) {
      return $$0.b - (this.o_() ? 0.03125F : 0.28125F) * $$1;
   }
}
