public class em extends Exception {
   private final xa a;

   public em(xa $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public xa a() {
      return this.a;
   }
}
