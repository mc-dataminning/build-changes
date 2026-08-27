public interface djc {
   void a(dje var1, double var2);

   void a(dje var1, double var2, double var4, long var6);

   void a(dje var1, double var2, double var4);

   void a(dje var1, int var2);

   void b(dje var1, int var2);

   void b(dje var1, double var2);

   void c(dje var1, double var2);

   public static class a implements djc {
      private final dje a;

      public a(dje $$0) {
         this.a = $$0;
      }

      @Override
      public void a(dje $$0, double $$1) {
         this.a.a($$1);
      }

      @Override
      public void a(dje $$0, double $$1, double $$2, long $$3) {
         this.a.a($$1, $$2, $$3);
      }

      @Override
      public void a(dje $$0, double $$1, double $$2) {
         this.a.c($$1, $$2);
      }

      @Override
      public void a(dje $$0, int $$1) {
         this.a.b($$1);
      }

      @Override
      public void b(dje $$0, int $$1) {
         this.a.c($$1);
      }

      @Override
      public void b(dje $$0, double $$1) {
         this.a.c($$1);
      }

      @Override
      public void c(dje $$0, double $$1) {
         this.a.b($$1);
      }
   }
}
