public class cfu extends cfs {
   private boolean p;

   public cfu(bwi $$0, dhi $$1) {
      super($$0, $$1);
   }

   @Override
   protected eun a(int $$0) {
      this.p = this.a.aq() == bvr.I;
      this.o = new eur(this.p);
      return new eun(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bn();
   }

   @Override
   protected fby b() {
      return new fby(this.a.dB(), this.a.e(0.5), this.a.dH());
   }

   @Override
   protected double a(fby $$0) {
      return $$0.e;
   }

   @Override
   protected boolean a(fby $$0, fby $$1) {
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
