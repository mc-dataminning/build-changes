public interface dyk {
   void a(dym var1, double var2);

   void a(dym var1, double var2, double var4, long var6);

   void a(dym var1, double var2, double var4);

   void a(dym var1, int var2);

   void b(dym var1, int var2);

   void b(dym var1, double var2);

   void c(dym var1, double var2);

   public static class a implements dyk {
      private final dym a;

      public a(dym $$0) {
         this.a = $$0;
      }

      @Override
      public void a(dym $$0, double $$1) {
         this.a.a($$1);
      }

      @Override
      public void a(dym $$0, double $$1, double $$2, long $$3) {
         this.a.a($$1, $$2, $$3);
      }

      @Override
      public void a(dym $$0, double $$1, double $$2) {
         this.a.c($$1, $$2);
      }

      @Override
      public void a(dym $$0, int $$1) {
         this.a.b($$1);
      }

      @Override
      public void b(dym $$0, int $$1) {
         this.a.c($$1);
      }

      @Override
      public void b(dym $$0, double $$1) {
         this.a.c($$1);
      }

      @Override
      public void c(dym $$0, double $$1) {
         this.a.b($$1);
      }
   }
}
