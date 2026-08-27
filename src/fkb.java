public class fkb extends fmb {
   fkb(fii $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super($$0, $$1, $$2, $$3);
      this.b(0.02F, 0.02F);
      this.D = this.D * (this.r.i() * 0.6F + 0.2F);
      this.j = $$4 * 0.2F + (Math.random() * 2.0 - 1.0) * 0.02F;
      this.k = $$5 * 0.2F + (Math.random() * 2.0 - 1.0) * 0.02F;
      this.l = $$6 * 0.2F + (Math.random() * 2.0 - 1.0) * 0.02F;
      this.t = (int)(8.0 / (Math.random() * 0.8 + 0.2));
   }

   @Override
   public void a() {
      this.d = this.g;
      this.e = this.h;
      this.f = this.i;
      if (this.t-- <= 0) {
         this.k();
      } else {
         this.k += 0.002;
         this.a(this.j, this.k, this.l);
         this.j *= 0.85F;
         this.k *= 0.85F;
         this.l *= 0.85F;
         if (!this.c.b_(gu.a(this.g, this.h, this.i)).a(apq.a)) {
            this.k();
         }
      }
   }

   @Override
   public flf b() {
      return flf.b;
   }

   public static class a implements fle<iy> {
      private final flw a;

      public a(flw $$0) {
         this.a = $$0;
      }

      public flb a(iy $$0, fii $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fkb $$8 = new fkb($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(this.a);
         return $$8;
      }
   }
}
