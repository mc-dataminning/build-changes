public interface dle {
   void a(dlg var1, double var2);

   void a(dlg var1, double var2, double var4, long var6);

   void a(dlg var1, double var2, double var4);

   void a(dlg var1, int var2);

   void b(dlg var1, int var2);

   void b(dlg var1, double var2);

   void c(dlg var1, double var2);

   public static class a implements dle {
      private final dlg a;

      public a(dlg $$0) {
         this.a = $$0;
      }

      @Override
      public void a(dlg $$0, double $$1) {
         this.a.a($$1);
      }

      @Override
      public void a(dlg $$0, double $$1, double $$2, long $$3) {
         this.a.a($$1, $$2, $$3);
      }

      @Override
      public void a(dlg $$0, double $$1, double $$2) {
         this.a.c($$1, $$2);
      }

      @Override
      public void a(dlg $$0, int $$1) {
         this.a.b($$1);
      }

      @Override
      public void b(dlg $$0, int $$1) {
         this.a.c($$1);
      }

      @Override
      public void b(dlg $$0, double $$1) {
         this.a.c($$1);
      }

      @Override
      public void c(dlg $$0, double $$1) {
         this.a.b($$1);
      }
   }
}
