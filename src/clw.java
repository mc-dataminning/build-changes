import javax.annotation.Nullable;

public class clw extends clu {
   public clw(bxe<? extends clw> $$0, djz $$1) {
      super($$0, $$1);
   }

   @Override
   protected awq u() {
      return awr.hD;
   }

   @Override
   protected awq gU() {
      return awr.hE;
   }

   @Override
   protected awq l_() {
      return awr.hG;
   }

   @Nullable
   @Override
   protected awq gw() {
      return awr.hH;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.hI;
   }

   @Override
   public boolean a(cjm $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof clw) && !($$0 instanceof clx) ? false : this.hc() && ((clv)$$0).hc();
      }
   }

   @Override
   protected void hb() {
      this.a(awr.hJ, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bwl a(aru $$0, bwl $$1) {
      bxe<? extends clv> $$2 = $$1 instanceof clx ? bxe.aG : bxe.J;
      clv $$3 = $$2.a($$0, bxd.e);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
