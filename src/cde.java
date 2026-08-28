public class cde extends cdc {
   private boolean p;

   public cde(bts $$0, dbz $$1) {
      super($$0, $$1);
   }

   @Override
   protected eom a(int $$0) {
      this.p = this.a.ak() == btb.y;
      this.o = new eoq(this.p);
      return new eom(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bi();
   }

   @Override
   protected evs b() {
      return new evs(this.a.du(), this.a.e(0.5), this.a.dA());
   }

   @Override
   protected double a(evs $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(evs $$0, evs $$1) {
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
