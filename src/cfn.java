public class cfn extends cei {
   private final cot b;
   private int c;

   public cfn(cot $$0, double $$1, boolean $$2) {
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
