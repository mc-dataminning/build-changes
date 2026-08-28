public interface dtw {
   void a(dty var1, double var2);

   void a(dty var1, double var2, double var4, long var6);

   void a(dty var1, double var2, double var4);

   void a(dty var1, int var2);

   void b(dty var1, int var2);

   void b(dty var1, double var2);

   void c(dty var1, double var2);

   public static class a implements dtw {
      private final dty a;

      public a(dty $$0) {
         this.a = $$0;
      }

      @Override
      public void a(dty $$0, double $$1) {
         this.a.a($$1);
      }

      @Override
      public void a(dty $$0, double $$1, double $$2, long $$3) {
         this.a.a($$1, $$2, $$3);
      }

      @Override
      public void a(dty $$0, double $$1, double $$2) {
         this.a.c($$1, $$2);
      }

      @Override
      public void a(dty $$0, int $$1) {
         this.a.b($$1);
      }

      @Override
      public void b(dty $$0, int $$1) {
         this.a.c($$1);
      }

      @Override
      public void b(dty $$0, double $$1) {
         this.a.c($$1);
      }

      @Override
      public void c(dty $$0, double $$1) {
         this.a.b($$1);
      }
   }
}
