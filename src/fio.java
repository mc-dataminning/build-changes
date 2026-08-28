public class fio extends fim {
   final long a;

   public fio(long $$0) {
      this.a = $$0;
   }

   @Override
   public wv[] b() {
      return new wv[]{wv.c("mco.upload.failed.too_big.title"), wv.a("mco.upload.failed.too_big.description", fia.b(this.a, fia.a(this.a)))};
   }
}
