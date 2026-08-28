public class cdb extends ccz {
   private boolean p;

   public cdb(btp $$0, dbw $$1) {
      super($$0, $$1);
   }

   @Override
   protected eoj a(int $$0) {
      this.p = this.a.ak() == bsy.y;
      this.o = new eon(this.p);
      return new eoj(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bi();
   }

   @Override
   protected evp b() {
      return new evp(this.a.du(), this.a.e(0.5), this.a.dA());
   }

   @Override
   protected double a(evp $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(evp $$0, evp $$1) {
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
