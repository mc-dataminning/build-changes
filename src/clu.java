import javax.annotation.Nullable;

public class clu extends cls {
   public clu(bxc<? extends clu> $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   protected awo u() {
      return awp.hD;
   }

   @Override
   protected awo gU() {
      return awp.hE;
   }

   @Override
   protected awo l_() {
      return awp.hG;
   }

   @Nullable
   @Override
   protected awo gw() {
      return awp.hH;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.hI;
   }

   @Override
   public boolean a(cjk $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof clu) && !($$0 instanceof clv) ? false : this.hc() && ((clt)$$0).hc();
      }
   }

   @Override
   protected void hb() {
      this.a(awp.hJ, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bwj a(ars $$0, bwj $$1) {
      bxc<? extends clt> $$2 = $$1 instanceof clv ? bxc.aG : bxc.J;
      clt $$3 = $$2.a($$0, bxb.e);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
