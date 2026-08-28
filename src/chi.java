import javax.annotation.Nullable;

public class chi extends chg {
   public chi(bsy<? extends chi> $$0, dbw $$1) {
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
   protected avy d(brl $$0) {
      return avz.hk;
   }

   @Override
   public boolean a(cfd $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof chi) && !($$0 instanceof chj) ? false : this.gX() && ((chh)$$0).gX();
      }
   }

   @Override
   protected void gW() {
      this.a(avz.hl, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bsm a(are $$0, bsm $$1) {
      bsy<? extends chh> $$2 = $$1 instanceof chj ? bsy.at : bsy.z;
      chh $$3 = $$2.a((dbw)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
