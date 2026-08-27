public class fsf extends ftp<byp, fei<byp>> {
   private static final aep a = new aep("textures/entity/enderman/enderman.png");
   private final art i = art.a();

   public fsf(fsj.a $$0) {
      super($$0, new fei<>($$0.a(fhi.R)), 0.5F);
      this.a(new fwb<>(this));
      this.a(new fvs(this, $$0.c()));
   }

   public void a(byp $$0, float $$1, float $$2, elh $$3, fng $$4, int $$5) {
      dey $$6 = $$0.fZ();
      fei<byp> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.ga();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ehf a(byp $$0, float $$1) {
      if ($$0.ga()) {
         double $$2 = 0.02;
         return new ehf(this.i.k() * 0.02, 0.0, this.i.k() * 0.02);
      } else {
         return super.a($$0, $$1);
      }
   }

   public aep a(byp $$0) {
      return a;
   }
}
