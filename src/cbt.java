public class cbt extends cbs {
   private final cnf h;

   public cbt(cnf $$0) {
      super($$0, cnx.class, 8.0F);
      this.h = $$0;
   }

   @Override
   public boolean b() {
      if (this.h.gp()) {
         this.c = this.h.go();
         return true;
      } else {
         return false;
      }
   }
}
