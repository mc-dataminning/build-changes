import javax.annotation.Nullable;

public class cjx extends cjv {
   public cjx(bvi<? extends cjx> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected avz u() {
      return awa.hA;
   }

   @Override
   protected avz gT() {
      return awa.hB;
   }

   @Override
   protected avz l_() {
      return awa.hD;
   }

   @Nullable
   @Override
   protected avz gu() {
      return awa.hE;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.hF;
   }

   @Override
   public boolean a(chp $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cjx) && !($$0 instanceof cjy) ? false : this.hb() && ((cjw)$$0).hb();
      }
   }

   @Override
   protected void ha() {
      this.a(awa.hG, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public buq a(ard $$0, buq $$1) {
      bvi<? extends cjw> $$2 = $$1 instanceof cjy ? bvi.aF : bvi.I;
      cjw $$3 = $$2.a($$0, bvh.e);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
