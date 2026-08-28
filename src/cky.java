import javax.annotation.Nullable;

public class cky extends ckw {
   public cky(bwj<? extends cky> $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   protected awk u() {
      return awl.hA;
   }

   @Override
   protected awk gQ() {
      return awl.hB;
   }

   @Override
   protected awk l_() {
      return awl.hD;
   }

   @Nullable
   @Override
   protected awk gs() {
      return awl.hE;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.hF;
   }

   @Override
   public boolean a(cio $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cky) && !($$0 instanceof ckz) ? false : this.gY() && ((ckx)$$0).gY();
      }
   }

   @Override
   protected void gX() {
      this.a(awl.hG, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bvq a(aro $$0, bvq $$1) {
      bwj<? extends ckx> $$2 = $$1 instanceof ckz ? bwj.aF : bwj.I;
      ckx $$3 = $$2.a($$0, bwi.e);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
