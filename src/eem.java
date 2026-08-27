public class eem extends RuntimeException {
   private final ur a;

   public eem(ur $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public ur a() {
      return this.a;
   }
}
