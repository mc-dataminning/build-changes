public class fhr extends fhp {
   final long a;

   public fhr(long $$0) {
      this.a = $$0;
   }

   @Override
   public xv[] b() {
      return new xv[]{xv.c("mco.upload.failed.too_big.title"), xv.a("mco.upload.failed.too_big.description", fhd.b(this.a, fhd.a(this.a)))};
   }
}
