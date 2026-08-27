public class bpl extends bpj {
   private boolean p;

   public bpl(bgb $$0, cmm $$1) {
      super($$0, $$1);
   }

   @Override
   protected dxv a(int $$0) {
      this.p = this.a.ae() == bfn.v;
      this.o = new dxw(this.p);
      return new dxv(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.o();
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
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(gu $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
