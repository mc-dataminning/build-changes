public interface dxc {
   void a(dxe var1, double var2);

   void a(dxe var1, double var2, double var4, long var6);

   void a(dxe var1, double var2, double var4);

   void a(dxe var1, int var2);

   void b(dxe var1, int var2);

   void b(dxe var1, double var2);

   void c(dxe var1, double var2);

   public static class a implements dxc {
      private final dxe a;

      public a(dxe $$0) {
         this.a = $$0;
      }

      @Override
      public void a(dxe $$0, double $$1) {
         this.a.a($$1);
      }

      @Override
      public void a(dxe $$0, double $$1, double $$2, long $$3) {
         this.a.a($$1, $$2, $$3);
      }

      @Override
      public void a(dxe $$0, double $$1, double $$2) {
         this.a.c($$1, $$2);
      }

      @Override
      public void a(dxe $$0, int $$1) {
         this.a.b($$1);
      }

      @Override
      public void b(dxe $$0, int $$1) {
         this.a.c($$1);
      }

      @Override
      public void b(dxe $$0, double $$1) {
         this.a.c($$1);
      }

      @Override
      public void c(dxe $$0, double $$1) {
         this.a.b($$1);
      }
   }
}
