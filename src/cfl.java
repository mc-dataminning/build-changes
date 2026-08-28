public class cfl extends cfj {
   private boolean p;

   public cfl(bvz $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected eug a(int $$0) {
      this.p = this.a.aq() == bvi.I;
      this.o = new euk(this.p);
      return new eug(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bn();
   }

   @Override
   protected fbr b() {
      return new fbr(this.a.dB(), this.a.e(0.5), this.a.dH());
   }

   @Override
   protected double a(fbr $$0) {
      return $$0.e;
   }

   @Override
   protected boolean a(fbr $$0, fbr $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(jh $$0) {
      return !this.b.a_($$0).s();
   }

   @Override
   public void a(boolean $$0) {
   }
}
