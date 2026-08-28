public class cdt extends cco {
   private final cmq b;
   private int c;

   public cdt(cmq $$0, double $$1, boolean $$2) {
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
      this.b.w(false);
   }

   @Override
   public void a() {
      super.a();
      this.c++;
      if (this.c >= 5 && this.k() < this.l() / 2) {
         this.b.w(true);
      } else {
         this.b.w(false);
      }
   }
}
