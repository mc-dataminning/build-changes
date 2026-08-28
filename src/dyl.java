public interface dyl {
   void a(dyn var1, double var2);

   void a(dyn var1, double var2, double var4, long var6);

   void a(dyn var1, double var2, double var4);

   void a(dyn var1, int var2);

   void b(dyn var1, int var2);

   void b(dyn var1, double var2);

   void c(dyn var1, double var2);

   public static class a implements dyl {
      private final dyn a;

      public a(dyn $$0) {
         this.a = $$0;
      }

      @Override
      public void a(dyn $$0, double $$1) {
         this.a.a($$1);
      }

      @Override
      public void a(dyn $$0, double $$1, double $$2, long $$3) {
         this.a.a($$1, $$2, $$3);
      }

      @Override
      public void a(dyn $$0, double $$1, double $$2) {
         this.a.c($$1, $$2);
      }

      @Override
      public void a(dyn $$0, int $$1) {
         this.a.b($$1);
      }

      @Override
      public void b(dyn $$0, int $$1) {
         this.a.c($$1);
      }

      @Override
      public void b(dyn $$0, double $$1) {
         this.a.c($$1);
      }

      @Override
      public void c(dyn $$0, double $$1) {
         this.a.b($$1);
      }
   }
}
