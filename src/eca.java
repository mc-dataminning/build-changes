public class eca extends RuntimeException {
   private final ti a;

   public eca(ti $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public ti a() {
      return this.a;
   }
}
