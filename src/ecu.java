public interface ecu {
   void a(ecw var1, double var2);

   void a(ecw var1, double var2, double var4, long var6);

   void a(ecw var1, double var2, double var4);

   void a(ecw var1, int var2);

   void b(ecw var1, int var2);

   void b(ecw var1, double var2);

   void c(ecw var1, double var2);

   public static class a implements ecu {
      private final ecw a;

      public a(ecw $$0) {
         this.a = $$0;
      }

      @Override
      public void a(ecw $$0, double $$1) {
         this.a.a($$1);
      }

      @Override
      public void a(ecw $$0, double $$1, double $$2, long $$3) {
         this.a.a($$1, $$2, $$3);
      }

      @Override
      public void a(ecw $$0, double $$1, double $$2) {
         this.a.d($$1, $$2);
      }

      @Override
      public void a(ecw $$0, int $$1) {
         this.a.b($$1);
      }

      @Override
      public void b(ecw $$0, int $$1) {
         this.a.c($$1);
      }

      @Override
      public void b(ecw $$0, double $$1) {
         this.a.c($$1);
      }

      @Override
      public void c(ecw $$0, double $$1) {
         this.a.b($$1);
      }
   }
}
