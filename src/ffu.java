public class ffu extends Exception {
   public final fel a;

   public ffu(fel $$0) {
      this.a = $$0;
   }

   @Override
   public String getMessage() {
      return this.a.c();
   }
}
