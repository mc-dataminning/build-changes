public class fgs extends fgq {
   final long a;

   public fgs(long $$0) {
      this.a = $$0;
   }

   @Override
   public wo[] b() {
      return new wo[]{wo.c("mco.upload.failed.too_big.title"), wo.a("mco.upload.failed.too_big.description", fge.b(this.a, fge.a(this.a)))};
   }
}
