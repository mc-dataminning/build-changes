public class fmn extends fml {
   final long a;

   public fmn(long $$0) {
      this.a = $$0;
   }

   @Override
   public xa[] b() {
      return new xa[]{xa.c("mco.upload.failed.too_big.title"), xa.a("mco.upload.failed.too_big.description", flz.b(this.a, flz.a(this.a)))};
   }
}
