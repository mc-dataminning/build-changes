import javax.annotation.Nullable;

public class cjx extends cjv {
   public cjx(bvm<? extends cjx> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   protected axe u() {
      return axf.hy;
   }

   @Override
   protected axe gN() {
      return axf.hz;
   }

   @Override
   protected axe o_() {
      return axf.hB;
   }

   @Nullable
   @Override
   protected axe go() {
      return axf.hC;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.hD;
   }

   @Override
   public boolean a(chs $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cjx) && !($$0 instanceof cjy) ? false : this.gV() && ((cjw)$$0).gV();
      }
   }

   @Override
   protected void gU() {
      this.a(axf.hE, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public buw a(ash $$0, buw $$1) {
      bvm<? extends cjw> $$2 = $$1 instanceof cjy ? bvm.aG : bvm.J;
      cjw $$3 = $$2.a($$0, bvl.e);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
