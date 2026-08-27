import javax.annotation.Nullable;

public class cdg extends cde {
   public cdg(bpc<? extends cdg> $$0, cwz $$1) {
      super($$0, $$1);
   }

   @Override
   protected atx v() {
      return aty.gV;
   }

   @Override
   protected atx gL() {
      return aty.gW;
   }

   @Override
   protected atx n_() {
      return aty.gY;
   }

   @Nullable
   @Override
   protected atx gu() {
      return aty.gZ;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.ha;
   }

   @Override
   public boolean a(cbd $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cdg) && !($$0 instanceof cdh) ? false : this.gU() && ((cdf)$$0).gU();
      }
   }

   @Nullable
   @Override
   public bor a(apf $$0, bor $$1) {
      bpc<? extends cdf> $$2 = $$1 instanceof cdh ? bpc.as : bpc.z;
      cdf $$3 = $$2.a((cwz)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
