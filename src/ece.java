public interface ece {
   void a(ecg var1, double var2);

   void a(ecg var1, double var2, double var4, long var6);

   void a(ecg var1, double var2, double var4);

   void a(ecg var1, int var2);

   void b(ecg var1, int var2);

   void b(ecg var1, double var2);

   void c(ecg var1, double var2);

   public static class a implements ece {
      private final ecg a;

      public a(ecg $$0) {
         this.a = $$0;
      }

      @Override
      public void a(ecg $$0, double $$1) {
         this.a.a($$1);
      }

      @Override
      public void a(ecg $$0, double $$1, double $$2, long $$3) {
         this.a.a($$1, $$2, $$3);
      }

      @Override
      public void a(ecg $$0, double $$1, double $$2) {
         this.a.d($$1, $$2);
      }

      @Override
      public void a(ecg $$0, int $$1) {
         this.a.b($$1);
      }

      @Override
      public void b(ecg $$0, int $$1) {
         this.a.c($$1);
      }

      @Override
      public void b(ecg $$0, double $$1) {
         this.a.c($$1);
      }

      @Override
      public void c(ecg $$0, double $$1) {
         this.a.b($$1);
      }
   }
}
