public class bzb extends byz {
   private boolean p;

   public bzb(bpq $$0, cwz $$1) {
      super($$0, $$1);
   }

   @Override
   protected eje a(int $$0) {
      this.p = this.a.ai() == bpc.y;
      this.o = new ejf(this.p);
      return new eje(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bg();
   }

   @Override
   protected epr b() {
      return new epr(this.a.dr(), this.a.e(0.5), this.a.dx());
   }

   @Override
   protected double a(epr $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(epr $$0, epr $$1) {
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
