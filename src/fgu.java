public class fgu extends fgs {
   final long a;

   public fgu(long $$0) {
      this.a = $$0;
   }

   @Override
   public wp[] b() {
      return new wp[]{wp.c("mco.upload.failed.too_big.title"), wp.a("mco.upload.failed.too_big.description", fgg.b(this.a, fgg.a(this.a)))};
   }
}
