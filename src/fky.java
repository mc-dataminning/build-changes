public class fky extends fkw {
   final long a;

   public fky(long $$0) {
      this.a = $$0;
   }

   @Override
   public wy[] b() {
      return new wy[]{wy.c("mco.upload.failed.too_big.title"), wy.a("mco.upload.failed.too_big.description", fkk.b(this.a, fkk.a(this.a)))};
   }
}
