public class ecf extends RuntimeException {
   private final tm a;

   public ecf(tm $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public tm a() {
      return this.a;
   }
}
