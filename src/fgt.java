public class fgt extends fgs {
   private final wp a;

   public fgt(wp $$0) {
      this.a = $$0;
   }

   public fgt(String $$0) {
      this(wp.b($$0));
   }

   @Override
   public wp a() {
      return wp.a("mco.upload.failed", this.a);
   }
}
