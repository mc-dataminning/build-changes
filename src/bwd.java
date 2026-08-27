public class bwd extends bwc {
   private final chi h;

   public bwd(chi $$0) {
      super($$0, cia.class, 8.0F);
      this.h = $$0;
   }

   @Override
   public boolean a() {
      if (this.h.gm()) {
         this.c = this.h.gl();
         return true;
      } else {
         return false;
      }
   }
}
