public class fkj extends fkh {
   final long a;

   public fkj(long $$0) {
      this.a = $$0;
   }

   @Override
   public wy[] b() {
      return new wy[]{wy.c("mco.upload.failed.too_big.title"), wy.a("mco.upload.failed.too_big.description", fjv.b(this.a, fjv.a(this.a)))};
   }
}
