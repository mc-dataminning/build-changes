public class dzc extends dye implements dzl {
   private final dyn a = new dyn();
   private final dys b = new dys() {
      @Override
      protected void a(djz $$0, iw $$1, ebg $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awr.ix, aws.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(djz $$0, iw $$1, ebg $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awr.iw, aws.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(djz $$0, iw $$1, ebg $$2, int $$3, int $$4) {
         $$0.a(dzc.this.o, dng.gf, 1, $$4);
      }

      @Override
      protected boolean a(crz $$0) {
         return $$0.gx().b(dzc.this);
      }
   };

   public dzc(iw $$0, ebg $$1) {
      super(dyg.d, $$0, $$1);
   }

   public static void a(djz $$0, iw $$1, ebg $$2, dzc $$3) {
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

   public void a(crz $$0) {
      if (!this.p && !$$0.Z_()) {
         this.b.a($$0, this.i(), this.aB_(), this.m());
      }
   }

   public void b(crz $$0) {
      if (!this.p && !$$0.Z_()) {
         this.b.b($$0, this.i(), this.aB_(), this.m());
      }
   }

   public boolean c(crz $$0) {
      return bum.a(this, $$0);
   }

   public void a() {
      if (!this.p) {
         this.b.c(this.i(), this.aB_(), this.m());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}
