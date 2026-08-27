import javax.annotation.Nullable;

public class bwx extends bwv {
   public bwx(bja<? extends bwx> $$0, cqb $$1) {
      super($$0, $$1);
   }

   @Override
   protected apf w() {
      return apg.fZ;
   }

   @Override
   protected apf gD() {
      return apg.ga;
   }

   @Override
   protected apf l_() {
      return apg.gc;
   }

   @Nullable
   @Override
   protected apf gl() {
      return apg.gd;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.ge;
   }

   @Override
   public boolean a(bux $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof bwx) && !($$0 instanceof bwy) ? false : this.gM() && ((bww)$$0).gM();
      }
   }

   @Nullable
   @Override
   public bir a(akt $$0, bir $$1) {
      bja<? extends bww> $$2 = $$1 instanceof bwy ? bja.ap : bja.w;
      bww $$3 = $$2.a((cqb)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
