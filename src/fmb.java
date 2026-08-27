public class fmb extends fls {
   private final fmf b;
   protected boolean a;

   fmb(fin $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fmf $$7) {
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
   public flo b() {
      return flo.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
   }

   public static class a implements fln<iy> {
      private final fmf a;

      public a(fmf $$0) {
         this.a = $$0;
      }

      public flk a(iy $$0, fin $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fmb $$8 = new fmb($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         $$8.a = true;
         return $$8;
      }
   }

   public static class b implements fln<iy> {
      private final fmf a;

      public b(fmf $$0) {
         this.a = $$0;
      }

      public flk a(iy $$0, fin $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fmb $$8 = new fmb($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         return $$8;
      }
   }
}
