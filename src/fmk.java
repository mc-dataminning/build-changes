public interface fmk {
   Object b = new Object();
   int c = 160;
   int d = 32;

   fmk.a a();

   void a(fml var1, long var2);

   void a(fjn var1, fjl var2, long var3);

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
      return azc.e(this.c(), 32);
   }

   public static enum a {
      a(awd.AE),
      b(awd.AF);

      private final awc c;

      private a(final awc $$0) {
         this.c = $$0;
      }

      public void a(hbj $$0) {
         $$0.a(gzz.a(this.c, 1.0F, 1.0F));
      }
   }
}
