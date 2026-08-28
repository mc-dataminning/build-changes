public class epu extends RuntimeException {
   private final xo a;

   public epu(xo $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public xo a() {
      return this.a;
   }
}
