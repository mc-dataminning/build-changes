public class dxl extends dwn implements dxu {
   private final dww a = new dww();
   private final dxb b = new dxb() {
      @Override
      protected void a(dip $$0, iu $$1, dzo $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awl.iu, awm.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dip $$0, iu $$1, dzo $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awl.it, awm.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dip $$0, iu $$1, dzo $$2, int $$3, int $$4) {
         $$0.a(dxl.this.o, dlw.gb, 1, $$4);
      }

      @Override
      protected boolean a(cqs $$0) {
         return $$0.gw().b(dxl.this);
      }
   };

   public dxl(iu $$0, dzo $$1) {
      super(dwp.d, $$0, $$1);
   }

   public static void a(dip $$0, iu $$1, dzo $$2, dxl $$3) {
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

   public void a(cqs $$0) {
      if (!this.p && !$$0.U_()) {
         this.b.a($$0, this.i(), this.aw_(), this.m());
      }
   }

   public void b(cqs $$0) {
      if (!this.p && !$$0.U_()) {
         this.b.b($$0, this.i(), this.aw_(), this.m());
      }
   }

   public boolean c(cqs $$0) {
      return btr.a(this, $$0);
   }

   public void a() {
      if (!this.p) {
         this.b.c(this.i(), this.aw_(), this.m());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}
