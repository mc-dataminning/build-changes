public class dnj extends dmo implements dnr {
   private final dmw a = new dmw();
   private final dnb b = new dnb() {
      @Override
      protected void a(czg $$0, id $$1, dpi $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, auo.hU, aup.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(czg $$0, id $$1, dpi $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, auo.hT, aup.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(czg $$0, id $$1, dpi $$2, int $$3, int $$4) {
         $$0.a(dnj.this.p, dcj.fG, 1, $$4);
      }

      @Override
      protected boolean a(cka $$0) {
         return $$0.gm().b(dnj.this);
      }
   };

   public dnj(id $$0, dpi $$1) {
      super(dmq.d, $$0, $$1);
   }

   public static void a(czg $$0, id $$1, dpi $$2, dnj $$3) {
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

   public void a(cka $$0) {
      if (!this.q && !$$0.N_()) {
         this.b.a($$0, this.i(), this.az_(), this.n());
      }
   }

   public void b(cka $$0) {
      if (!this.q && !$$0.N_()) {
         this.b.b($$0, this.i(), this.az_(), this.n());
      }
   }

   public boolean c(cka $$0) {
      return bny.a(this, $$0);
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
