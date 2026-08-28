public class cgo extends cgm {
   private boolean p;

   public cgo(bxe $$0, div $$1) {
      super($$0, $$1);
   }

   @Override
   protected eww a(int $$0) {
      this.p = this.a.aq() == bwm.H;
      this.o = new exa(this.p);
      this.o.a(false);
      return new eww(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bm();
   }

   @Override
   protected fei b() {
      return new fei(this.a.dA(), this.a.e(0.5), this.a.dG());
   }

   @Override
   protected double a(fei $$0) {
      return $$0.e;
   }

   @Override
   protected boolean a(fei $$0, fei $$1) {
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
