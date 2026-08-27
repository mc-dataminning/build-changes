public class bta extends bsz {
   private final cdz h;

   public bta(cdz $$0) {
      super($$0, cer.class, 8.0F);
      this.h = $$0;
   }

   @Override
   public boolean a() {
      if (this.h.gf()) {
         this.c = this.h.ge();
         return true;
      } else {
         return false;
      }
   }
}
