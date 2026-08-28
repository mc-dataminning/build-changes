public class cdd extends cdb {
   private boolean p;

   public cdd(btr $$0, dby $$1) {
      super($$0, $$1);
   }

   @Override
   protected eol a(int $$0) {
      this.p = this.a.ak() == bta.y;
      this.o = new eop(this.p);
      return new eol(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bi();
   }

   @Override
   protected evr b() {
      return new evr(this.a.du(), this.a.e(0.5), this.a.dA());
   }

   @Override
   protected double a(evr $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(evr $$0, evr $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(iz $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
