public interface fnj {
   Object b = new Object();
   int c = 160;
   int d = 32;

   fnj.a a();

   void a(fnk var1, long var2);

   void a(fkm var1, fkk var2, long var3);

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
      return azj.e(this.c(), 32);
   }

   public static enum a {
      a(awk.AC),
      b(awk.AD);

      private final awj c;

      private a(final awj $$0) {
         this.c = $$0;
      }

      public void a(hcu $$0) {
         $$0.a(hbk.a(this.c, 1.0F, 1.0F));
      }
   }
}
