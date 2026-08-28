public class fgv extends fgt {
   final long a;

   public fgv(long $$0) {
      this.a = $$0;
   }

   @Override
   public wp[] b() {
      return new wp[]{wp.c("mco.upload.failed.too_big.title"), wp.a("mco.upload.failed.too_big.description", fgh.b(this.a, fgh.a(this.a)))};
   }
}
