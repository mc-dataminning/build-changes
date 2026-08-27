public interface dqo {
   void a(dqq var1, double var2);

   void a(dqq var1, double var2, double var4, long var6);

   void a(dqq var1, double var2, double var4);

   void a(dqq var1, int var2);

   void b(dqq var1, int var2);

   void b(dqq var1, double var2);

   void c(dqq var1, double var2);

   public static class a implements dqo {
      private final dqq a;

      public a(dqq $$0) {
         this.a = $$0;
      }

      @Override
      public void a(dqq $$0, double $$1) {
         this.a.a($$1);
      }

      @Override
      public void a(dqq $$0, double $$1, double $$2, long $$3) {
         this.a.a($$1, $$2, $$3);
      }

      @Override
      public void a(dqq $$0, double $$1, double $$2) {
         this.a.c($$1, $$2);
      }

      @Override
      public void a(dqq $$0, int $$1) {
         this.a.b($$1);
      }

      @Override
      public void b(dqq $$0, int $$1) {
         this.a.c($$1);
      }

      @Override
      public void b(dqq $$0, double $$1) {
         this.a.c($$1);
      }

      @Override
      public void c(dqq $$0, double $$1) {
         this.a.b($$1);
      }
   }
}
