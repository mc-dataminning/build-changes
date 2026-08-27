public class dhj extends dgo implements dhr {
   private final dgw a = new dgw();
   private final dhb b = new dhb() {
      @Override
      protected void a(cti $$0, hx $$1, dja $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, arm.hv, arn.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(cti $$0, hx $$1, dja $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, arm.hu, arn.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(cti $$0, hx $$1, dja $$2, int $$3, int $$4) {
         $$0.a(dhj.this.p, cwl.fG, 1, $$4);
      }

      @Override
      protected boolean a(cfb $$0) {
         return $$0.gf().b(dhj.this);
      }
   };

   public dhj(hx $$0, dja $$1) {
      super(dgq.d, $$0, $$1);
   }

   public static void a(cti $$0, hx $$1, dja $$2, dhj $$3) {
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

   public void a(cfb $$0) {
      if (!this.q && !$$0.P_()) {
         this.b.a($$0, this.i(), this.aB_(), this.r());
      }
   }

   public void b(cfb $$0) {
      if (!this.q && !$$0.P_()) {
         this.b.b($$0, this.i(), this.aB_(), this.r());
      }
   }

   public boolean c(cfb $$0) {
      return bjo.a(this, $$0);
   }

   public void c() {
      if (!this.q) {
         this.b.c(this.i(), this.aB_(), this.r());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}
