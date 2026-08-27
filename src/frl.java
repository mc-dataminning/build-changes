public class frl extends frc {
   private final frp b;
   protected boolean a;

   frl(fnr $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, frp $$7) {
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
   public fqy b() {
      return fqy.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
   }

   public static class a implements fqx<ka> {
      private final frp a;

      public a(frp $$0) {
         this.a = $$0;
      }

      public fqu a(ka $$0, fnr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         frl $$8 = new frl($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         $$8.a = true;
         return $$8;
      }
   }

   public static class b implements fqx<ka> {
      private final frp a;

      public b(frp $$0) {
         this.a = $$0;
      }

      public fqu a(ka $$0, fnr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         frl $$8 = new frl($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         return $$8;
      }
   }
}
