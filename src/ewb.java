public class ewb extends RuntimeException {
   private final wp a;

   public ewb(wp $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public wp a() {
      return this.a;
   }
}
