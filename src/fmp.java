public class fmp extends fmn {
   final long a;

   public fmp(long $$0) {
      this.a = $$0;
   }

   @Override
   public xc[] b() {
      return new xc[]{xc.c("mco.upload.failed.too_big.title"), xc.a("mco.upload.failed.too_big.description", fmb.b(this.a, fmb.a(this.a)))};
   }
}
