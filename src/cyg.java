public interface cyg {
   cyg.a a = new cyg.a(false, false);
   cyg.a b = new cyg.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cyg {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cyg.a c() {
         return new cyg.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
