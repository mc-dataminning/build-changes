import javax.annotation.Nullable;

public class cgj extends cgh {
   public cgj(bsb<? extends cgj> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected avn u() {
      return avo.hf;
   }

   @Override
   protected avn gW() {
      return avo.hg;
   }

   @Override
   protected avn n_() {
      return avo.hi;
   }

   @Nullable
   @Override
   protected avn gF() {
      return avo.hj;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.hk;
   }

   @Override
   public boolean a(cee $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cgj) && !($$0 instanceof cgk) ? false : this.hf() && ((cgi)$$0).hf();
      }
   }

   @Override
   protected void he() {
      this.a(avo.hl, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public brp a(aqt $$0, brp $$1) {
      bsb<? extends cgi> $$2 = $$1 instanceof cgk ? bsb.au : bsb.B;
      cgi $$3 = $$2.a((dca)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
