import javax.annotation.Nullable;

public class chh extends chf {
   public chh(bsw<? extends chh> $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   protected avn v() {
      return avo.hf;
   }

   @Override
   protected avn gK() {
      return avo.hg;
   }

   @Override
   protected avn n_() {
      return avo.hi;
   }

   @Nullable
   @Override
   protected avn go() {
      return avo.hj;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.hk;
   }

   @Override
   public boolean a(cfc $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof chh) && !($$0 instanceof chi) ? false : this.gT() && ((chg)$$0).gT();
      }
   }

   @Override
   protected void gS() {
      this.a(avo.hl, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bsk a(aqt $$0, bsk $$1) {
      bsw<? extends chg> $$2 = $$1 instanceof chi ? bsw.at : bsw.z;
      chg $$3 = $$2.a((dcu)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
