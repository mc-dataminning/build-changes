import javax.annotation.Nullable;

public class cif extends cid {
   public cif(btv<? extends cif> $$0, deg $$1) {
      super($$0, $$1);
   }

   @Override
   protected awd w() {
      return awe.hg;
   }

   @Override
   protected awd gQ() {
      return awe.hh;
   }

   @Override
   protected awd n_() {
      return awe.hj;
   }

   @Nullable
   @Override
   protected awd gr() {
      return awe.hk;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.hl;
   }

   @Override
   public boolean a(cga $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cif) && !($$0 instanceof cig) ? false : this.gZ() && ((cie)$$0).gZ();
      }
   }

   @Override
   protected void gY() {
      this.a(awe.hm, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bth a(arh $$0, bth $$1) {
      btv<? extends cie> $$2 = $$1 instanceof cig ? btv.at : btv.z;
      cie $$3 = $$2.a($$0, btu.e);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
