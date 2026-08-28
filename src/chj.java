import javax.annotation.Nullable;

public class chj extends chh {
   public chj(bsx<? extends chj> $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   protected avo v() {
      return avp.hf;
   }

   @Override
   protected avo gK() {
      return avp.hg;
   }

   @Override
   protected avo n_() {
      return avp.hi;
   }

   @Nullable
   @Override
   protected avo gn() {
      return avp.hj;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.hk;
   }

   @Override
   public boolean a(cfe $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof chj) && !($$0 instanceof chk) ? false : this.gT() && ((chi)$$0).gT();
      }
   }

   @Override
   protected void gS() {
      this.a(avp.hl, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bsl a(aqu $$0, bsl $$1) {
      bsx<? extends chi> $$2 = $$1 instanceof chk ? bsx.at : bsx.z;
      chi $$3 = $$2.a((dcw)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
