import javax.annotation.Nullable;

public class bwj extends bwh {
   public bwj(bim<? extends bwj> $$0, cpl $$1) {
      super($$0, $$1);
   }

   @Override
   protected aov r() {
      return aow.fZ;
   }

   @Override
   protected aov gz() {
      return aow.ga;
   }

   @Override
   protected aov h_() {
      return aow.gc;
   }

   @Nullable
   @Override
   protected aov gh() {
      return aow.gd;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.ge;
   }

   @Override
   public boolean a(buj $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof bwj) && !($$0 instanceof bwk) ? false : this.gI() && ((bwi)$$0).gI();
      }
   }

   @Nullable
   @Override
   public bid a(akk $$0, bid $$1) {
      bim<? extends bwi> $$2 = $$1 instanceof bwk ? bim.ap : bim.w;
      bwi $$3 = $$2.a((cpl)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
