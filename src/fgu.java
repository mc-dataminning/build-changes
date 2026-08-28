public class fgu extends fgt {
   private final wp a;

   public fgu(wp $$0) {
      this.a = $$0;
   }

   public fgu(String $$0) {
      this(wp.b($$0));
   }

   @Override
   public wp a() {
      return wp.a("mco.upload.failed", this.a);
   }
}
