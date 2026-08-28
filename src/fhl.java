public class fhl extends fhj {
   final long a;

   public fhl(long $$0) {
      this.a = $$0;
   }

   @Override
   public xv[] b() {
      return new xv[]{xv.c("mco.upload.failed.too_big.title"), xv.a("mco.upload.failed.too_big.description", fgx.b(this.a, fgx.a(this.a)))};
   }
}
