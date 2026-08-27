public class cab extends bzz {
   private boolean p;

   public cab(bqq $$0, cyx $$1) {
      super($$0, $$1);
   }

   @Override
   protected eli a(int $$0) {
      this.p = this.a.ai() == bqb.y;
      this.o = new elm(this.p);
      return new eli(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bg();
   }

   @Override
   protected esa b() {
      return new esa(this.a.dr(), this.a.e(0.5), this.a.dx());
   }

   @Override
   protected double a(esa $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(esa $$0, esa $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(ib $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
