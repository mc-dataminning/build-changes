import javax.annotation.Nullable;

public class cii extends cig {
   public cii(bty<? extends cii> $$0, dej $$1) {
      super($$0, $$1);
   }

   @Override
   protected awf w() {
      return awg.hg;
   }

   @Override
   protected awf gP() {
      return awg.hh;
   }

   @Override
   protected awf o_() {
      return awg.hj;
   }

   @Nullable
   @Override
   protected awf gq() {
      return awg.hk;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.hl;
   }

   @Override
   public boolean a(cgd $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cii) && !($$0 instanceof cij) ? false : this.gY() && ((cih)$$0).gY();
      }
   }

   @Override
   protected void gX() {
      this.a(awg.hm, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public btk a(arj $$0, btk $$1) {
      bty<? extends cih> $$2 = $$1 instanceof cij ? bty.at : bty.z;
      cih $$3 = $$2.a($$0, btx.e);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
