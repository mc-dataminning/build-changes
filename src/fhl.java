public class fhl extends fhj {
   final long a;

   public fhl(long $$0) {
      this.a = $$0;
   }

   @Override
   public xk[] b() {
      return new xk[]{xk.c("mco.upload.failed.too_big.title"), xk.a("mco.upload.failed.too_big.description", fgx.b(this.a, fgx.a(this.a)))};
   }
}
