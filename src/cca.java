import javax.annotation.Nullable;

public class cca extends cby {
   public cca(bnw<? extends cca> $$0, cvr $$1) {
      super($$0, $$1);
   }

   @Override
   protected atk y() {
      return atl.gS;
   }

   @Override
   protected atk gF() {
      return atl.gT;
   }

   @Override
   protected atk n_() {
      return atl.gV;
   }

   @Nullable
   @Override
   protected atk gn() {
      return atl.gW;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.gX;
   }

   @Override
   public boolean a(bzx $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cca) && !($$0 instanceof ccb) ? false : this.gO() && ((cbz)$$0).gO();
      }
   }

   @Nullable
   @Override
   public bnl a(aow $$0, bnl $$1) {
      bnw<? extends cbz> $$2 = $$1 instanceof ccb ? bnw.ar : bnw.y;
      cbz $$3 = $$2.a((cvr)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
