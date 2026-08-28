import javax.annotation.Nullable;

public class cli extends clg {
   public cli(bwo<? extends cli> $$0, dja $$1) {
      super($$0, $$1);
   }

   @Override
   protected awm u() {
      return awn.hD;
   }

   @Override
   protected awm gR() {
      return awn.hE;
   }

   @Override
   protected awm l_() {
      return awn.hG;
   }

   @Nullable
   @Override
   protected awm gt() {
      return awn.hH;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.hI;
   }

   @Override
   public boolean a(ciu $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cli) && !($$0 instanceof clj) ? false : this.gZ() && ((clh)$$0).gZ();
      }
   }

   @Override
   protected void gY() {
      this.a(awn.hJ, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bvv a(arq $$0, bvv $$1) {
      bwo<? extends clh> $$2 = $$1 instanceof clj ? bwo.aF : bwo.I;
      clh $$3 = $$2.a($$0, bwn.e);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
