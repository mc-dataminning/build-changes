public class fml extends fmc {
   private final fmp b;
   protected boolean a;

   fml(fix $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fmp $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.b = $$7;
      this.d(1.5F);
      this.b($$7);
   }

   @Override
   public int a(float $$0) {
      return this.a ? 240 : super.a($$0);
   }

   @Override
   public fly b() {
      return fly.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
   }

   public static class a implements flx<ja> {
      private final fmp a;

      public a(fmp $$0) {
         this.a = $$0;
      }

      public flu a(ja $$0, fix $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fml $$8 = new fml($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         $$8.a = true;
         return $$8;
      }
   }

   public static class b implements flx<ja> {
      private final fmp a;

      public b(fmp $$0) {
         this.a = $$0;
      }

      public flu a(ja $$0, fix $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fml $$8 = new fml($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         return $$8;
      }
   }
}
