public class fgu extends fgs {
   final long a;

   public fgu(long $$0) {
      this.a = $$0;
   }

   @Override
   public wo[] b() {
      return new wo[]{wo.c("mco.upload.failed.too_big.title"), wo.a("mco.upload.failed.too_big.description", fgg.b(this.a, fgg.a(this.a)))};
   }
}
