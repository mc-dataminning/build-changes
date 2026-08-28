public class cfp extends cek {
   private final cox b;
   private int c;

   public cfp(cox $$0, double $$1, boolean $$2) {
      super($$0, $$1, $$2);
      this.b = $$0;
   }

   @Override
   public void d() {
      super.d();
      this.c = 0;
   }

   @Override
   public void e() {
      super.e();
      this.b.v(false);
   }

   @Override
   public void a() {
      super.a();
      this.c++;
      if (this.c >= 5 && this.k() < this.l() / 2) {
         this.b.v(true);
      } else {
         this.b.v(false);
      }
   }
}
