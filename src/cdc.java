public class cdc extends cda {
   private boolean p;

   public cdc(btp $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   protected eps a(int $$0) {
      this.p = this.a.am() == bsx.y;
      this.o = new epw(this.p);
      return new eps(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bj();
   }

   @Override
   protected exa b() {
      return new exa(this.a.du(), this.a.e(0.5), this.a.dA());
   }

   @Override
   protected double a(exa $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(exa $$0, exa $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(jd $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
