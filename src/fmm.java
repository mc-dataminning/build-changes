public class fmm extends fml {
   private final xa a;

   public fmm(xa $$0) {
      this.a = $$0;
   }

   public fmm(String $$0) {
      this(xa.b($$0));
   }

   @Override
   public xa a() {
      return xa.a("mco.upload.failed", this.a);
   }
}
