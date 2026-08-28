public class ccn extends ccm {
   private final coc h;

   public ccn(coc $$0) {
      super($$0, cow.class, 8.0F);
      this.h = $$0;
   }

   @Override
   public boolean b() {
      if (this.h.gt()) {
         this.c = this.h.gs();
         return true;
      } else {
         return false;
      }
   }
}
