public class dyk extends dxm implements dyt {
   private final dxv a = new dxv();
   private final dya b = new dya() {
      @Override
      protected void a(djh $$0, iv $$1, eao $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awn.ix, awo.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(djh $$0, iv $$1, eao $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awn.iw, awo.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(djh $$0, iv $$1, eao $$2, int $$3, int $$4) {
         $$0.a(dyk.this.o, dmo.gf, 1, $$4);
      }

      @Override
      protected boolean a(crj $$0) {
         return $$0.gw().b(dyk.this);
      }
   };

   public dyk(iv $$0, eao $$1) {
      super(dxo.d, $$0, $$1);
   }

   public static void a(djh $$0, iv $$1, eao $$2, dyk $$3) {
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

   public void a(crj $$0) {
      if (!this.p && !$$0.V_()) {
         this.b.a($$0, this.i(), this.ax_(), this.m());
      }
   }

   public void b(crj $$0) {
      if (!this.p && !$$0.V_()) {
         this.b.b($$0, this.i(), this.ax_(), this.m());
      }
   }

   public boolean c(crj $$0) {
      return btz.a(this, $$0);
   }

   public void a() {
      if (!this.p) {
         this.b.c(this.i(), this.ax_(), this.m());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}
