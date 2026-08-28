public class ccm extends cck {
   private boolean p;

   public ccm(bta $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Override
   protected eor a(int $$0) {
      this.p = this.a.ak() == bsj.y;
      this.o = new eov(this.p);
      return new eor(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bi();
   }

   @Override
   protected evz b() {
      return new evz(this.a.du(), this.a.e(0.5), this.a.dA());
   }

   @Override
   protected double a(evz $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(evz $$0, evz $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(ja $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
