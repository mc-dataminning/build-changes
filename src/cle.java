import javax.annotation.Nullable;

public class cle extends clc {
   public cle(bwm<? extends cle> $$0, div $$1) {
      super($$0, $$1);
   }

   @Override
   protected awm u() {
      return awn.hB;
   }

   @Override
   protected awm gQ() {
      return awn.hC;
   }

   @Override
   protected awm l_() {
      return awn.hE;
   }

   @Nullable
   @Override
   protected awm gs() {
      return awn.hF;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.hG;
   }

   @Override
   public boolean a(cis $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cle) && !($$0 instanceof clf) ? false : this.gY() && ((cld)$$0).gY();
      }
   }

   @Override
   protected void gX() {
      this.a(awn.hH, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bvt a(arq $$0, bvt $$1) {
      bwm<? extends cld> $$2 = $$1 instanceof clf ? bwm.aF : bwm.I;
      cld $$3 = $$2.a($$0, bwl.e);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
