public class fcp extends Exception {
   public final fbe a;

   public fcp(fbe $$0) {
      this.a = $$0;
   }

   @Override
   public String getMessage() {
      return this.a.c();
   }
}
