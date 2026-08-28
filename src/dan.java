public interface dan {
   dan.a a = new dan.a(false, false);
   dan.a b = new dan.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements dan {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public dan.a c() {
         return new dan.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
