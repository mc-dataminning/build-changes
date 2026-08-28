import javax.annotation.Nullable;

public class ckb extends cjz {
   public ckb(bvq<? extends ckb> $$0, dhh $$1) {
      super($$0, $$1);
   }

   @Override
   protected axe u() {
      return axf.hz;
   }

   @Override
   protected axe gP() {
      return axf.hA;
   }

   @Override
   protected axe o_() {
      return axf.hC;
   }

   @Nullable
   @Override
   protected axe gq() {
      return axf.hD;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.hE;
   }

   @Override
   public boolean a(chw $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof ckb) && !($$0 instanceof ckc) ? false : this.gX() && ((cka)$$0).gX();
      }
   }

   @Override
   protected void gW() {
      this.a(axf.hF, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bva a(ash $$0, bva $$1) {
      bvq<? extends cka> $$2 = $$1 instanceof ckc ? bvq.aG : bvq.J;
      cka $$3 = $$2.a($$0, bvp.e);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
