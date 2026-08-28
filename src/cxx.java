public interface cxx {
   cxx.a a = new cxx.a(false, false);
   cxx.a b = new cxx.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cxx {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cxx.a c() {
         return new cxx.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
