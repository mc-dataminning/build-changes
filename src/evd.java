public class evd extends RuntimeException {
   private final wp a;

   public evd(wp $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public wp a() {
      return this.a;
   }
}
