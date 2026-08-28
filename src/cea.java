public class cea extends cdy {
   private boolean p;

   public cea(bup $$0, dej $$1) {
      super($$0, $$1);
   }

   @Override
   protected erj a(int $$0) {
      this.p = this.a.ao() == bty.y;
      this.o = new ern(this.p);
      return new erj(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bm();
   }

   @Override
   protected eyw b() {
      return new eyw(this.a.dx(), this.a.e(0.5), this.a.dD());
   }

   @Override
   protected double a(eyw $$0) {
      return $$0.e;
   }

   @Override
   protected boolean a(eyw $$0, eyw $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(jf $$0) {
      return !this.b.a_($$0).s();
   }

   @Override
   public void a(boolean $$0) {
   }
}
