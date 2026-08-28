public class ffr extends ffp {
   final long a;

   public ffr(long $$0) {
      this.a = $$0;
   }

   @Override
   public xj[] b() {
      return new xj[]{xj.c("mco.upload.failed.too_big.title"), xj.a("mco.upload.failed.too_big.description", ffd.b(this.a, ffd.a(this.a)))};
   }
}
