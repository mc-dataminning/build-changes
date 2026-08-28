public class dvm extends dup implements dvv {
   private final dux a = new dux();
   private final dvc b = new dvc() {
      @Override
      protected void a(dha $$0, jh $$1, dxn $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, axf.is, axg.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dha $$0, jh $$1, dxn $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, axf.ir, axg.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dha $$0, jh $$1, dxn $$2, int $$3, int $$4) {
         $$0.a(dvm.this.p, dkg.fU, 1, $$4);
      }

      @Override
      protected boolean a(cps $$0) {
         return $$0.gu().b(dvm.this);
      }
   };

   public dvm(jh $$0, dxn $$1) {
      super(dur.d, $$0, $$1);
   }

   public static void a(dha $$0, jh $$1, dxn $$2, dvm $$3) {
      $$3.a.a();
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.a.a($$1 > 0);
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   public void a(cps $$0) {
      if (!this.q && !$$0.aa_()) {
         this.b.a($$0, this.i(), this.aB_(), this.m());
      }
   }

   public void b(cps $$0) {
      if (!this.q && !$$0.aa_()) {
         this.b.b($$0, this.i(), this.aB_(), this.m());
      }
   }

   public boolean c(cps $$0) {
      return bsx.a(this, $$0);
   }

   public void b() {
      if (!this.q) {
         this.b.c(this.i(), this.aB_(), this.m());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}
