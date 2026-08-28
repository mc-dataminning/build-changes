import javax.annotation.Nullable;

public class chl extends chj {
   public chl(btb<? extends chl> $$0, dbz $$1) {
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
   protected avz d(bro $$0) {
      return awa.hk;
   }

   @Override
   public boolean a(cfg $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof chl) && !($$0 instanceof chm) ? false : this.gX() && ((chk)$$0).gX();
      }
   }

   @Override
   protected void gW() {
      this.a(awa.hl, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bsp a(arf $$0, bsp $$1) {
      btb<? extends chk> $$2 = $$1 instanceof chm ? btb.at : btb.z;
      chk $$3 = $$2.a((dbz)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
