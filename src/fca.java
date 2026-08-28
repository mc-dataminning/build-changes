public class fca extends Exception {
   public final fap a;

   public fca(fap $$0) {
      this.a = $$0;
   }

   @Override
   public String getMessage() {
      return this.a.c();
   }
}
