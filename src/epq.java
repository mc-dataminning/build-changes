public class epq extends RuntimeException {
   private final xl a;

   public epq(xl $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public xl a() {
      return this.a;
   }
}
