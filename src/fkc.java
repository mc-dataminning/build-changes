public class fkc extends fka {
   final long a;

   public fkc(long $$0) {
      this.a = $$0;
   }

   @Override
   public wy[] b() {
      return new wy[]{wy.c("mco.upload.failed.too_big.title"), wy.a("mco.upload.failed.too_big.description", fjo.b(this.a, fjo.a(this.a)))};
   }
}
