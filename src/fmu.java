public interface fmu {
   Object b = new Object();
   int c = 160;
   int d = 32;

   fmu.a a();

   void a(fmv var1, long var2);

   void a(fjx var1, fjv var2, long var3);

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
      return azd.e(this.c(), 32);
   }

   public static enum a {
      a(awe.AE),
      b(awe.AF);

      private final awd c;

      private a(final awd $$0) {
         this.c = $$0;
      }

      public void a(hca $$0) {
         $$0.a(haq.a(this.c, 1.0F, 1.0F));
      }
   }
}
