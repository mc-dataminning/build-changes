public class cfm extends cfk {
   private boolean p;

   public cfm(bwa $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected eum a(int $$0) {
      this.p = this.a.aq() == bvi.H;
      this.o = new euq(this.p);
      this.o.a(false);
      return new eum(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bl();
   }

   @Override
   protected fbx b() {
      return new fbx(this.a.dz(), this.a.e(0.5), this.a.dF());
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
   public boolean a(ji $$0) {
      return !this.b.a_($$0).s();
   }

   @Override
   public void a(boolean $$0) {
   }
}
