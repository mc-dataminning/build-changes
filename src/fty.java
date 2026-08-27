public class fty extends ftp {
   private final fuc b;
   protected boolean a;

   fty(fqe $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fuc $$7) {
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
   public ftl b() {
      return ftl.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
   }

   public static class a implements ftk<kc> {
      private final fuc a;

      public a(fuc $$0) {
         this.a = $$0;
      }

      public fth a(kc $$0, fqe $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fty $$8 = new fty($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         $$8.a = true;
         return $$8;
      }
   }

   public static class b implements ftk<kc> {
      private final fuc a;

      public b(fuc $$0) {
         this.a = $$0;
      }

      public fth a(kc $$0, fqe $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fty $$8 = new fty($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         return $$8;
      }
   }
}
