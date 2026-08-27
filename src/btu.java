public class btu extends bts {
   private boolean p;

   public btu(bkl $$0, cqz $$1) {
      super($$0, $$1);
   }

   @Override
   protected ebv a(int $$0) {
      this.p = this.a.ag() == bjx.v;
      this.o = new ebw(this.p);
      return new ebv(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bb();
   }

   @Override
   protected eif b() {
      return new eif(this.a.dq(), this.a.e(0.5), this.a.dw());
   }

   @Override
   protected double a(eif $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(eif $$0, eif $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(ht $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
