public class ebv extends RuntimeException {
   private final tf a;

   public ebv(tf $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public tf a() {
      return this.a;
   }
}
