import javax.annotation.Nullable;

public class cir extends cip {
   public cir(bug<? extends cir> $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   protected awj w() {
      return awk.hg;
   }

   @Override
   protected awj gW() {
      return awk.hh;
   }

   @Override
   protected awj o_() {
      return awk.hj;
   }

   @Nullable
   @Override
   protected awj gx() {
      return awk.hk;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.hl;
   }

   @Override
   public boolean a(cgm $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cir) && !($$0 instanceof cis) ? false : this.hf() && ((ciq)$$0).hf();
      }
   }

   @Override
   protected void he() {
      this.a(awk.hm, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public btq a(arm $$0, btq $$1) {
      bug<? extends ciq> $$2 = $$1 instanceof cis ? bug.at : bug.z;
      ciq $$3 = $$2.a($$0, buf.e);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
