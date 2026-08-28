public class fmo extends fmn {
   private final xc a;

   public fmo(xc $$0) {
      this.a = $$0;
   }

   public fmo(String $$0) {
      this(xc.b($$0));
   }

   @Override
   public xc a() {
      return xc.a("mco.upload.failed", this.a);
   }
}
