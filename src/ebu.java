public class ebu extends RuntimeException {
   private final te a;

   public ebu(te $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public te a() {
      return this.a;
   }
}
