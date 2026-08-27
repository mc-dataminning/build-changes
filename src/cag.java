public class cag extends cae {
   private boolean p;

   public cag(bqv $$0, czg $$1) {
      super($$0, $$1);
   }

   @Override
   protected elr a(int $$0) {
      this.p = this.a.ai() == bqg.y;
      this.o = new elv(this.p);
      return new elr(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bg();
   }

   @Override
   protected esj b() {
      return new esj(this.a.dr(), this.a.e(0.5), this.a.dx());
   }

   @Override
   protected double a(esj $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(esj $$0, esj $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(id $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
