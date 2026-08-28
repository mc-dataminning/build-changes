import javax.annotation.Nullable;

public class cgx extends cgv {
   public cgx(bsn<? extends cgx> $$0, dcg $$1) {
      super($$0, $$1);
   }

   @Override
   protected avg v() {
      return avh.hf;
   }

   @Override
   protected avg gL() {
      return avh.hg;
   }

   @Override
   protected avg n_() {
      return avh.hi;
   }

   @Nullable
   @Override
   protected avg gu() {
      return avh.hj;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.hk;
   }

   @Override
   public boolean a(ces $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cgx) && !($$0 instanceof cgy) ? false : this.gU() && ((cgw)$$0).gU();
      }
   }

   @Override
   protected void gT() {
      this.a(avh.hl, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bsb a(aqm $$0, bsb $$1) {
      bsn<? extends cgw> $$2 = $$1 instanceof cgy ? bsn.at : bsn.z;
      cgw $$3 = $$2.a((dcg)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
