public class bvr extends bvp {
   private boolean p;

   public bvr(bmh $$0, cti $$1) {
      super($$0, $$1);
   }

   @Override
   protected efb a(int $$0) {
      this.p = this.a.ai() == blt.w;
      this.o = new efc(this.p);
      return new efb(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bd();
   }

   @Override
   protected elm b() {
      return new elm(this.a.dr(), this.a.e(0.5), this.a.dx());
   }

   @Override
   protected double a(elm $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(elm $$0, elm $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(hx $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
