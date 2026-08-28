public class fhr extends fhp {
   final long a;

   public fhr(long $$0) {
      this.a = $$0;
   }

   @Override
   public wp[] b() {
      return new wp[]{wp.c("mco.upload.failed.too_big.title"), wp.a("mco.upload.failed.too_big.description", fhd.b(this.a, fhd.a(this.a)))};
   }
}
