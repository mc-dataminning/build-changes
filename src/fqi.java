public class fqi extends frt {
   private final fro a;

   protected fqi(fnq $$0, double $$1, double $$2, double $$3, fro $$4) {
      super($$0, $$1, $$2, $$3);
      this.a = $$4;
      this.b($$4);
      this.t = 12 + this.r.a(4);
      this.D = 1.0F;
      this.b(1.0F, 1.0F);
   }

   @Override
   public fqx b() {
      return fqx.d;
   }

   @Override
   public int a(float $$0) {
      return 15728880;
   }

   @Override
   public void a() {
      if (this.s++ >= this.t) {
         this.k();
      } else {
         this.b(this.a);
      }
   }

   public static class a implements fqw<ka> {
      private final fro a;

      public a(fro $$0) {
         this.a = $$0;
      }

      public fqt a(ka $$0, fnq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fqi($$1, $$2, $$3, $$4, this.a);
      }
   }
}
