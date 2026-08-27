public class bsx extends bsv {
   private boolean p;

   public bsx(bjo $$0, cqb $$1) {
      super($$0, $$1);
   }

   @Override
   protected eax a(int $$0) {
      this.p = this.a.ag() == bja.v;
      this.o = new eay(this.p);
      return new eax(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bb();
   }

   @Override
   protected ehh b() {
      return new ehh(this.a.dq(), this.a.e(0.5), this.a.dw());
   }

   @Override
   protected double a(ehh $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(ehh $$0, ehh $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(gw $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
