import javax.annotation.Nullable;

public class cdh extends cdf {
   public cdh(bpd<? extends cdh> $$0, cxb $$1) {
      super($$0, $$1);
   }

   @Override
   protected atx v() {
      return aty.gZ;
   }

   @Override
   protected atx gL() {
      return aty.ha;
   }

   @Override
   protected atx n_() {
      return aty.hc;
   }

   @Nullable
   @Override
   protected atx gu() {
      return aty.hd;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.he;
   }

   @Override
   public boolean a(cbe $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cdh) && !($$0 instanceof cdi) ? false : this.gU() && ((cdg)$$0).gU();
      }
   }

   @Nullable
   @Override
   public bos a(apf $$0, bos $$1) {
      bpd<? extends cdg> $$2 = $$1 instanceof cdi ? bpd.at : bpd.A;
      cdg $$3 = $$2.a((cxb)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
