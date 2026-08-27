import javax.annotation.Nullable;

public class bwm extends bwk {
   public bwm(bip<? extends bwm> $$0, cpq $$1) {
      super($$0, $$1);
   }

   @Override
   protected aoy r() {
      return aoz.fZ;
   }

   @Override
   protected aoy gz() {
      return aoz.ga;
   }

   @Override
   protected aoy h_() {
      return aoz.gc;
   }

   @Nullable
   @Override
   protected aoy gh() {
      return aoz.gd;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.ge;
   }

   @Override
   public boolean a(bum $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof bwm) && !($$0 instanceof bwn) ? false : this.gI() && ((bwl)$$0).gI();
      }
   }

   @Nullable
   @Override
   public big a(akn $$0, big $$1) {
      bip<? extends bwl> $$2 = $$1 instanceof bwn ? bip.ap : bip.w;
      bwl $$3 = $$2.a((cpq)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
