public class fnh extends fmy {
   private final fnl b;
   protected boolean a;

   fnh(fjr $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fnl $$7) {
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
   public fmu b() {
      return fmu.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
   }

   public static class a implements fmt<jv> {
      private final fnl a;

      public a(fnl $$0) {
         this.a = $$0;
      }

      public fmq a(jv $$0, fjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fnh $$8 = new fnh($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         $$8.a = true;
         return $$8;
      }
   }

   public static class b implements fmt<jv> {
      private final fnl a;

      public b(fnl $$0) {
         this.a = $$0;
      }

      public fmq a(jv $$0, fjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fnh $$8 = new fnh($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         return $$8;
      }
   }
}
