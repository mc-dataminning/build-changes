public class dhp extends dgu implements dhx {
   private final dhc a = new dhc();
   private final dhh b = new dhh() {
      @Override
      protected void a(cto $$0, hx $$1, djg $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, arr.hv, ars.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(cto $$0, hx $$1, djg $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, arr.hu, ars.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(cto $$0, hx $$1, djg $$2, int $$3, int $$4) {
         $$0.a(dhp.this.p, cwr.fG, 1, $$4);
      }

      @Override
      protected boolean a(cfh $$0) {
         return $$0.gf().b(dhp.this);
      }
   };

   public dhp(hx $$0, djg $$1) {
      super(dgw.d, $$0, $$1);
   }

   public static void a(cto $$0, hx $$1, djg $$2, dhp $$3) {
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

   public void a(cfh $$0) {
      if (!this.q && !$$0.P_()) {
         this.b.a($$0, this.i(), this.aB_(), this.r());
      }
   }

   public void b(cfh $$0) {
      if (!this.q && !$$0.P_()) {
         this.b.b($$0, this.i(), this.aB_(), this.r());
      }
   }

   public boolean c(cfh $$0) {
      return bjt.a(this, $$0);
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
