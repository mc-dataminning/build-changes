public class fhq extends fho {
   final long a;

   public fhq(long $$0) {
      this.a = $$0;
   }

   @Override
   public xv[] b() {
      return new xv[]{xv.c("mco.upload.failed.too_big.title"), xv.a("mco.upload.failed.too_big.description", fhc.b(this.a, fhc.a(this.a)))};
   }
}
