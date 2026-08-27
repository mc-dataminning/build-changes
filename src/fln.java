public class fln extends fle {
   private final flr b;
   protected boolean a;

   fln(fie $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, flr $$7) {
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
   public fla b() {
      return fla.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
   }

   public static class a implements fkz<iz> {
      private final flr a;

      public a(flr $$0) {
         this.a = $$0;
      }

      public fkw a(iz $$0, fie $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fln $$8 = new fln($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         $$8.a = true;
         return $$8;
      }
   }

   public static class b implements fkz<iz> {
      private final flr a;

      public b(flr $$0) {
         this.a = $$0;
      }

      public fkw a(iz $$0, fie $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fln $$8 = new fln($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         return $$8;
      }
   }
}
