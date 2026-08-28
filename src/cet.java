public class cet extends cer {
   private boolean p;

   public cet(bvh $$0, dgg $$1) {
      super($$0, $$1);
   }

   @Override
   protected etn a(int $$0) {
      this.p = this.a.aq() == buq.H;
      this.o = new etr(this.p);
      this.o.a(false);
      return new etn(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bn();
   }

   @Override
   protected fay b() {
      return new fay(this.a.dB(), this.a.e(0.5), this.a.dH());
   }

   @Override
   protected double a(fay $$0) {
      return $$0.e;
   }

   @Override
   protected boolean a(fay $$0, fay $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(ji $$0) {
      return !this.b.a_($$0).s();
   }

   @Override
   public void a(boolean $$0) {
   }
}
