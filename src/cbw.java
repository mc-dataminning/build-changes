import javax.annotation.Nullable;

public class cbw extends cbu {
   public cbw(bnu<? extends cbw> $$0, cvn $$1) {
      super($$0, $$1);
   }

   @Override
   protected atj y() {
      return atk.gR;
   }

   @Override
   protected atj gF() {
      return atk.gS;
   }

   @Override
   protected atj n_() {
      return atk.gU;
   }

   @Nullable
   @Override
   protected atj gn() {
      return atk.gV;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.gW;
   }

   @Override
   public boolean a(bzt $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cbw) && !($$0 instanceof cbx) ? false : this.gO() && ((cbv)$$0).gO();
      }
   }

   @Nullable
   @Override
   public bnj a(aov $$0, bnj $$1) {
      bnu<? extends cbv> $$2 = $$1 instanceof cbx ? bnu.ar : bnu.y;
      cbv $$3 = $$2.a((cvn)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
