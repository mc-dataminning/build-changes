public interface fqj {
   Object b = new Object();
   int c = 160;
   int d = 32;

   fqj.a a();

   void a(fqk var1, long var2);

   void a(fnl var1, fnj var2, long var3);

   default Object f() {
      return b;
   }

   default int b() {
      return 160;
   }

   default int c() {
      return 32;
   }

   default int g() {
      return bae.e(this.c(), 32);
   }

   public static enum a {
      a(axf.AW),
      b(axf.AX);

      private final axe c;

      private a(final axe $$0) {
         this.c = $$0;
      }

      public void a(hgg $$0) {
         $$0.a(hew.a(this.c, 1.0F, 1.0F));
      }
   }
}
