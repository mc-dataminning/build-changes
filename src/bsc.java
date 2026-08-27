public class bsc extends bsb {
   private final ccu h;

   public bsc(ccu $$0) {
      super($$0, cdm.class, 8.0F);
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
