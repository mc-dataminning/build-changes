public class aa extends RuntimeException {
   private final p a;

   public aa(p $$0) {
      this.a = $$0;
   }

   public p a() {
      return this.a;
   }

   @Override
   public Throwable getCause() {
      return this.a.b();
   }

   @Override
   public String getMessage() {
      return this.a.a();
   }
}
