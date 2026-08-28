import javax.annotation.Nullable;

public class chj extends chh {
   public chj(bsz<? extends chj> $$0, dbx $$1) {
      super($$0, $$1);
   }

   @Override
   protected avy v() {
      return avz.hf;
   }

   @Override
   protected avy gO() {
      return avz.hg;
   }

   @Override
   protected avy o_() {
      return avz.hi;
   }

   @Nullable
   @Override
   protected avy gx() {
      return avz.hj;
   }

   @Override
   protected avy d(brm $$0) {
      return avz.hk;
   }

   @Override
   public boolean a(cfe $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof chj) && !($$0 instanceof chk) ? false : this.gX() && ((chi)$$0).gX();
      }
   }

   @Override
   protected void gW() {
      this.a(avz.hl, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bsn a(are $$0, bsn $$1) {
      bsz<? extends chi> $$2 = $$1 instanceof chk ? bsz.at : bsz.z;
      chi $$3 = $$2.a((dbx)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
