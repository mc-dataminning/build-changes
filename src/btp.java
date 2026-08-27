public class btp extends bts {
   public btp(bkl $$0, cqz $$1) {
      super($$0, $$1);
   }

   @Override
   protected ebv a(int $$0) {
      this.o = new ebn(false);
      this.o.a(true);
      return new ebv(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return true;
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
      return this.a.bb() ? a(this.a, $$0, $$1, false) : false;
   }

   @Override
   public boolean a(ht $$0) {
      return !this.b.a_($$0.d()).i();
   }

   @Override
   public void a(boolean $$0) {
   }
}
