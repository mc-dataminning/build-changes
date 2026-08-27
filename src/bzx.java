import javax.annotation.Nullable;

public class bzx extends bzv {
   public bzx(bly<? extends bzx> $$0, cto $$1) {
      super($$0, $$1);
   }

   @Override
   protected arq y() {
      return arr.gC;
   }

   @Override
   protected arq gD() {
      return arr.gD;
   }

   @Override
   protected arq n_() {
      return arr.gF;
   }

   @Nullable
   @Override
   protected arq gl() {
      return arr.gG;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.gH;
   }

   @Override
   public boolean a(bxx $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof bzx) && !($$0 instanceof bzy) ? false : this.gM() && ((bzw)$$0).gM();
      }
   }

   @Nullable
   @Override
   public blp a(and $$0, blp $$1) {
      bly<? extends bzw> $$2 = $$1 instanceof bzy ? bly.aq : bly.x;
      bzw $$3 = $$2.a((cto)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
