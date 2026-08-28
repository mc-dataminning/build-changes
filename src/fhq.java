public class fhq extends fhp {
   private final wp a;

   public fhq(wp $$0) {
      this.a = $$0;
   }

   public fhq(String $$0) {
      this(wp.b($$0));
   }

   @Override
   public wp a() {
      return wp.a("mco.upload.failed", this.a);
   }
}
