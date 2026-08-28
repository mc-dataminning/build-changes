import javax.annotation.Nullable;

public class cgt extends cgr {
   public cgt(bsj<? extends cgt> $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Override
   protected ave v() {
      return avf.hf;
   }

   @Override
   protected ave gL() {
      return avf.hg;
   }

   @Override
   protected ave o_() {
      return avf.hi;
   }

   @Nullable
   @Override
   protected ave gu() {
      return avf.hj;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.hk;
   }

   @Override
   public boolean a(ceo $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cgt) && !($$0 instanceof cgu) ? false : this.gU() && ((cgs)$$0).gU();
      }
   }

   @Override
   protected void gT() {
      this.a(avf.hl, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public brx a(aqk $$0, brx $$1) {
      bsj<? extends cgs> $$2 = $$1 instanceof cgu ? bsj.at : bsj.z;
      cgs $$3 = $$2.a((dcd)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
