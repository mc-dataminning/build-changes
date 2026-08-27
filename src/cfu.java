import javax.annotation.Nullable;

public class cfu extends cfs {
   public cfu(brn<? extends cfu> $$0, dad $$1) {
      super($$0, $$1);
   }

   @Override
   protected avb v() {
      return avc.ha;
   }

   @Override
   protected avb gN() {
      return avc.hb;
   }

   @Override
   protected avb o_() {
      return avc.hd;
   }

   @Nullable
   @Override
   protected avb gw() {
      return avc.he;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.hf;
   }

   @Override
   public boolean a(cdp $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cfu) && !($$0 instanceof cfv) ? false : this.gW() && ((cft)$$0).gW();
      }
   }

   @Override
   protected void gV() {
      this.a(avc.hg, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public brb a(aqh $$0, brb $$1) {
      brn<? extends cft> $$2 = $$1 instanceof cfv ? brn.as : brn.z;
      cft $$3 = $$2.a((dad)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
