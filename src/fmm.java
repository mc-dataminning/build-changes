public class fmm extends fmu {
   private static final asc a = asc.a();
   private final fmp b;

   fmm(fix $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fmp $$7) {
      super($$0, $$1, $$2, $$3, 0.5 - a.j(), $$5, 0.5 - a.j());
      this.B = 0.96F;
      this.u = -0.1F;
      this.C = true;
      this.b = $$7;
      this.k *= 0.2F;
      if ($$4 == 0.0 && $$6 == 0.0) {
         this.j *= 0.1F;
         this.l *= 0.1F;
      }

      this.D *= 0.75F;
      this.t = (int)(8.0 / (Math.random() * 0.8 + 0.2));
      this.n = false;
      this.b($$7);
      if (this.g()) {
         this.e(0.0F);
      }
   }

   @Override
   public fly b() {
      return fly.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
      if (this.g()) {
         this.e(0.0F);
      } else {
         this.e(arw.i(0.05F, this.y, 1.0F));
      }
   }

   private boolean g() {
      eqv $$0 = eqv.O();
      fng $$1 = $$0.s;
      return $$1 != null && $$1.bp().c(this.g, this.h, this.i) <= 9.0 && $$0.m.aw().a() && $$1.gp();
   }

   public static class a implements flx<iy> {
      private final fmp a;

      public a(fmp $$0) {
         this.a = $$0;
      }

      public flu a(iy $$0, fix $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         flu $$8 = new fmm($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(0.15F);
         $$8.a((float)$$5, (float)$$6, (float)$$7);
         return $$8;
      }
   }

   public static class b implements flx<iy> {
      private final fmp a;

      public b(fmp $$0) {
         this.a = $$0;
      }

      public flu a(iy $$0, fix $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fmm($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class c implements flx<iy> {
      private final fmp a;

      public c(fmp $$0) {
         this.a = $$0;
      }

      public flu a(iy $$0, fix $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         flu $$8 = new fmm($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.a((float)$$5, (float)$$6, (float)$$7);
         return $$8;
      }
   }

   public static class d implements flx<iy> {
      private final fmp a;

      public d(fmp $$0) {
         this.a = $$0;
      }

      public flu a(iy $$0, fix $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fmm($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class e implements flx<iy> {
      private final fmp a;

      public e(fmp $$0) {
         this.a = $$0;
      }

      public flu a(iy $$0, fix $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fmm $$8 = new fmm($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         float $$9 = $$1.z.i() * 0.5F + 0.35F;
         $$8.a(1.0F * $$9, 0.0F * $$9, 1.0F * $$9);
         return $$8;
      }
   }
}
