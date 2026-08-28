public class fgs extends fgr {
   private final wp a;

   public fgs(wp $$0) {
      this.a = $$0;
   }

   public fgs(String $$0) {
      this(wp.b($$0));
   }

   @Override
   public wp a() {
      return wp.a("mco.upload.failed", this.a);
   }
}
