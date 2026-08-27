public class bvh extends bvf {
   private boolean p;

   public bvh(blx $$0, csy $$1) {
      super($$0, $$1);
   }

   @Override
   protected eeq a(int $$0) {
      this.p = this.a.ai() == blj.w;
      this.o = new eer(this.p);
      return new eeq(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bd();
   }

   @Override
   protected elb b() {
      return new elb(this.a.dr(), this.a.e(0.5), this.a.dx());
   }

   @Override
   protected double a(elb $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(elb $$0, elb $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(hv $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
