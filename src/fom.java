public class fom extends fod {
   private final foq b;
   protected boolean a;

   fom(fkw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, foq $$7) {
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
   public fnz b() {
      return fnz.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
   }

   public static class a implements fny<jv> {
      private final foq a;

      public a(foq $$0) {
         this.a = $$0;
      }

      public fnv a(jv $$0, fkw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fom $$8 = new fom($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         $$8.a = true;
         return $$8;
      }
   }

   public static class b implements fny<jv> {
      private final foq a;

      public b(foq $$0) {
         this.a = $$0;
      }

      public fnv a(jv $$0, fkw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fom $$8 = new fom($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         return $$8;
      }
   }
}
