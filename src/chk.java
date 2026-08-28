import javax.annotation.Nullable;

public class chk extends chi {
   public chk(bta<? extends chk> $$0, dby $$1) {
      super($$0, $$1);
   }

   @Override
   protected avz v() {
      return awa.hf;
   }

   @Override
   protected avz gO() {
      return awa.hg;
   }

   @Override
   protected avz o_() {
      return awa.hi;
   }

   @Nullable
   @Override
   protected avz gx() {
      return awa.hj;
   }

   @Override
   protected avz d(brn $$0) {
      return awa.hk;
   }

   @Override
   public boolean a(cff $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof chk) && !($$0 instanceof chl) ? false : this.gX() && ((chj)$$0).gX();
      }
   }

   @Override
   protected void gW() {
      this.a(awa.hl, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bso a(arf $$0, bso $$1) {
      bta<? extends chj> $$2 = $$1 instanceof chl ? bta.at : bta.z;
      chj $$3 = $$2.a((dby)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
