public interface cny {
   cny.a a = new cny.a(false, false);
   cny.a b = new cny.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cny {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cny.a c() {
         return new cny.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
