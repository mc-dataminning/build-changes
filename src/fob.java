public class fob extends Exception {
   public final fmh a;

   public fob(fmh $$0) {
      this.a = $$0;
   }

   @Override
   public String getMessage() {
      return this.a.c();
   }
}
