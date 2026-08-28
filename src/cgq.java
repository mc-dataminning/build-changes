public class cgq extends cgo {
   private boolean p;

   public cgq(bxg $$0, dja $$1) {
      super($$0, $$1);
   }

   @Override
   protected exe a(int $$0) {
      this.p = this.a.aq() == bwo.H;
      this.o = new exi(this.p);
      this.o.a(false);
      return new exe(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bm();
   }

   @Override
   protected feq b() {
      return new feq(this.a.dA(), this.a.e(0.5), this.a.dG());
   }

   @Override
   protected double a(feq $$0) {
      return $$0.e;
   }

   @Override
   protected boolean a(feq $$0, feq $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(iu $$0) {
      return !this.b.a_($$0).s();
   }

   @Override
   public void a(boolean $$0) {
   }
}
