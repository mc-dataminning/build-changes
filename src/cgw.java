import javax.annotation.Nullable;

public class cgw extends cgu {
   public cgw(bsm<? extends cgw> $$0, dcf $$1) {
      super($$0, $$1);
   }

   @Override
   protected avg v() {
      return avh.hf;
   }

   @Override
   protected avg gM() {
      return avh.hg;
   }

   @Override
   protected avg o_() {
      return avh.hi;
   }

   @Nullable
   @Override
   protected avg gv() {
      return avh.hj;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.hk;
   }

   @Override
   public boolean a(cer $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cgw) && !($$0 instanceof cgx) ? false : this.gV() && ((cgv)$$0).gV();
      }
   }

   @Override
   protected void gU() {
      this.a(avh.hl, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bsa a(aqm $$0, bsa $$1) {
      bsm<? extends cgv> $$2 = $$1 instanceof cgx ? bsm.at : bsm.z;
      cgv $$3 = $$2.a((dcf)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
