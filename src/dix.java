public interface dix {
   void a(diz var1, double var2);

   void a(diz var1, double var2, double var4, long var6);

   void a(diz var1, double var2, double var4);

   void a(diz var1, int var2);

   void b(diz var1, int var2);

   void b(diz var1, double var2);

   void c(diz var1, double var2);

   public static class a implements dix {
      private final diz a;

      public a(diz $$0) {
         this.a = $$0;
      }

      @Override
      public void a(diz $$0, double $$1) {
         this.a.a($$1);
      }

      @Override
      public void a(diz $$0, double $$1, double $$2, long $$3) {
         this.a.a($$1, $$2, $$3);
      }

      @Override
      public void a(diz $$0, double $$1, double $$2) {
         this.a.c($$1, $$2);
      }

      @Override
      public void a(diz $$0, int $$1) {
         this.a.b($$1);
      }

      @Override
      public void b(diz $$0, int $$1) {
         this.a.c($$1);
      }

      @Override
      public void b(diz $$0, double $$1) {
         this.a.c($$1);
      }

      @Override
      public void c(diz $$0, double $$1) {
         this.a.b($$1);
      }
   }
}
