public class dyd extends dxf implements dym {
   private final dxo a = new dxo();
   private final dxt b = new dxt() {
      @Override
      protected void a(dja $$0, iu $$1, eah $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awn.ix, awo.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dja $$0, iu $$1, eah $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awn.iw, awo.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dja $$0, iu $$1, eah $$2, int $$3, int $$4) {
         $$0.a(dyd.this.o, dmh.gf, 1, $$4);
      }

      @Override
      protected boolean a(crc $$0) {
         return $$0.gx().b(dyd.this);
      }
   };

   public dyd(iu $$0, eah $$1) {
      super(dxh.d, $$0, $$1);
   }

   public static void a(dja $$0, iu $$1, eah $$2, dyd $$3) {
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

   public void a(crc $$0) {
      if (!this.p && !$$0.V_()) {
         this.b.a($$0, this.i(), this.ax_(), this.m());
      }
   }

   public void b(crc $$0) {
      if (!this.p && !$$0.V_()) {
         this.b.b($$0, this.i(), this.ax_(), this.m());
      }
   }

   public boolean c(crc $$0) {
      return btw.a(this, $$0);
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
