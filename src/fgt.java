public class fgt extends fgr {
   final long a;

   public fgt(long $$0) {
      this.a = $$0;
   }

   @Override
   public wp[] b() {
      return new wp[]{wp.c("mco.upload.failed.too_big.title"), wp.a("mco.upload.failed.too_big.description", fgf.b(this.a, fgf.a(this.a)))};
   }
}
