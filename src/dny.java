public class dny extends dnd implements dog {
   private final dnl a = new dnl();
   private final dnq b = new dnq() {
      @Override
      protected void a(czu $$0, im $$1, dpy $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, auz.hU, ava.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(czu $$0, im $$1, dpy $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, auz.hT, ava.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(czu $$0, im $$1, dpy $$2, int $$3, int $$4) {
         $$0.a(dny.this.p, dcx.fG, 1, $$4);
      }

      @Override
      protected boolean a(ckl $$0) {
         return $$0.gn().b(dny.this);
      }
   };

   public dny(im $$0, dpy $$1) {
      super(dnf.d, $$0, $$1);
   }

   public static void a(czu $$0, im $$1, dpy $$2, dny $$3) {
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

   public void a(ckl $$0) {
      if (!this.q && !$$0.N_()) {
         this.b.a($$0, this.i(), this.az_(), this.n());
      }
   }

   public void b(ckl $$0) {
      if (!this.q && !$$0.N_()) {
         this.b.b($$0, this.i(), this.az_(), this.n());
      }
   }

   public boolean c(ckl $$0) {
      return boj.a(this, $$0);
   }

   public void b() {
      if (!this.q) {
         this.b.c(this.i(), this.az_(), this.n());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}
