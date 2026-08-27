public class bpg extends bpj {
   public bpg(bgb $$0, cmm $$1) {
      super($$0, $$1);
   }

   @Override
   protected dxv a(int $$0) {
      this.o = new dxn(false);
      this.o.a(true);
      return new dxv(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return true;
   }

   @Override
   protected eei b() {
      return new eei(this.a.dn(), this.a.e(0.5), this.a.dt());
   }

   @Override
   protected double a(eei $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(eei $$0, eei $$1) {
      return this.o() ? a(this.a, $$0, $$1, false) : false;
   }

   @Override
   public boolean a(gu $$0) {
      return !this.b.a_($$0.d()).i();
   }

   @Override
   public void a(boolean $$0) {
   }
}
