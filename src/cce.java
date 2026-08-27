public class cce extends ccc {
   private boolean p;

   public cce(bss $$0, daz $$1) {
      super($$0, $$1);
   }

   @Override
   protected enm a(int $$0) {
      this.p = this.a.ak() == bsc.y;
      this.o = new enq(this.p);
      return new enm(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bi();
   }

   @Override
   protected eum b() {
      return new eum(this.a.du(), this.a.e(0.5), this.a.dA());
   }

   @Override
   protected double a(eum $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(eum $$0, eum $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(io $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
