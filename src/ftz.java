public class ftz extends fvj<cab, ffv<cab>> {
   private static final afw a = new afw("textures/entity/enderman/enderman.png");
   private final ate i = ate.a();

   public ftz(fud.a $$0) {
      super($$0, new ffv<>($$0.a(fiv.R)), 0.5F);
      this.a(new fxv<>(this));
      this.a(new fxm(this, $$0.c()));
   }

   public void a(cab $$0, float $$1, float $$2, emh $$3, fpb $$4, int $$5) {
      dgb $$6 = $$0.ge();
      ffv<cab> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.gf();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public eif a(cab $$0, float $$1) {
      if ($$0.gf()) {
         double $$2 = 0.02;
         return new eif(this.i.k() * 0.02, 0.0, this.i.k() * 0.02);
      } else {
         return super.a($$0, $$1);
      }
   }

   public afw a(cab $$0) {
      return a;
   }
}
