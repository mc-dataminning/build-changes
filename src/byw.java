import javax.annotation.Nullable;

public class byw extends byu {
   public byw(bkz<? extends byw> $$0, csf $$1) {
      super($$0, $$1);
   }

   @Override
   protected aqu y() {
      return aqv.gt;
   }

   @Override
   protected aqu gE() {
      return aqv.gu;
   }

   @Override
   protected aqu n_() {
      return aqv.gw;
   }

   @Nullable
   @Override
   protected aqu gm() {
      return aqv.gx;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.gy;
   }

   @Override
   public boolean a(bww $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof byw) && !($$0 instanceof byx) ? false : this.gN() && ((byv)$$0).gN();
      }
   }

   @Nullable
   @Override
   public bkq a(ami $$0, bkq $$1) {
      bkz<? extends byv> $$2 = $$1 instanceof byx ? bkz.ap : bkz.w;
      byv $$3 = $$2.a((csf)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
