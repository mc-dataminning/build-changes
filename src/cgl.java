public class cgl extends cgj {
   private boolean p;

   public cgl(bxb $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   protected ewl a(int $$0) {
      this.p = this.a.aq() == bwj.H;
      this.o = new ewp(this.p);
      this.o.a(false);
      return new ewl(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bm();
   }

   @Override
   protected fdw b() {
      return new fdw(this.a.dA(), this.a.e(0.5), this.a.dG());
   }

   @Override
   protected double a(fdw $$0) {
      return $$0.e;
   }

   @Override
   protected boolean a(fdw $$0, fdw $$1) {
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
