import javax.annotation.Nullable;

public class bwk extends bwi {
   public bwk(bim<? extends bwk> $$0, cpm $$1) {
      super($$0, $$1);
   }

   @Override
   protected aov r() {
      return aow.fZ;
   }

   @Override
   protected aov gy() {
      return aow.ga;
   }

   @Override
   protected aov h_() {
      return aow.gc;
   }

   @Nullable
   @Override
   protected aov gg() {
      return aow.gd;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.ge;
   }

   @Override
   public boolean a(buk $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof bwk) && !($$0 instanceof bwl) ? false : this.gH() && ((bwj)$$0).gH();
      }
   }

   @Nullable
   @Override
   public bid a(akk $$0, bid $$1) {
      bim<? extends bwj> $$2 = $$1 instanceof bwl ? bim.ap : bim.w;
      bwj $$3 = $$2.a((cpm)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
