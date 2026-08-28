public class cwh extends cxn {
   private final cwg a;

   public cwh(buk $$0, int $$1, int $$2, int $$3, cwg $$4) {
      super($$0, $$1, $$2, $$3);
      this.a = $$4;
   }

   @Override
   public boolean a(czy $$0) {
      return !this.a.e(this.d) && super.a($$0);
   }

   @Override
   public void d() {
      super.d();
      this.a.a(this.c);
   }
}
