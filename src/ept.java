public class ept extends RuntimeException {
   private final xo a;

   public ept(xo $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public xo a() {
      return this.a;
   }
}
