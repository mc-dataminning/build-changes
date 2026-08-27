public class dgy extends dgd implements dhg {
   private final dgl a = new dgl();
   private final dgq b = new dgq() {
      @Override
      protected void a(csy $$0, hv $$1, dip $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, arc.hv, ard.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(csy $$0, hv $$1, dip $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, arc.hu, ard.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(csy $$0, hv $$1, dip $$2, int $$3, int $$4) {
         $$0.a(dgy.this.p, cwb.fG, 1, $$4);
      }

      @Override
      protected boolean a(cer $$0) {
         return $$0.gf().b(dgy.this);
      }
   };

   public dgy(hv $$0, dip $$1) {
      super(dgf.d, $$0, $$1);
   }

   public static void a(csy $$0, hv $$1, dip $$2, dgy $$3) {
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

   public void a(cer $$0) {
      if (!this.q && !$$0.P_()) {
         this.b.a($$0, this.i(), this.aB_(), this.r());
      }
   }

   public void b(cer $$0) {
      if (!this.q && !$$0.P_()) {
         this.b.b($$0, this.i(), this.aB_(), this.r());
      }
   }

   public boolean c(cer $$0) {
      return bje.a(this, $$0);
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
