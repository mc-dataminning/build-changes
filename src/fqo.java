public interface fqo {
   Object b = new Object();
   int c = 160;
   int d = 32;

   fqo.a a();

   void a(fqp var1, long var2);

   void a(fnq var1, fno var2, long var3);

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
      a(axf.AX),
      b(axf.AY);

      private final axe c;

      private a(final axe $$0) {
         this.c = $$0;
      }

      public void a(hgl $$0) {
         $$0.a(hfb.a(this.c, 1.0F, 1.0F));
      }
   }
}
