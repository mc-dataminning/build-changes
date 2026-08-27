public class fht extends cpa implements AutoCloseable {
   private final fhv d = new fhv(this);

   public fht(fzn $$0, coz $$1) {
      super($$0, $$1);
   }

   public fhv b() {
      return this.d;
   }

   @Override
   public void close() {
      this.d.close();
   }
}
