public class cft extends cfr {
   private boolean p;

   public cft(bwh $$0, dhh $$1) {
      super($$0, $$1);
   }

   @Override
   protected eum a(int $$0) {
      this.p = this.a.aq() == bvq.I;
      this.o = new euq(this.p);
      return new eum(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bn();
   }

   @Override
   protected fbx b() {
      return new fbx(this.a.dB(), this.a.e(0.5), this.a.dH());
   }

   @Override
   protected double a(fbx $$0) {
      return $$0.e;
   }

   @Override
   protected boolean a(fbx $$0, fbx $$1) {
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
