public class fdd extends Exception {
   public final fbu a;

   public fdd(fbu $$0) {
      this.a = $$0;
   }

   @Override
   public String getMessage() {
      return this.a.c();
   }
}
