public interface dah {
   dah.a a = new dah.a(false, false);
   dah.a b = new dah.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements dah {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public dah.a c() {
         return new dah.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
