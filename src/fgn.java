public class fgn extends fim {
   private final fih a;

   fgn(few $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fih $$7) {
      super($$0, $$1, $$2, $$3);
      this.a = $$7;
      this.t = 4;
      this.u = 0.008F;
      this.j = $$4;
      this.k = $$5;
      this.l = $$6;
      this.b($$7);
   }

   @Override
   public void a() {
      this.d = this.g;
      this.e = this.h;
      this.f = this.i;
      if (this.s++ >= this.t) {
         this.k();
      } else {
         this.k = this.k - (double)this.u;
         this.a(this.j, this.k, this.l);
         this.b(this.a);
      }
   }

   @Override
   public fhq b() {
      return fhq.b;
   }

   public static class a implements fhp<iy> {
      private final fih a;

      public a(fih $$0) {
         this.a = $$0;
      }

      public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fgn($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
