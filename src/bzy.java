import javax.annotation.Nullable;

public class bzy extends bzw {
   public bzy(blz<? extends bzy> $$0, ctp $$1) {
      super($$0, $$1);
   }

   @Override
   protected arr y() {
      return ars.gC;
   }

   @Override
   protected arr gD() {
      return ars.gD;
   }

   @Override
   protected arr n_() {
      return ars.gF;
   }

   @Nullable
   @Override
   protected arr gl() {
      return ars.gG;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.gH;
   }

   @Override
   public boolean a(bxy $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof bzy) && !($$0 instanceof bzz) ? false : this.gM() && ((bzx)$$0).gM();
      }
   }

   @Nullable
   @Override
   public blq a(and $$0, blq $$1) {
      blz<? extends bzx> $$2 = $$1 instanceof bzz ? blz.aq : blz.x;
      bzx $$3 = $$2.a((ctp)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
