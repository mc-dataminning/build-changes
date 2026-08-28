public class fif extends Exception {
   public final fgl a;

   public fif(fgl $$0) {
      this.a = $$0;
   }

   @Override
   public String getMessage() {
      return this.a.c();
   }
}
