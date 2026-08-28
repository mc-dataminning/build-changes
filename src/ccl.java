public class ccl extends cck {
   private final cnx h;

   public ccl(cnx $$0) {
      super($$0, cor.class, 8.0F);
      this.h = $$0;
   }

   @Override
   public boolean b() {
      if (this.h.gw()) {
         this.c = this.h.gv();
         return true;
      } else {
         return false;
      }
   }
}
