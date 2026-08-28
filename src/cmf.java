import javax.annotation.Nullable;

public class cmf extends cmd {
   public cmf(bxn<? extends cmf> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   protected awx u() {
      return awy.hD;
   }

   @Override
   protected awx gU() {
      return awy.hE;
   }

   @Override
   protected awx l_() {
      return awy.hG;
   }

   @Nullable
   @Override
   protected awx gw() {
      return awy.hH;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.hI;
   }

   @Override
   public boolean a(cjv $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cmf) && !($$0 instanceof cmg) ? false : this.hc() && ((cme)$$0).hc();
      }
   }

   @Override
   protected void hb() {
      this.a(awy.hJ, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bwu a(asb $$0, bwu $$1) {
      bxn<? extends cme> $$2 = $$1 instanceof cmg ? bxn.aG : bxn.J;
      cme $$3 = $$2.a($$0, bxm.e);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
