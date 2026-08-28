public class etp extends RuntimeException {
   private final xi a;

   public etp(xi $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public xi a() {
      return this.a;
   }
}
