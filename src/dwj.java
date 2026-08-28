public class dwj extends dvl implements dws {
   private final dvu a = new dvu();
   private final dvz b = new dvz() {
      @Override
      protected void a(dhp $$0, jj $$1, dym $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awk.iu, awl.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dhp $$0, jj $$1, dym $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awk.it, awl.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dhp $$0, jj $$1, dym $$2, int $$3, int $$4) {
         $$0.a(dwj.this.o, dkw.gb, 1, $$4);
      }

      @Override
      protected boolean a(cqi $$0) {
         return $$0.gw().b(dwj.this);
      }
   };

   public dwj(jj $$0, dym $$1) {
      super(dvn.d, $$0, $$1);
   }

   public static void a(dhp $$0, jj $$1, dym $$2, dwj $$3) {
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

   public void a(cqi $$0) {
      if (!this.p && !$$0.U_()) {
         this.b.a($$0, this.i(), this.aw_(), this.m());
      }
   }

   public void b(cqi $$0) {
      if (!this.p && !$$0.U_()) {
         this.b.b($$0, this.i(), this.aw_(), this.m());
      }
   }

   public boolean c(cqi $$0) {
      return btj.a(this, $$0);
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
