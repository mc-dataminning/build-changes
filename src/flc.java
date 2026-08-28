public class flc extends Exception {
   public final fji a;

   public flc(fji $$0) {
      this.a = $$0;
   }

   @Override
   public String getMessage() {
      return this.a.c();
   }
}
