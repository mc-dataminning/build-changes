public class ccz extends cdc {
   public ccz(bts $$0, dbz $$1) {
      super($$0, $$1);
   }

   @Override
   protected eom a(int $$0) {
      this.o = new eof(false);
      this.o.a(true);
      return new eom(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return true;
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
      return this.a.bi() ? a(this.a, $$0, $$1, false) : false;
   }

   @Override
   public boolean a(iz $$0) {
      return !this.b.a_($$0.d()).i();
   }

   @Override
   public void a(boolean $$0) {
   }
}
