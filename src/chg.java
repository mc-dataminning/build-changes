public class chg extends che {
   private boolean p;

   public chg(bxw $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   protected eye a(int $$0) {
      this.p = this.a.an() == bxc.I;
      this.o = new eyi(this.p);
      this.o.a(false);
      return new eye(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bl();
   }

   @Override
   protected ffq b() {
      return new ffq(this.a.dA(), this.a.e(0.5), this.a.dG());
   }

   @Override
   protected double a(ffq $$0) {
      return $$0.e;
   }

   @Override
   protected boolean a(ffq $$0, ffq $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(iv $$0) {
      return !this.b.a_($$0).s();
   }

   @Override
   public void a(boolean $$0) {
   }
}
