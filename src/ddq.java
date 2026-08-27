public interface ddq {
   void a(dds var1, double var2);

   void a(dds var1, double var2, double var4, long var6);

   void a(dds var1, double var2, double var4);

   void a(dds var1, int var2);

   void b(dds var1, int var2);

   void b(dds var1, double var2);

   void c(dds var1, double var2);

   public static class a implements ddq {
      private final dds a;

      public a(dds $$0) {
         this.a = $$0;
      }

      @Override
      public void a(dds $$0, double $$1) {
         this.a.a($$1);
      }

      @Override
      public void a(dds $$0, double $$1, double $$2, long $$3) {
         this.a.a($$1, $$2, $$3);
      }

      @Override
      public void a(dds $$0, double $$1, double $$2) {
         this.a.c($$1, $$2);
      }

      @Override
      public void a(dds $$0, int $$1) {
         this.a.b($$1);
      }

      @Override
      public void b(dds $$0, int $$1) {
         this.a.c($$1);
      }

      @Override
      public void b(dds $$0, double $$1) {
         this.a.c($$1);
      }

      @Override
      public void c(dds $$0, double $$1) {
         this.a.b($$1);
      }
   }
}
