import javax.annotation.Nullable;

public class chm extends chk {
   public chm(btc<? extends chm> $$0, dca $$1) {
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
   protected avz d(brp $$0) {
      return awa.hk;
   }

   @Override
   public boolean a(cfh $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof chm) && !($$0 instanceof chn) ? false : this.gX() && ((chl)$$0).gX();
      }
   }

   @Override
   protected void gW() {
      this.a(awa.hl, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bsq a(arf $$0, bsq $$1) {
      btc<? extends chl> $$2 = $$1 instanceof chn ? btc.at : btc.z;
      chl $$3 = $$2.a((dca)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
