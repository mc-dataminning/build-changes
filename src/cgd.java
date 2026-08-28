public class cgd extends cgb {
   private boolean p;

   public cgd(bwt $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   protected evj a(int $$0) {
      this.p = this.a.aq() == bwb.H;
      this.o = new evn(this.p);
      this.o.a(false);
      return new evj(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bm();
   }

   @Override
   protected fcu b() {
      return new fcu(this.a.dA(), this.a.e(0.5), this.a.dG());
   }

   @Override
   protected double a(fcu $$0) {
      return $$0.e;
   }

   @Override
   protected boolean a(fcu $$0, fcu $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(jj $$0) {
      return !this.b.a_($$0).s();
   }

   @Override
   public void a(boolean $$0) {
   }
}
