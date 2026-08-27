public class dhq extends dgv implements dhy {
   private final dhd a = new dhd();
   private final dhi b = new dhi() {
      @Override
      protected void a(ctp $$0, hx $$1, djh $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, ars.hv, art.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(ctp $$0, hx $$1, djh $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, ars.hu, art.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(ctp $$0, hx $$1, djh $$2, int $$3, int $$4) {
         $$0.a(dhq.this.p, cws.fG, 1, $$4);
      }

      @Override
      protected boolean a(cfi $$0) {
         return $$0.gf().b(dhq.this);
      }
   };

   public dhq(hx $$0, djh $$1) {
      super(dgx.d, $$0, $$1);
   }

   public static void a(ctp $$0, hx $$1, djh $$2, dhq $$3) {
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

   public void a(cfi $$0) {
      if (!this.q && !$$0.P_()) {
         this.b.a($$0, this.i(), this.aB_(), this.r());
      }
   }

   public void b(cfi $$0) {
      if (!this.q && !$$0.P_()) {
         this.b.b($$0, this.i(), this.aB_(), this.r());
      }
   }

   public boolean c(cfi $$0) {
      return bju.a(this, $$0);
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
