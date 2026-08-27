import javax.annotation.Nullable;

public class bzs extends bzq {
   public bzs(blt<? extends bzs> $$0, cti $$1) {
      super($$0, $$1);
   }

   @Override
   protected arl y() {
      return arm.gC;
   }

   @Override
   protected arl gD() {
      return arm.gD;
   }

   @Override
   protected arl n_() {
      return arm.gF;
   }

   @Nullable
   @Override
   protected arl gl() {
      return arm.gG;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.gH;
   }

   @Override
   public boolean a(bxs $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof bzs) && !($$0 instanceof bzt) ? false : this.gM() && ((bzr)$$0).gM();
      }
   }

   @Nullable
   @Override
   public blk a(amz $$0, blk $$1) {
      blt<? extends bzr> $$2 = $$1 instanceof bzt ? blt.aq : blt.x;
      bzr $$3 = $$2.a((cti)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
