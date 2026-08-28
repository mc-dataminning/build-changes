import javax.annotation.Nullable;

public class ckc extends cka {
   public ckc(bvr<? extends ckc> $$0, dhi $$1) {
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
   protected axe e(bua $$0) {
      return axf.hE;
   }

   @Override
   public boolean a(chx $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof ckc) && !($$0 instanceof ckd) ? false : this.gX() && ((ckb)$$0).gX();
      }
   }

   @Override
   protected void gW() {
      this.a(axf.hF, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bvb a(ash $$0, bvb $$1) {
      bvr<? extends ckb> $$2 = $$1 instanceof ckd ? bvr.aG : bvr.J;
      ckb $$3 = $$2.a($$0, bvq.e);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
