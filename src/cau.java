public class cau extends cat {
   private final cmd h;

   public cau(cmd $$0) {
      super($$0, cmv.class, 8.0F);
      this.h = $$0;
   }

   @Override
   public boolean a() {
      if (this.h.gr()) {
         this.c = this.h.gq();
         return true;
      } else {
         return false;
      }
   }
}
