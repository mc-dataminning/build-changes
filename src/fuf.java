public class fuf extends fwe {
   fuf(fry $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      this.B = 0.7F;
      this.u = 0.5F;
      this.j *= 0.1F;
      this.k *= 0.1F;
      this.l *= 0.1F;
      this.j += $$4 * 0.4;
      this.k += $$5 * 0.4;
      this.l += $$6 * 0.4;
      float $$7 = (float)(Math.random() * 0.3F + 0.6F);
      this.v = $$7;
      this.w = $$7;
      this.x = $$7;
      this.D *= 0.75F;
      this.t = Math.max((int)(6.0 / (Math.random() * 0.8 + 0.6)), 1);
      this.n = false;
      this.a();
   }

   @Override
   public float b(float $$0) {
      return this.D * aww.a(((float)this.s + $$0) / (float)this.t * 32.0F, 0.0F, 1.0F);
   }

   @Override
   public void a() {
      super.a();
      this.w *= 0.96F;
      this.x *= 0.9F;
   }

   @Override
   public fvi b() {
      return fvi.b;
   }

   public static class a implements fvh<kf> {
      private final fvz a;

      public a(fvz $$0) {
         this.a = $$0;
      }

      public fve a(kf $$0, fry $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fuf $$8 = new fuf($$1, $$2, $$3, $$4, $$5, $$6 + 1.0, $$7);
         $$8.a(20);
         $$8.a(this.a);
         return $$8;
      }
   }

   public static class b implements fvh<kf> {
      private final fvz a;

      public b(fvz $$0) {
         this.a = $$0;
      }

      public fve a(kf $$0, fry $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fuf $$8 = new fuf($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.v *= 0.3F;
         $$8.w *= 0.8F;
         $$8.a(this.a);
         return $$8;
      }
   }

   public static class c implements fvh<kf> {
      private final fvz a;

      public c(fvz $$0) {
         this.a = $$0;
      }

      public fve a(kf $$0, fry $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fuf $$8 = new fuf($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(this.a);
         return $$8;
      }
   }
}
