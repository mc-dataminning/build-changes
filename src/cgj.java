import javax.annotation.Nullable;

public class cgj extends cgh {
   public cgj(bsa<? extends cgj> $$0, dax $$1) {
      super($$0, $$1);
   }

   @Override
   protected avg v() {
      return avh.hf;
   }

   @Override
   protected avg gN() {
      return avh.hg;
   }

   @Override
   protected avg o_() {
      return avh.hi;
   }

   @Nullable
   @Override
   protected avg gw() {
      return avh.hj;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.hk;
   }

   @Override
   public boolean a(cee $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cgj) && !($$0 instanceof cgk) ? false : this.gW() && ((cgi)$$0).gW();
      }
   }

   @Override
   protected void gV() {
      this.a(avh.hl, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bro a(aqm $$0, bro $$1) {
      bsa<? extends cgi> $$2 = $$1 instanceof cgk ? bsa.at : bsa.z;
      cgi $$3 = $$2.a((dax)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
