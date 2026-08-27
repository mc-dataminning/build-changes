import javax.annotation.Nullable;

public class bwt extends bwr {
   public bwt(biw<? extends bwt> $$0, cpx $$1) {
      super($$0, $$1);
   }

   @Override
   protected ape w() {
      return apf.fZ;
   }

   @Override
   protected ape gC() {
      return apf.ga;
   }

   @Override
   protected ape l_() {
      return apf.gc;
   }

   @Nullable
   @Override
   protected ape gk() {
      return apf.gd;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.ge;
   }

   @Override
   public boolean a(but $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof bwt) && !($$0 instanceof bwu) ? false : this.gL() && ((bws)$$0).gL();
      }
   }

   @Nullable
   @Override
   public bin a(aks $$0, bin $$1) {
      biw<? extends bws> $$2 = $$1 instanceof bwu ? biw.ap : biw.w;
      bws $$3 = $$2.a((cpx)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
