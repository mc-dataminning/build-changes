public class fma extends fly {
   final long a;

   public fma(long $$0) {
      this.a = $$0;
   }

   @Override
   public xg[] b() {
      return new xg[]{xg.c("mco.upload.failed.too_big.title"), xg.a("mco.upload.failed.too_big.description", flm.b(this.a, flm.a(this.a)))};
   }
}
