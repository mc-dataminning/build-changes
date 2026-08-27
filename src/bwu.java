public class bwu extends bwt {
   private final cia h;

   public bwu(cia $$0) {
      super($$0, cis.class, 8.0F);
      this.h = $$0;
   }

   @Override
   public boolean a() {
      if (this.h.go()) {
         this.c = this.h.gn();
         return true;
      } else {
         return false;
      }
   }
}
