public class dxv extends dwx implements dye {
   private final dxg a = new dxg();
   private final dxl b = new dxl() {
      @Override
      protected void a(div $$0, iu $$1, dzz $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awn.iv, awo.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(div $$0, iu $$1, dzz $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awn.iu, awo.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(div $$0, iu $$1, dzz $$2, int $$3, int $$4) {
         $$0.a(dxv.this.o, dmc.gc, 1, $$4);
      }

      @Override
      protected boolean a(cqy $$0) {
         return $$0.gw().b(dxv.this);
      }
   };

   public dxv(iu $$0, dzz $$1) {
      super(dwz.d, $$0, $$1);
   }

   public static void a(div $$0, iu $$1, dzz $$2, dxv $$3) {
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

   public void a(cqy $$0) {
      if (!this.p && !$$0.U_()) {
         this.b.a($$0, this.i(), this.aw_(), this.m());
      }
   }

   public void b(cqy $$0) {
      if (!this.p && !$$0.U_()) {
         this.b.b($$0, this.i(), this.aw_(), this.m());
      }
   }

   public boolean c(cqy $$0) {
      return btu.a(this, $$0);
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
