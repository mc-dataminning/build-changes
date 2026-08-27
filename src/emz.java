public class emz extends RuntimeException {
   private final wi a;

   public emz(wi $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public wi a() {
      return this.a;
   }
}
