public class flx extends fln {
   flx(fii $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, int $$7, flw $$8) {
      super($$0, $$1, $$2, $$3, $$8, 0.0F);
      this.B = 0.92F;
      this.D = 0.5F;
      this.e(1.0F);
      this.a((float)ara.b.b($$7), (float)ara.b.c($$7), (float)ara.b.d($$7));
      this.t = (int)((double)(this.D * 12.0F) / (Math.random() * 0.8F + 0.2F));
      this.b($$8);
      this.n = false;
      this.j = $$4;
      this.k = $$5;
      this.l = $$6;
   }

   @Override
   public void a() {
      super.a();
      if (!this.o) {
         this.b(this.a);
         if (this.s > this.t / 2) {
            this.e(1.0F - ((float)this.s - (float)(this.t / 2)) / (float)this.t);
         }

         if (this.c.a_(gu.a(this.g, this.h, this.i)).i()) {
            this.k -= 0.0074F;
         }
      }
   }

   public static class a implements fle<iy> {
      private final flw a;

      public a(flw $$0) {
         this.a = $$0;
      }

      public flb a(iy $$0, fii $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new flx($$1, $$2, $$3, $$4, $$5, $$6, $$7, ara.b.a(255, 204, 31, 102), this.a);
      }
   }

   public static class b implements fle<iy> {
      private final flw a;

      public b(flw $$0) {
         this.a = $$0;
      }

      public flb a(iy $$0, fii $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new flx($$1, $$2, $$3, $$4, $$5, $$6, $$7, ara.b.a(255, 255, 255, 255), this.a);
      }
   }
}
