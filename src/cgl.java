import javax.annotation.Nullable;

public class cgl extends cgj {
   public cgl(bsc<? extends cgl> $$0, daz $$1) {
      super($$0, $$1);
   }

   @Override
   protected avh v() {
      return avi.hf;
   }

   @Override
   protected avh gN() {
      return avi.hg;
   }

   @Override
   protected avh o_() {
      return avi.hi;
   }

   @Nullable
   @Override
   protected avh gw() {
      return avi.hj;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.hk;
   }

   @Override
   public boolean a(ceg $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cgl) && !($$0 instanceof cgm) ? false : this.gW() && ((cgk)$$0).gW();
      }
   }

   @Override
   protected void gV() {
      this.a(avi.hl, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public brq a(aqn $$0, brq $$1) {
      bsc<? extends cgk> $$2 = $$1 instanceof cgm ? bsc.at : bsc.z;
      cgk $$3 = $$2.a((daz)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
