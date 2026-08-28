public class fld extends flb {
   final long a;

   public fld(long $$0) {
      this.a = $$0;
   }

   @Override
   public wy[] b() {
      return new wy[]{wy.c("mco.upload.failed.too_big.title"), wy.a("mco.upload.failed.too_big.description", fkp.b(this.a, fkp.a(this.a)))};
   }
}
