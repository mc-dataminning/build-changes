public class dfy extends dfd implements dgg {
   private final dfl a = new dfl();
   private final dfq b = new dfq() {
      @Override
      protected void a(csa $$0, ht $$1, dhi $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aqr.hm, aqs.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(csa $$0, ht $$1, dhi $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aqr.hl, aqs.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(csa $$0, ht $$1, dhi $$2, int $$3, int $$4) {
         $$0.a(dfy.this.p, cvc.fG, 1, $$4);
      }

      @Override
      protected boolean a(cdu $$0) {
         return $$0.gg().b(dfy.this);
      }
   };

   public dfy(ht $$0, dhi $$1) {
      super(dff.d, $$0, $$1);
   }

   public static void a(csa $$0, ht $$1, dhi $$2, dfy $$3) {
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

   public void a(cdu $$0) {
      if (!this.q && !$$0.O_()) {
         this.b.a($$0, this.k(), this.p(), this.q());
      }
   }

   public void b(cdu $$0) {
      if (!this.q && !$$0.O_()) {
         this.b.b($$0, this.k(), this.p(), this.q());
      }
   }

   public boolean c(cdu $$0) {
      return biq.a(this, $$0);
   }

   public void c() {
      if (!this.q) {
         this.b.c(this.k(), this.p(), this.q());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}
