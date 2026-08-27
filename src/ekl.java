public class ekl extends RuntimeException {
   private final vu a;

   public ekl(vu $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public vu a() {
      return this.a;
   }
}
